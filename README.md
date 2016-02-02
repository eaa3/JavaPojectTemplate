# Java Project Template

## Summary

This is a simple java project template following a simple project organisation style. The project is composed of a few packages, and each package can have a number of java classes. In this simple project we assume to have a single main class, which can be found in test_package. This project also contains a sample build_script file that builds the whole source code containted in src for all packages, putting the generated .class files inside a build folder in the project root directory.

## Building

In order to build the project you simply need to run the following command from the project root directory:

```
soure build_script.bash
```

This will generate a build folder, in case it is not already there, and build all project's .java files, putting the generated .class files into the build folder.

## Running the project

To run the project you need to go to the build folder:
```
cd build
```

Then you call the java command specifying the "main_class_package"."main_class_name":

```
java test_package.Test
```





