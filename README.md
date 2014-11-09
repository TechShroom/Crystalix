Crystalix
==========
Crystalix is a mod written for Minecraft. It brings fresh concepts to Minecraft via highly dangerous and un-researched, unstable machines that suit nearly every need.
- [![Build Status](https://travis-ci.org/TechShroom/Crystalix.svg?branch=master)](https://travis-ci.org/TechShroom/Crystalix)
- [Minecraft Forum Thread (none yet)](#)
- [Website](http://techshroom.com/other/minecraft/mods/crystalix/)

Developing:
----------
Setup is slightly different depending on what system and IDE you use.
This assumes you know how to run gradle commands on your system.
The base command, `./gradlew` being used below is for \*nix based systems. For windows, this would simply change to `gradlew`.
Of course, if you don't need to use the wrapper (as in, you have Gradle installed on your system), you can simply go right to `gradle`.


1. Clone repository to an empty folder.
2. `cd` to the repository (folder where `src` and `resources` are located).
3. Run `./gradlew setupDecompWorkspace` to set up an environment.
4. Run `./gradlew eclipse` or `./gradlew idea` appropriately.
5. Open your IDE using the generated files (i.e., for IDEA, a Crystalix.ipr is generated in `./`)
6. Edit, run, and debug your new code.
7. Once it's bug free and working, you may submit it as a PR to the main repo.
