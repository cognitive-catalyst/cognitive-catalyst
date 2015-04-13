package com.ibm.watson.ecosystem.util.gtt;


import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;

import sun.misc.BASE64Encoder;

public class GttApi {
  static class Question {
    private final String eTag;
    private final JsonNode node;
    
    public Question(JsonNode node, String eTag) {
      this.eTag = eTag;
      this.node = node;
    }
    
    public String getEtag() {
      return eTag;
    }
    
    public JsonNode getNode() {
      return node;
    }
  }
  
  static class Questions {
    private final int length;
    private final JsonNode questions;
    private final int start;
    private final int total;
    
    public Questions(JsonNode node) {
      length = node.get("length").getValueAsInt();
      questions = node.get("items");
      start = node.get("start").getValueAsInt();
      total = node.get("total").getValueAsInt();
    }
    
    public int getLength() {
      return length;
    }
    
    public JsonNode getQuestions() {
      return questions;
    }
    
    public int getStart() {
      return start;
    }
    
    public int getTotal() {
      return total;
    }
  }
  
  static final int INSTANCE = -1;
  static final String USER_PASS = "<user>:<password>";
  
  static final String URL = "https://watson.ihost.com/instance/" + INSTANCE + "/predeploy/workbench/api/questions/";
  static final String BASIC_AUTH = "Basic " +  new String(new BASE64Encoder().encode(USER_PASS.getBytes()));
  
