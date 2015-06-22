#Watson Catalyst
An open source community for the development of extensions on the Watson platform to enable and accelerate the development of applications using Watson services. 

**These documents are drafts** - information in it is subject to change in major ways as we figure out what we want this community to look like at launch.

##About Us
**Mission**  
To empower and engage people to collaboratively develop open source software which
* augments Watson's capability,
* makes it easier develop Watson apps, and
* does cool things with Watson.

**Vision**  
A world where people collaboratively solve problems using Watson.

##Quick Start
*See also: [Quick Start](QuickStart.md)*

If you just want to download projects, you can easily get all available projects by downloading the Catalyst repository. You will need [Git](https://git-scm.com/downloads) installed. Note that this may take considerable time and space. See the full article for other options.

Launch a terminal or Git Bash. In your directory of choice, enter
```
git clone https://github.com/watson-catalyst/watson-catalyst.git
cd WatsonCatalyst
git submodule update --init --recursive
```
This will get you the most recent Catalyst releases of every project. Whenever you want to ensure you have the latest versions of every project, run
```
git pull https://github.com/watson-catalyst/watson-catalyst.git
git submodule update --init --recursive
```

##Contributing
*See also: [Contributing](contributing.md)*

Anyone may contribute to Catalyst. Feel free to clone projects, make changes, and create pull requests to project maintainers! 

##Structure
*See also: [Structure](Structure.md)*

Watson Catalyst is a community of independent open source projects. Each project is governed independently, but is held to certain standards. These [Community Standards](CommunityStandards.md) will be developed by the community as needed.

##Projects
* [JumpQA](https://github.com/watson-catalyst/jump-qa) - create ground truth from a corpus

##Libraries
* [ObjectIO](https://github.com/watson-catalyst/object-io) - easily read and write Java objects

##Coming Soon
* BaseProperties - a library to make using a configurable `.properties` file easier. Currently a part of JumpQA.
* NeuralNet - a library for creating and training neural networks. Currently a part of JumpQA.
* Corpus - a library for loading, manipulating, and running operations on corpora. Currently a part of JumpQA.

##Wishlist
*See also: [Wish List](Wishlist.md)*

We keep a wish list of tools we'd like people to work on, but have not yet started or added to Catalyst.

##Links
* [FAQ](FAQ.md)

##Licensing
Catalyst is licensed under the [Apache License Version 2.0](License.txt).

##Contact
Point of Contact: [ostools@us.ibm.com](mailto:ostools@us.ibm.com)

Moderators:
- [William Beason](mailto:wabeason@us.ibm.com)
