# Getting Started
Here are your prerequisites:
    1. IntelliJ IDE
    2. A folder with [the Fabric example mod source code](https://github.com/FabricMC/fabric-example-mod)
    3. Knowledege of Java
    
Recommended:
    Minecraft Development plugin for IntelliJ IDE.
    
## 1. Modifying the `gradle.properties` file to fit your project.

Firstly, change the variable `archives_base_name` to contain your mods name (alphanumeric, replace spaces with hyphens). This will change the resulting `.jar` file to be your preferred name.
Next, change the `mod_version` variable to your version. Do this on every full release, following standard versioning rules (preferrably Semantic versioning, `MAJOR.minor.fix`, where `MAJOR` is complete rewrites, `minor` is complete new items/blocks/similar, and `fix` is bug fixes).

## 2. Importing the Gradle project file

Open IntelliJ and click File-->Open or click "Open or Import".
This will bring up a file explorer. Open the folder of your mod, then double-click `build.gradle` and click `Open as Project`.

Once you are in the project, navigate to `ExampleMod.java` and rename it to whatever you'd like. Also delete the `mixin` folder.
Next, refactor the package's name to your liking
Finally, change `fabric.mod.json`'s content as follows:

line 6: "Example Mod" to your mod name.
line 7: "This is an example description! Tell everyone what your mod is about!" to your description.
line 9: "Me!" to your name/nickname.
line 17: `assets/modid` to `assets/` and your modid.
line 22: `net.fabricmc.example.ExampleMod` to your package and "." and your main class name.
