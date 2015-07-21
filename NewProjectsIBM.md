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

1. Send [wabeason@us.ibm.com](mailto:wabeason@us.ibm.com) the name you want your repository to have.
2. Will Beason will create your repository and let you know when it's ready. You'll be added as an admin of that repository.

We'll keep your project in a private repository until both (1) Catalyst is released to the public and (2) your project is approved by the OSSC. We will try to get projects in Catalyst before release approved by the OSSC so they all will go live at once.

If your project gets in after we submit the OSSC proposal, you will have to wait until the OSSC approves it in order to make the repository public. Once we have a fast track set up with the OSSC, we will update this document.

##Getting your project in Catalyst
1. [Create an issue](https://github.com/watson-catalyst/watson-catalyst/issues) to have your project added. Be sure to provide a link to your repository!
2. We will review your project and evaluate it using the [Community Standards](CommunityStandards.md). The `moderators` will give you feedback by commenting on your issue. If you have questions, feel free to ask them in a comment or an email to [wabeason@us.ibm.com](mailto:wabeason@us.ibm.com).
3. Once we've agreed to move forward, we'll add your project by including it as a submodule in the Catalyst repository.

##Committing Rules
For Catalyst, we're using a [Developer Certificate of Origin](http://elinux.org/Developer_Certificate_Of_Origin) to make sure all code additions to the repository are licensed properly. Here's the procedure we've come up with:

1. Do not commit directly to the `master` branch of your project.
2. Create a branch of your own and commit to it as you wish.
3. To get changes onto the `master` branch, do so with a pull request.
4. Include the line `DCO 1.1 Signed-off-by: {Full Name} <{email address}>` (without the {}) at the bottom of your pull request message.

If you forget to include the DCO line, note that you can edit the pull request even after it's been closed.
