Head First Java Chapter 10
=
This is the tenth Chapter learning of **Head First Java** by **Kathy Sierra** and **Bert Bates**, 
This markdown file is my notes for the eighth chapter, not sure if any copyright issues are there.

BULLET POINTS
-
* A **static method** should be called using the class name rather than an object reference variable: **Math.random() vs myFoo.go()**.
* A static method can be invoked without any instances of the methods's class on the heap.
* A static method is good for a utility method that does not (and never will) depend on a particular instance variable value.
* A static method is not associated with a particular instance - only the class - so it cannot access any instance variable values of its class. It wouldn't know which instance's value to use.
* A static method cannot access a non-static method since non-static methods are usually associated with instance variable state.
* If you have a class with only static methods, and you do not want the class to be instantiated, you can mark the constructor private.
* A **static variable** is a variable shared by all members of a given class. There is only one copy of a static variable in a class, rather than one copy per each individual instance for instance variables.
* A static method can access a static variable.
* To make a constant in Java, mark a variable as both **static** and **final**.
* A final static variable must be assigned a value either at the time it is declared, or in a static initializer.

````java
static{
	DOG_CODE = 420;	
}
```` 
* The naming convention for constants is to make the name all uppercase.
* A final variable value cannot be changed once it has been assigned.
* Assigning a value to a *final* instance variable must be either at the time it is declared, or in the constructor.
* A final method cannot be overridden.
* A final class cannot be extended.

### Static Imports
* If you're going to use a static member a few times, we think you should avoid static imports, to help keep the code more readable.
* If you're going to use a static member a lot, then it is probably OK to use the static imports.
* Notice that you can use wildcards (*), in your static import declaration.
* A big issue with static imports is that it's not too hard to create naming conflicts.
