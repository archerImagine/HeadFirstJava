Head First Java Chapter 01
=====
This is the first Chapter learning of **Head First Java** by **Kathy Sierra** and **Bert Bates**, This markdown 
file is my notes for the first chapter, not sure if any copyright issues are there.  
Syntax Fun:
---------
- Each statement must end in a semi colon.

  	```java  
		x = x + 1;
	```
- A single line comment begins with two forward slashes.  

	```java
		//this line is a comment
	```	
- Most white space doesn't matter.  

	```java
		x = x       +            1;
	```	
- Variables are declared with a **name** and a **type**.  

	```java
		int weight;
		//type: int, name:weight
	```
- Classes and methods must be defined within a pair of curly braces. 	

	```java
		public void go(){
		//some code
		}
	```

Loops:-
--
There are **three** standard looping constructs:  
 1. **_while_**  
 2. **_for_**  
 3. **_do-while_**  
The important ingredient to a loop is the *_conditional_* test.

Bullet Point.
--
* The **assignment** operator uses *_one_* equals sign **=**.  
* The **equals** operator uses *_two_* equals sign **==**.
* A *while* loops runs everything within its block, as long as the *conditional* test is **true**.
* If the *conditional* is **false**, the while loop code block won't run, and execution will move to the code immediately *after* the loop block.
