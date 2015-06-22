#Contributing to Watson Catalyst
Thank you for your interest in contributing to Watson Catalyst! If you are an IBMer, [see here](ContributingIBMers.md). For most cases you do not have to sign a CLA in order to begin contributing.

Contributing to Catalyst can be made more organized by using [submodules](https://git-scm.com/book/en/v2/Git-Tools-Submodules). These are located in the Projects and Libraries subdirectories of Catalyst that act as a Git repository-within-a-repository. Submodule directories are initially empty; you'll want to see the [Quick Start](QuickStart.md) page for getting submodules set up. You can, of course, clone individual projects wherever you wish instead.

##CLAs
As above, you are generally **not** required to sign a CLA in order to contribute to Catalyst or any of its projects. If you make significant contributions to a particular organization's projects, it is the organization's responsibility to let you know that you should sign and send them a CLA. 

* [Individual IBM CLA](Legal/ibm-cla-individual.pdf)
* [Corporate IBM CLA](Legal/ibm-cla-corporate.pdf)

If you have any questions, see the [FAQ](faq.md) or contact us at [ostools@us.ibm.com](ostools@us.ibm.com). If you represent an organization with projects in Catalyst and would like your CLA included, let us know.

##Contributing to an existing Project
**Situation**: You want changes you've made to a project to be included in its master branch.

1. Read the project's README.md. 
2. If there is an active maintainer, contact the maintainer and make a [pull request](https://help.github.com/articles/using-pull-requests/). If there is no maintainer, feel free to fork the project and [email us](mailto:ostools@us.ibm.com) to become the new maintainer.

##Adding a Project
**Situation**: You've got a project you'd like to add.

Awesome!
1. Create a Git respository and upload the source code. Feel free to host it anywhere.
2. Choose an open source license and add it to your project. We recommend using the Apache, MIT, BSD, or Eclipse Public License.
3. [Tag](http://git-scm.com/book/en/v2/Git-Basics-Tagging) the commit you would like included.
4. [Email us](mailto:ostools@us.ibm.com) a link to your repository and the tag of the commit you wish to be considered.
5. We'll review your project and make sure it meets the [Community Standards](CommunityStandards.md). We will then let you know either
  1. your project was approved,
  2. what you need to do to get your project approved, or
  3. why we cannot include your project in Watson Catalyst.
6. Once approved, we will add your project to Catalyst.

##Releasing a Project Update
**Situation**: You already have a project in Catalyst and would like the new release to be included in Catalyst.

1. [Tag](http://git-scm.com/book/en/v2/Git-Basics-Tagging) the specific commit of the release.
2. [Email us](mailto:ostools@us.ibm.com) the tag you would like us to point to. 

##Getting OSSC Approval
**Situation**: You are the maintainer of a project which does not have OSSC approval, but would like IBMers to be able to contribute to your project.

1. [Contact us](ostools@us.ibm.com) and let us know you'd like IBMers to be able to contribute to your project.
2. We will work with IBM's Open Source Steering Committee to get approval. If any changes need to be made to your project, we will let you know.

##Links
* [README](README.md)
* [Community Standards](CommunityStandards.md)
* [FAQ](FAQ.md)
* [Pull requests](https://help.github.com/articles/using-pull-requests/)
* [Tagging Commits](http://git-scm.com/book/en/v2/Git-Basics-Tagging)

