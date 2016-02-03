# Java Project Template

## Requirements

The following instructions assume you are using some [Unix](https://en.wikipedia.org/wiki/Unix) based Operating System, e.g. Ubuntu, OSX, etc.

## Summary

This is a simple java project template following a simple project organisation style. The project is composed of a few packages, and each package can have a number of java classes. This project also contains a sample build_script file that builds the whole source code containted in src for all packages, putting the generated .class files inside a build folder in the project root directory.

## Building

In order to build the project you simply need to run the following command from the project root directory:

```
source build_script.bash
```

This will generate a build folder, in case it is not already there, and build all project's .java files, putting the generated .class files into the build folder.

## Running the project

To run the project you need to go to the build folder:
```
cd build
```

Then you call the java command specifying the "main_class_package"."main_class_name", for example:

```
java test_package.Test
```
or

```
java test_package.Test2
```




