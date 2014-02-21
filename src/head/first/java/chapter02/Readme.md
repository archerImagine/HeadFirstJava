Head First Java Chapter 02
=====
This is the second Chapter learning of **Head First Java** by **Kathy Sierra** and **Bert Bates**, 
This markdown file is my notes for the second chapter, not sure if any copyright issues are there.

Procedural Programmer (PP) vs Object Oriented Programmer(OOP)
-
* PP thinks in terms of what things this program has to *do*, but OOP thinks what are the **things** in the program.
* When Specification of program change the PP have to change the existing code and re-test all, but for OOP, he has
test only the changed portion.
* In OO programming, you can always follow these steps for efficient design
 * Check what is common in all the classes.
 * Abstract the common feature and put in a super class.
 * Inherit all the Sub Class with feature from Super class.
 * Override any specific requirement in one of the Sub Class.

Bullet Point
--
* Object-Oriented programming lets you extend a program without having to touch previously-tested, working code.
* All java code is defined in a **class**.
* A class describes how to make an object of that class type. **A Class is like a blueprint.**
* An object can take care of itself, you don't have to know or care *how* the object does it.
* An object **knows** things and **does** things.
* Things an object knows about itself are called **instance variables**. They represent the *state* of an object.
* Things an object does are called **methods**. They represent the *behavior* of an object.
* When you create a class, you may also want to create a separate test class which you will use to create objects of your class type.
* A class can **inherit** instance variables and method from a more abstract **superclass**.
* At runtime, a java program is nothing more than objects 'talking' to other object.
 