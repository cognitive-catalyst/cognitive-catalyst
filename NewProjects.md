#Creating a New Project
Thanks for wanting to create a new project for Catalyst! If you are an IBMer, see [New Projects (IBMers)](NewProjectsIBM.md).

##Repository Name Guidelines
You don't have to follow these if you don't want to, but they do make it easier to work with your repository.
- use lower case
- use dashes to separate words
- be specific (so you can differentiate between similar ideas)
- be consistent (think about how you'll find your repository later)

##Creating your Repository
1. Create a git repository for your project on any Git hosting site.
2. Upload your code (see committing rules below).
3. [Make a release](https://help.github.com/articles/creating-releases/) to have included in Catalyst. ([Tag it](https://help.github.com/articles/working-with-tags/)!)

##Getting your project in Catalyst
1. [Create an issue](https://github.com/watson-catalyst/watson-catalyst/issues) to have your project added. Be sure to provide a link to your repository!
2. We will review your project and evaluate it using the [Community Standards](CommunityStandards.md). The `moderators` will give you feedback by commenting on your issue. If you have questions, feel free to ask them in a comment or an email to [joshua.hall@us.ibm.com](mailto:joshua.hall@us.ibm.com).
3. Once we've agreed to move forward, we'll add your project by including it as a submodule in the Catalyst repository.

##Committing Rules
For Catalyst, we're using a [Developer Certificate of Origin](http://elinux.org/Developer_Certificate_Of_Origin) to make sure all code additions to the repository are licensed properly. Here's the procedure we've come up with:

1. Do not commit directly to the `master` branch of your project.
2. Create a branch of your own and commit to it as you wish.
3. To get changes onto the `master` branch, do so with a pull request.
4. Include the line `DCO 1.1 Signed-off-by: {Full Name} <{email address}>` (without the {}) at the bottom of your pull request message.

If you forget to include the DCO line, note that you can edit the pull request even after it's been closed.

##IBM Contributions
For IBMers to contribute to your project, it will need to be approved by IBM's Open Source Steering Committee. You don't have to do anything for this - Catalyst `Moderators` will work on it once your project has been accepted into Catalyst. See [New Projects (IBMers)](NewProjectsIBM.md).
