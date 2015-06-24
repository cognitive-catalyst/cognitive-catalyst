#Frequently Asked Questions

##New Projects

**Q:** Why do you recommend the Apache License?

**A:** In general because it is a non-public license which IBM is very familiar with.

We specifically recommend the Watson Catalyst projects use the Apache License to encourage project modularity. For example, some projects are written as libraries to be used by others, and the legal issues with open source software are much easier to deal with when every piece of code shares the same license.

We require a line in all pull requests stating acknowledgment with [DCO 1.1](http://elinux.org/Developer_Certificate_Of_Origin), and this makes

**Q:** What is required of new Catalyst projects?

**A:** This is something the community will hash out, but to start we have some general guidelines to start.

1. The project must have an open source license
2. There should be an active project maintainer
3. The project should have enough documentation to get a new user or developer started 
4. The project should either have something to do with Watson or be a dependency of a Catalyst project

##Governance

**Q:** Is this community governed by IBM?

**A:** For the moment, yes.

We want to community to take the reins as soon as possible. If you are interested in joining us to help lead Catalyst during its infancy, [let us know](ostools@us.ibm.com).

**Q:** What is a project maintainer?

**A:** Each project has an individual or group who are responsible for the upkeep of a project.

A project maintainer's duties include
* responding to questions about using the project, examples, documentation,
* tracking and resolving bugs,
* reviewing pull requests,
* monitoring contributions and requesting CLAs as necessary, and
* contacting us to update the project's version on Catalyst.

##Private APIs

**Q:** What are the "private APIs"?

**A:** The private APIs are a set of unsupported APIs, generally for doing administrative tasks on instances for Watson services.

To take the Q&A service as an example, this includes functions such as ingesting documents and adding new training questions.


**Q:** Why may Catalyst projects not use private APIs?

**A:** The IBM teams in charge of the private APIs do not currently support them.

The APIs have not been tested for security and stability, and they are subject to major unannounced changes. The private API developers don't want to be locked into a specific set of APIs or functions at this stage in development.


**Q:** Will it ever be okay for projects to use the private APIs?

**A:** We hope so.

Using the private APIs has greatly enabled IBMers and Watson partners (whom either IBM has told or who have figured them out on their own). There are at least 20 projects internal to IBM which are waiting on private API support before being open sourced. If you are a partner and want the private APIs to be supported and/or you have a project you'd like in Catalyst which uses the private APIs, [let us know](ostools@us.ibm.com) since it will give us more leverage in discussions with the IBM teams who develop and maintain the APIs.