#Frequently Asked Questions

##New Projects

**Q:** Why do you recommend the MIT License?

**A:** In general because it is short, simple, and to the point. It has been used by many open source software projects.

We specifically recommed the Watson Catalyst subprojects use the MIT License to encourage project modularity. For example, some projects are written as libraries to be used by others, and the legal issues with open source software are much easier to deal with when every piece of code shares the same license.


**Q:** What documentation does my project need in order to be accepted?

**A:** At a minimum, your project should have a README.md with the following:
* installation/setup instructions,
* sample input and expected output, and
* contact information for the project maintainer.


##Approval Process

**Q:** Who approves projects and releases?

**A:** We have a rotating team of 8 members who meet regularly to review projects and code. The team is made of:
* 2 Watson Ecosystem team members
* 1 Watson Lab Services team member
* 1 Watson Core team member
* 4 Watson Partner team members

In order for a new project or release to be approved, it needs to be approved by at least 6 of 8 members.


##Dependencies
**Q:** I own Project A and want to use features in Project B. How do I do that?

**A:** First, review the license of the dependency to make sure there will be no legal issues. 

Then, add the dependency as a submodule. This can be done wherever is most convenient in your repository.

    git submodule add <link/to/ProjectB/repository>

This will create a static reference to the submodule which will not change with updates.


**Q:** I own Project A which depends on Project B. What happens if Project B is updated?

**A:** If you added the project as a submodule as described above, nothing. Submodule links are to specific commits, not the current state of the repository. The submodule state only changes when you manually update it or point it to a different commit.

We encourage projects to use the latest versions of their dependencies as on Watson Catalyst. We also discourage dependencies from breaking existing functionality except on major version updates. As long as your project does not rely on a bug in the dependency, it should work with future versions which have the same major version number.


**Q:** I own Project A made a branch of Project B with a cool new feature my project now depends on. Can I get that feature included in a future update with Project B?

**A:** Awesome! Absolutely. Contact the maintainer of Project B and make a pull request. If Project B has no maintainer (it is inactive), you can [email us](wabeason@us.ibm.com) to become the project maintainer.


##Project Maintainers
**Q:** What a project maintainer?

**A:** The project maintainer(s) are a group of people who are responsible for the upkeep of a project. Their contact information is listed on the README.md in the main directory of every active project.

A project maintainer's duties include
* responding to questions about using the project, examples, documentation,
* tracking bugs,
* reviewing pull requests, and
* contacting us to update the project's version on Catalyst.