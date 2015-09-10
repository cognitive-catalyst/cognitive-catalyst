#Cognitive Catalyst
An open source community for the development of extensions on the Watson platform to enable and accelerate the development of applications using Watson services. 

**These documents are drafts** - information in it is subject to change in major ways as we figure out what we want this community to look like at launch.

##About Us
**Mission**  
To empower and engage people to collaboratively develop open source software which
* Augments Watson's capability,
* Makes it easier develop appplications powered by IBM Watson
* Develop cool things with Watson.

**Vision**  
A world where people collaboratively solve problems using Watson.

##Quick Start
*See also: [Quick Start](QuickStart.md)*

If you just want to download projects, you can easily get all available projects by downloading the Catalyst repository. You will need [Git](https://git-scm.com/downloads) installed. Note that this may take considerable time and space. See the full article for other options.

Launch a terminal or Git Bash. In your directory of choice, enter
```
git clone https://github.com/cognitive-catalyst/cognitive-catalyst.git
cd cognitive-catalyst
git submodule update --init --recursive
```
This will get you the most recent Catalyst releases of every project. Whenever you want to ensure you have the latest versions of every project, run
```
git pull https://github.com/cognitive-catalyst/cognitive-catalyst.git
git submodule update --init --recursive
```

##Contributing
*See also: [Contributing](contributing.md)*

Anyone may contribute to Catalyst. Feel free to clone projects, make changes, and create pull requests to project maintainers! 

##New Projects
Anyone may contribute a new project to Catalyst. If you're interested in starting a new Catalyst project, we've got guidelines to follow. It is a little more complicated to start a new project if you are an IBMer, so we've got those instructions in a separate document.

* [New Projects](NewProjects.md)
* [New Projects (IBMers)](NewProjectsIBM.md)

##Structure
*See also: [Structure](Structure.md)*

Cognitive Catalyst is a community of independent open source projects. Each project is governed independently, but is held to certain standards. These [Community Standards](CommunityStandards.md) will be developed by the community as needed.

##Projects
* [JumpQA](https://github.com/cognitive-catalyst/jump-qa) - create ground truth from a corpus
* [Q&A Safe Strings](https://github.com/cognitive-catalyst/qa-safe-strings) - convert Unicode strings to Watson-safe ASCII
* [Document Segmenter](https://github.com/cognitive-catalyst/document-segmenter) - A configurable segmenter to help break large sections (PAUs) into smaller ones for ingestion
* [XML-HTML Converter](https://github.com/cognitive-catalyst/xml-to-html) - convert XML to HTML

##Libraries
* [Object IO](https://github.com/cognitive-catalyst/object-io) - easily read and write Java objects

##Coming Soon
*See also: [Coming Soon](ComingSoon.md)*

There are currently 6 upcoming projects and 3 upcoming libraries.

##Wish List
*See also: [Wish List](Wishlist.md)*

We keep a wish list of tools we'd like people to work on, but have not yet started or added to Catalyst.

##Links
* [FAQ](faq.md)
* [License](LICENSE.md)
* [Changelog](CHANGELOG.md)

##Contact
Point of Contact: [joshua.hall@us.ibm.com](mailto:joshua.hall@us.ibm.com)

Moderators:
- [Joshua Hall](mailto:joshua.hall@us.ibm.com)
