#Contributing to Watson Catalyst
Thank you for your interest in contributing to Watson Catalyst!

Before contributing code to Watson Catalyst, you must first sign and send us the applicable Contributor License Agreement below:

* [Individual](Legal/watson-utilities-cla-individual.pdf)
* [Corporate](Legal/watson-utilities-cla-corporate.pdf)

Once we have your CLA on file, you may begin contributing!

##1 Contributing to a Project
Watson Catalyst is composed of a central repository with projects embedded as submodules. Each submodule is governed semi-independently. The central repository contains the latest approved release of each Watson Catalyst project. When a project wants to have a new official release, the release is tested and evaluated before being pulled to Catalyst, the central repository.

###1.1 Active Projects
Contact the project's maintainer. Maintainer contact information and contributor policies can be found in the README.md of the project's main directory.

###1.2 Inactive Projects
If a project has no maintainer, it is considered "inactive" and no official contributions or updates may be made. However, feel free to create your own branch of the project. If you want to become the new project maintainer, [email us](mailto:wabeason@us.ibm.com).

##2 Adding a Project
So you've got a project you'd like to add.

1. Create a Git respository and upload the source code. Feel free to host it anywhere.
2. Choose a non-GPL open source license and add it to your project. We recommend [the MIT License](License.txt).
3. [Provide us](mailto:wabeason@us.ibm.com) a link to your repository and the tag of the commit you would like included.
4. We'll review your project and let you know either
  1. your project was approved,
  2. what you need to do to get your project approved, or
  3. why we cannot include your project in Watson Catalyst.
5. Once approved, we will add your project to Catalyst.

###2.1 Concept Review
In considering whether to add a project to the Watson Catalyst project, we first consider the following:

* Does the project have something to do with Watson?
* Is the project universal? Does it depend on being used
  * by specific users,
  * with specific content,
  * with content in specific domains, or
  * on specific Watson instances?
* Is the project well designed? Does it
  * have the potential to unintentionally cause irreperable damage to an instance?
* Does the project have an active maintainer?

None of the above automatically disqualify a project, but in general there should be a compelling reason for not meeting any. If a project passes, then we review the code.

###2.2 Code Review
We check the following:

* Is the project documented and supported? Does it contain
  * installation instructions,
  * examples, and
  * maintainer contact information?
* Is the project's code clean? Does it contain
  * anything with a GPL license,
  * private client data, or
  * usernames or passwords?
* Does the project work?

If your project fails to meet any of the code review criteria, we will let you know how to make your project compliant. Once your project passes the code review, we will add your project to Watson Catalyst.

##3 Releasing a Project Update
You've got a project in Watson Catalyst, and would like to update it. In general, the more significant change, the longer this process will be.

1. Tag the commit you would like included in Watson Catalyst. We recommend doing this with a version number.
2. Write release notes including bug fixes, new features, and API changes. Determine whether your update is a **Patch**, **Minor**, or **Major** update. (see Versioning below) 
3. [Email us](mailto:wabeason@us.ibm.com) the commit's tag, release notes, and unit tests for new features.
4. We will run the unit tests for your project and test projects which depend on yours. We'll let you know either
  1. your release was approved,
  2. what you need to do to get your release approved, or
  3. why we cannot accept your release.
5. Once approved, we will update Watson Catalyst with your release.

###3.1 Versioning
We encourage our projects to follow [Semantic Versioning 2.0.0](http://semver.org/).

* **Patch** updates are when you fix bugs in existing functionality. We will verify that the bug has been fixed and that your project still works.
* **Minor** updates are when you add new functionality. We will verify that your project still works and that the new features work. We will review the code with new features.
* **Major** updates are when you want to update your project and make incompatible API changes. We will do a full code review and verify that your project works.



##4 Links
* [README](README.md)

