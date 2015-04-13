package com.ibm.watson.ecosystem.util.gtt;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;

public class GtProjects {
  
  public static String getProjectId(String projectName, HttpURLConnection connection) throws IOException {
    JsonNode projectsList;
    try {
      InputStream inStream = connection.getInputStream();
      projectsList = new ObjectMapper().readValue(inStream, JsonNode.class);
    } catch (IOException e) {
      throw new IOException("Error getting project ID for " + projectName, e);
    }
    
    if (!projectsList.isArray()) throw new IllegalStateException("Projects list is not an array.");
    
    for(int i=0; i < projectsList.size(); i++) {
      JsonNode project = projectsList.get(i);
      String projName = project.findValue("displayName").toString().replaceAll("\"","");
      if(projName.equals(projectName)) {
        String projectId = "$" + project.findValue("id").toString().replaceAll("\"","");
        return projectId;
      }
    }
    throw new RuntimeException("No project with name " + projectName);
  }
  
}
