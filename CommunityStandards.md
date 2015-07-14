# Catalyst Community Standards

These are the standards to which we hold all Catalyst projects. For now, this is a first draft of what should be a living document. If you think something should be changed [drop us a note](mailto:wabeason@us.ibm.com)!

## Guiding Principles
- Catalyst projects provide benefit to the use of Watson
- Catalyst projects are easily usable by anyone, anywhere

##1 Minimum Requirements
Failing to meet any of these requirements are grounds for the rejection of new projects or removal from Catalyst.

##1.1 Licensing
- [ ] Projects must have an open source license.
- [ ] All pull requests and commits to branches intended for release must acknowledge the [Developer Certificate of Origin](http://elinux.org/Developer_Certificate_Of_Origin) by including the one liner: `DCO 1.1 Signed-off-by: {Full Name} <{email address}>` (without the {}).

##1.2 Documentation
Projects must have documentation including the following:
- [ ] a description of what the project does,
- [ ] step-by-step installation/building/usage instructions, and
- [ ] a working example with input and expected output.

##1.3 Concept and Functionality
A Catalyst project must meet the following standards:
- [ ] The project should make it easier to develop Watson-powered apps. It should do one of:
  - [ ] automate tasks,
  - [ ] simplify tasks,
  - [ ] facilitate integration for a Watson service, or
  - [ ] act as a library for another Catalyst project.
- [ ] The project is universal. It is not only usable by specific users, with specific content, or on specific Watson instances.
- [ ] The project does not use the unsupported private APIs
- [ ] The project is unlikely to cause unintentional irreparable damage to an instance.

##1.4 Support
- [ ] Projects must have at least one maintainer, someone who
  - [ ] responds to questions about the project,
  - [ ] tracks and resolves issues,
  - [ ] reviews and accepts pull requests, and
  - [ ] contacts moderators to update the project in the Catalyst repository.

#2 Best Practices
We recommend projects follow these guidelines, but do not require it. We believe following these will ease collaboration and community expansion.

##2.1 Licensing
We recommend the Apache or the Eclipse Public License.

##2.2 Documentation
Projects are encouraged have a road map of future developments and bug fixes. Release notes should cover the major changes and bug fixes. Project READMEs should include discussion of which Watson services they help with or use, and how.

##2.3 Code
If a project's language is in the Google Style Guide, the project is encouraged to conform to those standards. Having a common style makes it easier for contributors to contribute to several projects.

Projects should handle exceptions and provide useful error messages or logs.

##2.4 Concept and Functionality
If possible, projects should be modular and easily usable as dependencies.

##2.5 Versioning
Projects are strongly encouraged to follow Semantic Versioning 2.0.0 (http://semver.org/) and tag releases with version numbers. In the event of inter-project dependencies, this will help maintain sanity.