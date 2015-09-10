#Creating a New Project (IBMers)
Thanks for wanting to create a new project for Catalyst! If you are not an IBMer, see [New Projects](NewProjects.md).

##Repository Name Guidelines
You don't have to follow these if you don't want to, but they do make it easier to work with your repository.
- use lower case
- use dashes to separate words
- be specific (so you can differentiate between similar ideas)
- be consistent (think about how you'll find your repository later)

##Creating your Repository
**Unless already approved by the OSSC, Ecosystem projects must be kept in private repositories in the Cognitive Catalyst organization until public release.**

Since (1) Catalyst hasn't been released yet and (2) we don't have a fast track set up for Catalyst projects, this is the only way we may start a new repository for a Catalyst project. 

1. Send [joshua.hall@us.ibm.com](mailto:joshua.hall@us.ibm.com) the name you want your repository to have.
2. Joshua Hall will create your repository and let you know when it's ready. You'll be added as an admin of that repository.

We'll keep your project in a private repository until your project is approved by the OSSC. Additionally, please review the guidelines here for securing the appropriate approval [here] (https://w3-connections.ibm.com/wikis/home?lang=en-us#!/wiki/W783ba5fa6c1a_40b3_945a_07d0eb0115bd/page/Posting%20Samples%20%26%20Product%20usage%20Examples)

##Getting your project in Catalyst
1. [Create an issue](https://github.com/cognitive-catalyst/cognitive-catalyst/issues) to have your project added. Be sure to provide a link to your repository!
2. We will review your project and evaluate it using the [Community Standards](CommunityStandards.md). The `moderators` will give you feedback by commenting on your issue. If you have questions, feel free to ask them in a comment or an email to [joshua.hall@us.ibm.com](mailto:joshua.hall@us.ibm.com).
3. Once we've agreed to move forward, we'll add your project by including it as a submodule in the Catalyst repository.

##Committing Rules
For Catalyst, we're using a [Developer Certificate of Origin](http://elinux.org/Developer_Certificate_Of_Origin) to make sure all code additions to the repository are licensed properly. Here's the procedure we've come up with:

1. Do not commit directly to the `master` branch of your project.
2. Create a branch of your own and commit to it as you wish.
3. To get changes onto the `master` branch, do so with a pull request.
4. Include the line `DCO 1.1 Signed-off-by: {Full Name} <{email address}>` (without the {}) at the bottom of your pull request message.

If you forget to include the DCO line, note that you can edit the pull request even after it's been closed.
