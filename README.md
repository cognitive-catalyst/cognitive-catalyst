#Watson Catalyst
Watson Catalyst is an open source project for the collaborative development of projects built around Watson.

**Mission**  
To empower and engage people to collaboratively develop open source software which
* augments Watson's capability,
* makes it easier develop Watson apps, and
* does cool things with Watson.

**Vision**  
A world where people collaboratively solve problems using Watson.

##1 Structure
The Watson Catalyst project operates on two tiers:
1. Catalyst, the main repository, and
2. Subprojects.

###1.1 Catalyst
The Catalyst repository contains the latest IBM-approved releases of projects in the Watson Catalyst project.

1. If you're getting started and want to see what Watson Catalyst has to offer, have a look through the Projects List below.
2. If you want to dive in and download the entire repository, use:  
       git clone --recursive https://hub.jazz.net/git/willbeason/Watson.Utilities
3. (IN THE FUTURE) If you just want a specific tool, use:  
       git clone https://hub.jazz.net/git/willbeason/Watson.Utilities
       cd Watson.Utilities
       cd <project directory>
       submodule update --recursive

###1.2 Subprojects
Subprojects are where the development happens. Each is governed semi-independently and makes regular releases to Catalyst. They are required to meet certain standards such as documentation, code style, and functionality. If you're interested in contributing to a Watson Catalyst project, see [our contributing page](contributing.md).

##2 Using a Tool
Each project in Watson Catalyst comes with documentation and working examples to get you started. See the README.md located in the project's main directory. If something doesn't work, contact the project's maintainer. You can find the maintainer's contact information in the project's README.md.

##3 Projects List
* [QImport](QImport/README.md) - upload a CSV of questions to an instance

###3.1 Coming Soon
* Credentials - a library for handling Watson instance credentials
* WEA Toolkit - a set of browser-based tools for managing corpora and ground truth

##4 Links
* [FAQ](faq.md)
* [Contributing](contributing.md)

Point of Contact: [wabeason@us.ibm.com](mailto:wabeason@us.ibm.com)
