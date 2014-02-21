Head First Java Chapter 07
=
This is the seventh Chapter learning of **Head First Java** by **Kathy Sierra** and **Bert Bates**, 
This markdown file is my notes for the seventh chapter, not sure if any copyright issues are there.

BULLET POINTS
-
* A subclass extends a superclass.
* A subclass inherits all public instance variables and methods of the superclass, but does not inherit the private instance variables and methods of the superclass.
* Inherited methods can be overridden; instance variables cannot be overridden(although they can be redefined in the subclass).
* Use the IS-A test to verify that your inheritance hierarchy is valid.
* The IS-A relationship works in only one direction.
* When a method is overridden in a subclass, and that method is invoked on an instance of the subclass, the overridden version of the method is called.
* If a class extends A, and C extends B, class B IS-A class A, and class C IS-A class B, and Class C also IS-A class A.
* Instance variable and Class has a HAS-A relationship.

### Inheritance.
* Inheritance lets you guarantee that all classes grouped under a certain supertype have all the methods that the supertype has.
* When you define a supertype for a group of classes, any subclass of that supertype can be substituted where the supertype is expected.  

### Polymorphism.
* With polymorphism, the reference type can be a superclass of the actual object type.
* We can have polymorphic aguments and return type.(Write the method arguments as a superclass type, and you can pass any subclass object at the runtime.)

### Rules of overriding.
* Arguments must be the same, and return types must be compatible.
* The method can't be less accessible.

### Overloading.
* Method overloading is nothing more than having two methods with the same name and different argument list.
 * The return type can be different.
 * You can't change only the return type.
 * You can vary the access levels in any direction.
