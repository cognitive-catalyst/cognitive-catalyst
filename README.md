#Watson Catalyst
Watson Catalyst is an open source community for the development of extensions on the Watson platform to enable and accelerate the development of applications using Watson services. 

**Mission**  
To empower and engage people to collaboratively develop open source software which
* augments Watson's capability,
* makes it easier develop Watson apps, and
* does cool things with Watson.

**Vision**  
A world where people collaboratively solve problems using Watson.

##1 Licensing
Catalyst is licensed under the Apache License Version 2.0.

##2 Structure
Watson Catalyst is a community of independent open source projects. Each project is governed mostly independently, but is held to certain standards of documentation and functionality. These are detailed in the [Community Standards](CommunityStandards.md). 

###2.1 Catalyst
This repository, Catalyst, contains the latest releases of all linked projects, a description of the Watson Catalyst project, and legal documents. 

###2.2 Projects
Each project falls into one of two categories, IBM-led and external-led. External-led projects may be started at any time by non-IBMers and hosted anywhere, but they must conform to the Catalyst Community Standards for the Catalyst repository to include them. For IBMers to contribute to external-led projects, we have an internal process to approve projects.

###2.3 Moderators
Moderators (listed at the end of this document) govern the community. They resolve disputes, accept new projects and releases, and liaison with IBM Watson teams. For now IBM will appoint moderators, but we intend the community to hold elections in early 2016 to elect new ones.

##3 Downloading Catalyst
To download the entire Catalyst repository, you will need [Git](https://git-scm.com/downloads) installed. Launch Git Bash.

In your directory of choice, enter
```
git clone path/to/repo
cd WatsonCatalyst
git submodule update --init --recursive
```
This will get you the most recent Catalyst releases of every project. Whenever you want to ensure you have the latest versions, run
```
git pull path/to/repo
git submodule update --init --recursive
```

##4 Using a Project
Each project in Watson Catalyst comes with documentation and working examples to get you started. See the README.md located in the project's main directory. If something doesn't work, contact the project's maintainer. You can find the maintainer's contact information in the project's README.md.

##5 Projects List
* [JumpQA](JumpQA/README.md) - create ground truth from a corpus

###5.1 Coming Soon
[A list of upcoming releases]

##6 Links
* [FAQ](faq.md)
* [Contributing](Contributing.md)

Point of Contact: [ostools@us.ibm.com](mailto:ostools@us.ibm.com)

Moderators:
- [William Beason](mailto:wabeason@us.ibm.com)
- 
