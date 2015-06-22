#Quick Start
This article is for people who want to use projects, but not necessarily contribute. If you would like to contribute to Catalyst or a project, see the [Contributing](Contributing.md) page.

To download projects, you will need [Git](https://git-scm.com/downloads) installed. To interact with Git, you will need a shell terminal. If you're on Windows, Git comes with Git Bash.

If you just want a `.zip` containing an individual project, go to the project's GitHub link on the [Projects](Projects.md) page. On the right, there is a **Download ZIP** button. Note that this will not contain any submodules.

To make full use of Catalyst you will want to become familiar with Git submodules.
- [Documentation](http://git-scm.com/docs/git-submodule)
- [Tutorial](https://git-scm.com/book/en/v2/Git-Tools-Submodules)

Essentially, once initialized you can use a submodule exactly as you would a normal repository.

##Downloading Everything
Note that this may take considerable time and space. In your terminal, go to the directory in which you want the Catalyst folder to be contained. Type:
```
git clone https://github.com/watson-catalyst/watson-catalyst.git --recursive-submodules
```
This will get you the most recent Catalyst releases of every project **and** all of their submodules, recursively.

##Updating Everything
This may take considerable time depending on how long it has been since you last updated everything. In the Catalyst root directory, type:
```
git pull https://github.com/watson-catalyst/watson-catalyst.git
git submodule update --init --recursive
```

##Getting Catalyst
For if you want to be able to download individual projects. In your terminal, go to the directory in which you want the Catalyst folder to be contained. Type:
```
git clone https://github.com/watson-catalyst/watson-catalyst.git
```
This will download the Catalyst repository but none of the Projects. 

##Downloading Individual Projects
Projects will initially show up as empty directories in your local Catalyst repository. To initialize one, type:
```
git submodule update --init ProjectName/
```

##Using Projects
Every project included in Catalyst is required to have documentation including installation instructions, working examples, and project maintainer contact information. See the project's README.md. If you have questions about using the project or find a bug, contact the maintainer.