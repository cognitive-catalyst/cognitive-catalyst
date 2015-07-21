#Contributing to Cognitive Catalyst
This document mostly deals with how contributing to Catalyst projects. Unless you are a moderator or project maintainer, you probably won't be making pull requests to **this** repository. Most changes to the Catalyst repository concern updating links to current Catalyst projects and the documentation (like this).

If you're interested in starting a new Catalyst project, see [New Projects](NewProjects.md) if you are not an IBMer or [New Projects (IBMers)](NewPRojectsIBM.md) if you are. 

Even after reading this, you'll still want to look at a project's CONTRIBUTING.md before contributing to see if they do anything differently. In most cases the documents should be very similar.

##Navigating the Repository
The main folder is `projects`, which contains all of the repositories as submodules. You can use submodules as regular Git repositories, but it is easier to just clone the individual repository.

##Submitting Issues
- Before creating a new issue, [do a quick search](https://github.com/cognitive-catalyst/cognitive-catalyst/issues?utf8=✓&q=is%3Aissue+user%3Acognitive-catalyst) to see if someone else has already submitted the issue.
- You can create issues [here](https://github.com/cognitive-catalyst/cognitive-catalyst/issues?utf8=✓&q=)
- Make your issue titles descriptive. Explain at a high level what the issue is about and use the [Git commit message style](git-commit-messages).
- Include the version number of the project being used or viewed.
- Issues that have a number of sub-items that need to be completed should use [task lists](https://github.com/blog/1375%0A-task-lists-in-gfm-issues-pulls-comments) to track sub-items in the main issue comment.

##Pull Requests
- **Do not issue a pull request without first** 
  -  [ ] [submitting an issue](#submitting-issues),
  -  [ ] acknowledging and agreeing to the [Developer Certificate of Origin](#developer-certificate-of-origin)
  -  [ ] reaching an agreement to move forward with a `contributor` or an `owner`.
- Pull requests should reference their related issue(s). If the pull request closes an issue, [reference its closing from a commit message](https://help.github.com/articles/closing-issues-via-commit-messages/). Pull requests not referencing any issues will be closed.
- Make your pull request titles descriptive. Explain at a high level what the issue is about and use the [Git commit message style](#commit-messages).
- Update the [CHANGELOG](CHANGELOG.md) with the changes made by the pull request.

##Developer Certificate of Origin
All contributions to Cognitive Catalyst projects must be accompanied by acknowledgment of, and agreement to, the Developer Certificate of Origin, reproduced below. Acknowledgment of and agreement to the Developer Certificate of Origin must be included in the comment section of each contribution and must take the form of DCO 1.1 Signed-off-by: {Full Name} <{email address}> (without the {}). Contributions without this acknowledgment will be required to add it before being accepted. If a contributor is unable or unwilling to agree to the Developer Certificate of Origin, their contribution will not be included.

```
Developer Certificate of Origin
Version 1.1

Copyright (C) 2004, 2006 The Linux Foundation and its contributors.
660 York Street, Suite 102,
San Francisco, CA 94110 USA

Everyone is permitted to copy and distribute verbatim copies of this
license document, but changing it is not allowed.

Developer's Certificate of Origin 1.1

By making a contribution to this project, I certify that:

(a) The contribution was created in whole or in part by me and I
    have the right to submit it under the open source license
    indicated in the file; or

(b) The contribution is based upon previous work that, to the best
    of my knowledge, is covered under an appropriate open source
    license and I have the right under that license to submit that
    work with modifications, whether created in whole or in part
    by me, under the same open source license (unless I am
    permitted to submit under a different license), as indicated
    in the file; or

(c) The contribution was provided directly to me by some other
    person who certified (a), (b) or (c) and I have not modified
    it.

(d) I understand and agree that this project and the contribution
    are public and that a record of the contribution (including all
    personal information I submit with it, including my sign-off) is
    maintained indefinitely and may be redistributed consistent with
    this project or the open source license(s) involved.
```

##Commit Messages
- Use the present tense (`"Add feature"` not `"Added feature"`)
- Use the imperative mood (`"Fix bug"` not `"Fixes bug"`)
- Limit the first line to 72 characters or less
- If you haven't read it, take a look through [5 useful tips for a better commit message](https://robots.thoughtbot.com/5-useful-tips-for-a-better-commit-message).

##Branching Model
Feel free to add more branch prefixes for your own project.

- Branches must be made off of the most current `develop` branch from `git@github.com:cognitive-catalyst/cognitive-catalyst.git`
- Branch names should be descriptive and describe what is being done in that branch
- Pull requests must be made into our develop branch.
- The following branch prefixes should be used when creating a new branch:
  - `docs/` - updates to documentation
  - `feature/` - update to or new feature
  - `hotfix/` - fixes for bugs in a release
  - `release/` - for releases

##Creating a New Version
Versioning follows [Semantic Versioning 2.0.0](http://semver.org/). When creating a new version, issue a [pull request](pull-requests) from `develop` into `master` and create a new release branch off of `master` with the version's name, and create a new tag with `v` prefixed with the version's name from that branch.

For instance, when creating version `1.1.0`, start by merging `develop` into `master`, create a branch `release/1.1.0` from `master`, and create a tag `v1.1.0` from branch `release/1.1.0`.

###Maintaining the Changelog
The [CHANGELOG](CHANGELOG.md) should have a list of changes made for each version. They should be organized so additions come first, changes come second, and deletions come third. Version numbers should be 2nd level headers with the `v` in front (like a tag) and the date of the version's most recent update should be underneath in italics.

Changelog messages do not need to cover each individual commit made, but rather should have individual summaries of the changes made. Changelog messages should be written in the same style as Git commit messages.

##Copying This Document
If you want your project to have the same committing guidelines as stated here, feel free to copy and change it as you wish as long as you follow the [Creative Commons 4.0 License](https://creativecommons.org/licenses/by/4.0/).

##Attribution
Portions of this document were shamelessly copied from Sam Richard's [CONTRIBUTING.md document](https://github.com/IBM-Watson/design-guide/blob/develop/CONTRIBUTING.md) in the [Watson Design Guide](https://github.com/IBM-Watson/design-guide) and edited for the purposes of Cognitive Catalyst. Watson Design Guide documentation by [International Business Machines Corporation](http://www.ibm.com/us/en/) is licensed under a [Creative Commons Attribution 4.0 International License](http://creativecommons.org/licenses/by/4.0/). The license holder of the original document does not in any way endorse the changes made.
