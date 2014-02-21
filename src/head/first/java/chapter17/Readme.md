Head First Java Chapter 17
=
This is the Seventeenth Chapter learning of **Head First Java** by **Kathy Sierra** and **Bert Bates**, 
This markdown file is my notes for the Seventeenth chapter, not sure if any copyright issues are there.

Package, jars and deployment
-

### JAR
* Organize your project so that your source code and class files are not in the same directory.
* A standard organization structure is to create a *project* directory, and then put a *source* directory and a *classes* directory inside the project directory.
* Organizing your classes into packages prevents naming collisions with other classes, if you prepend your reverse domain name on to the front of a class name.
* To put a class in a package, put a package statement at the top of the source code file, before import statements.

````java
package com.wickedlysmart;
````
* To be in a package, a class must be in a *directory structure that exactly matches the package structure*. For a class, com.wickedlysmart.Foo, the Foo Class must be in a directory name wickedlysmart, which is in a directory name com.
* To make your compiled class land in the correct package directory structure under the *classes* directory, use the **-d** compiler flag:

````java
% cd sources
% javac -d ../classes com/wickedlysmart/Foo.java
````  


* To run your code, cd to the classes directory, and give the fully-qualified name of your class.

````java
% cd classes
% java com.wickedlysmart.Foo
````  

* You can bundle your classes into JAR(Java ARchive) files. JAR is based on the pkzip format.
* You can make an executable JAR file by putting a manifest into the JAR that states which class has the main() method. To create a manifest file, make a text file with an entry like the following (for example):

````java
Main-Class: com.wickedlysmart.Foo
````
* Be sure to hit the return key after typing the Main-Class line, or your manifest may not work.
* To create a JAR file, types:

````java
jar -cvfm manifest.txt MrJar.jar com
````

* The entire package directory structure (and only the directories matching the package) must be immediately inside the JAR file.
* To run an executable JAR file, type:

````java
java -jar MyJar.jar
````

### Java Web Start
* Java Web Start technology lets you deploy a stand-alone client application for the web.
* Java Web Start includes a 'helper app' that must be installed on the client (along with java).
* A Java Web Start (JWS) app has two pieces: and executable JAR and a .jnlp file.
* A .jnlp file is a simple XML document that describes your JWS application. It includes tags for specifying the name and location of the JAR, and the name of the class with the main() method.
* When a browser gets a .jnlp file from the server (because the user clicked on a link to the .jnlp file), the browser start up the JWS helper app.
* The JWS helper app reads the .jnlp file and request the executable JAR from the Web server.
* When the JWS gets the JAR, it invokes the main() method (specified in the .jnpl file).