  static final ExecutorService executor = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors() * 2);
  
  public static void main(String[] args) {
    long start = System.currentTimeMillis();
//    printQuestions();
//    updateAllQuestionsToStateApproved();
//    deleteAllQuestions();
    try {
      printQuestionsWithNoPauId();
    } catch (IOException e) {
      throw new RuntimeException("Error printing questions.", e);
    }
//    printQuestionsNotInStateApproved();
    long end = System.currentTimeMillis();
    System.out.println("Total time: " + ((end - start) / 1000) + " seconds.");
  }
  
  static void deleteAllQuestions() throws IOException {
    for (Questions questions = getQuestions(0); 
        questions.getQuestions().size() != 0; 
        questions = getQuestions(0)) {
      for (JsonNode question : questions.getQuestions()) {
        String id = question.get("id").getValueAsText();
        final Question q = getQuestionById(id);
        if (q == null) {
          continue;
        }
        executor.execute(new Runnable() {
          public void run() {
            try {
              deleteQuestion(q);
            }
            catch (IOException e) {
              e.printStackTrace();
            }
          }
        });
      }
    }
  }
  
  static void deleteQuestion(Question question) throws IOException {
    final String id = question.getNode().get("id").getValueAsText();
    final String eTag = question.getEtag();
    executor.execute(new Runnable() {
      public void run() {
        try {
          HttpURLConnection connection = createConnection(URL + id, "DELETE");
          connection.setRequestProperty("If-Match", eTag);
          int code = connection.getResponseCode();
          if (code != 204) {
            throw new IllegalStateException("Question " + id + " not deleted due to response code " + code);
          }
          System.out.println("Deleted question " + id);
        }
        catch (IOException e) {
          e.printStackTrace();
        }
      }
    });
    
  }
  
  static void updateAllQuestionsToStateApproved() throws IOException {
    for (Questions questions = getQuestions(0); 
        questions.getQuestions().size() != 0; 
        questions = getQuestions(questions.getStart() + questions.getLength())) {
      for (JsonNode question : questions.getQuestions()) {
        final String id = question.get("id").getValueAsText();
        final Question q = getQuestionById(id);
        if (q == null) {
          continue;
        }
        String state = q.getNode().get("state").getValueAsText();
        if ("APPROVED".equalsIgnoreCase(state)) {
          continue;
        }
        executor.execute(new Runnable() {
          public void run() {
            try {
              updateQuestionStateToApproved(q);
              System.out.println("Updated question " + id);
            }
            catch (Exception e) {
              e.printStackTrace();
            }
          }
        });
      }
    }
  }
  
  static HttpURLConnection createConnection(String address, String method) throws IOException {
    URL url;
    HttpURLConnection connection;
    try {
      url = new URL(address);
      connection = (HttpURLConnection)url.openConnection();
      connection.setDoOutput(true);
      connection.setRequestMethod(method);
    } catch (IOException e) {
      throw new IOException("Error using method " + method + " at address " + address, e);
    }
    connection.setRequestProperty("Authorization", BASIC_AUTH);
    connection.setRequestProperty("Accept", "application/json");
    connection.setRequestProperty("Content-Type", "application/json");
    return connection;
  }
  
  static Question getQuestionById(String id) throws IOException {
    HttpURLConnection connection;
    try {
      connection = createConnection(URL + id, "GET");
    } catch (IOException e) {
      throw new IOException("Error getting question with id " + id, e);
    }
    String eTag = connection.getHeaderField("ETag");
    try (InputStream is = connection.getInputStream()) {
      JsonNode node = new ObjectMapper().readValue(is, JsonNode.class);
      return new Question(node, eTag);
    }
    catch (Exception e) {
      e.printStackTrace();
      return null;
    }
  }
  
  static void updateQuestionStateToApproved(Question question) throws IOException {
    String id = question.getNode().get("id").getValueAsText();
    String predefinedAnswerUnit = question.getNode().get("predefinedAnswerUnit").getValueAsText();
    String json = "{\"state\":\"APPROVED\",\"bValidatePayload\":false,\"predefinedAnswerUnit\":\"" + predefinedAnswerUnit + "\"}";
    
    HttpURLConnection connection = createConnection(URL + id, "PUT");
    
    connection.setRequestProperty("If-Match", question.getEtag());
    try (OutputStream os = connection.getOutputStream()) {
      os.write(json.getBytes());
    } catch (IOException e) {
      throw new IOException("Error writing to ouput stream.", e);
    }
    
    int code;
    try {
      code = connection.getResponseCode();
    } catch (IOException e) {
      throw new IOException("Error getting response code.", e);
    }
    if (code != 204) {
      throw new IllegalStateException("Question " + id + " not updated due to response code " + code);
    }
  }
  
  static void printQuestions() throws IOException {
    for (Questions questions = getQuestions(0); 
        questions.getQuestions().size() != 0; 
        questions = getQuestions(questions.getStart() + questions.getLength())) {
      for (JsonNode question : questions.getQuestions()) {
        System.out.println(question);
      }
    }
  }
  
  static void printQuestionsWithNoPauId() throws IOException {
    int count = 0;
    for (Questions questions = getQuestions(0); 
        questions.getQuestions().size() != 0; 
        questions = getQuestions(questions.getStart() + questions.getLength())) {
      for (JsonNode question : questions.getQuestions()) {
        JsonNode pauId = question.get("predefinedAnswerUnit");
        if (pauId != null) {
          String value = pauId.getValueAsText();
          if (value != null && !value.isEmpty()) {
            continue;
          }
        }
        System.out.println("No PAU ID: id=\"" + question.get("id").getValueAsText() + "\", text=\"" + question.get("text").getValueAsText() + "\"");
        count++;
      }
    }
    System.out.println("A total of " + count + " questions did not have a PAU ID.");
  }
  
  static void printQuestionsNotInStateApproved() throws IOException {
    int count = 0;
    for (Questions questions = getQuestions(0); 
        questions.getQuestions().size() != 0; 
        questions = getQuestions(questions.getStart() + questions.getLength())) {
      for (JsonNode question : questions.getQuestions()) {
        JsonNode state = question.get("state");
        if (state != null) {
          String value = state.getValueAsText();
          if ("APPROVED".equalsIgnoreCase(value)) {
            continue;
          }
        }
        System.out.println("Not approved: " + question);
        count++;
      }
    }
    System.out.println("A total of " + count + " questions were not approved.");
  }
  
  static Questions getQuestions(int offset) throws IOException {
    HttpURLConnection connection;
    String fullURL = URL + "?offset=" + offset + "&pagesize=500";
    try {
      connection = createConnection(fullURL, "GET");
    } catch (IOException e) {
      throw new IOException("Error retreiving question with offset " + offset, e);
    }
    try (InputStream is = connection.getInputStream()) {
      JsonNode node = new ObjectMapper().readValue(is, JsonNode.class);
      System.out.println(node);
      return new Questions(node);
    } catch (IOException e) {
      throw new IOException("Error reading input stream from " + fullURL + " for question with offset " + offset, e);
    }
  }
  
}
