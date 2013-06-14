stackmob-customcode-java-starter
================================

## Overview

Custom Code Starter project that has all Maven files, folder structures, and EntryPointExtender.java ready.  

## Run

You can get your code running on StackMob in two ways:

* running via a JAR
* running via GitHub

### Running via a JAR

To build a JAR, run `mvn package` from the root folder.  You can then <a href="https://dashboard.stackmob.com/module/customcode/upload" target="_blank">Upload your JAR to StackMob</a>, where we'll load your method into your Development environment automatically.

### Running via GitHub

If you fork this repository, you can <a href="https://dashboard.stackmob.com/module/customcode/upload_github" target="_blank">link your Custom Code GitHub repository to StackMob</a>.  StackMob will build your project for you and load your methods into your Development environment automatically.

## Moving EntryPointExtender.java

Do you want a different folder structure for your Java files?  You will need to modify `pom.xml` and keep `EntryPointExtender.java`.

Locate `<mainClass>com.stackmob.customcode.EntryPointExtender</mainClass>`  (line 78) in your `pom.xml`.  Be sure to update it to the new location of your EntryPointeExtender.java, if you've moved it.
