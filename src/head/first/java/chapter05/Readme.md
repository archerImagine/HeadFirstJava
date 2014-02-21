Head First Java Chapter 05
=
This is the fifth Chapter learning of **Head First Java** by **Kathy Sierra** and **Bert Bates**, 
This markdown file is my notes for the fifth chapter, not sure if any copyright issues are there.

###Developing a Class.
* Figure out what the class is supposed to do.
* List the **instance variables and methods**.
* Write **prepcode** for the methods.
* Write **test code** for the methods.
* **Implement** the class.
* **Test** the methods.
* **Debug** and **reimplement** as needed

###for Loops.
####Regular (non-enhanced) for loops.
````java
for(int i =0; i < 100; i++)
````
#####Part One: initialization.
````java
int i =0;
````

#####Part two: boolean test.
````java
i < 100;
````
#####Part three: iteration expression
````java
i++;
````
####The enhanced for loop
````java
for(String name : nameArray){}
````
#####Part One: iteration variable declaration.
````java
String name
````

#####Part two: The Actual collection
````java
nameArray
````



Bullet Points
-
* Your java program should start with a high level design.
* Typically you'll write three things when you create a new class:
 * **prepcode**
 * **testcode**
 * **real(java) code.**
* Prepcode should descibe *what* to do, not *how* to do it. Implementation comes later.
* Use the prepcode to help design the test code.
* Write test code *before* you implement the methods.
* Choose *for* loops over *while* loops when you know how many times you want to repeat the loop code.
* Use the pre/post increment operator to add 1 to a variable (x++)
* Use the pre/post decrement operator to subtract 1 from a variable (x--).
* Use **Integer.parseInt()** to get the int value of a string.
* **Integer.parseInt()** works only if the String represents a digit ("0","1", etc).
* Use *break* to leave a loop early.