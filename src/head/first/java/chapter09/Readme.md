Head First Java Chapter 09
=
This is the nineth Chapter learning of **Head First Java** by **Kathy Sierra** and **Bert Bates**, 
This markdown file is my notes for the eighth chapter, not sure if any copyright issues are there.

BULLET POINTS
-
* Java has tow areas or memory we care about,
 1. The Stack
 2. The Heap
* Instance Variables are variables declared inside a class but outside any method.
* Local variables are variables declared inside a method or method parameters. 
* All local variables live on the stack, in the frame corresponding to the method where there variables are declared.
* Object reference variables work just like primitive variables - if the reference is declared as a local variables, it goes on the stack.
* All object live in the heap, regardless of whether the reference is a local or instance variable.
* Instance variables live within the object they belong to, on the heap.
* If the instance variables is a reference to an object, both the reference and the object it refers to are on the HEAP.
* A constructor is the code that runs when you say **new** on a class type.
* A constructor must have the same name as the class, and must *not* have a return type.
* You can use a constructor to initialize the state of the object being constructed.
* If you don't put constructor in your class, the compiler will put in a default constructor.
* The default constructor is always a no-args constructor.
* If you put a constructor-any constructor-in your class, the compiler will not build the default constructor.
* If you want a no-arg constructor, and you've already put in a constructor with arguments, you'll have to build the no-args constructor yourself.
* Always provide a no-args  if you can, to make it easy for programmers to make a working object, supply default values.
* Overloaded constructors means you have more than one constructor in your class.
* Overloaded constructors must have different argument lists.
* You cannot have two constructors with the same argument lists. An argument list includes the order and/or type of arguments.
* Instance variables are assigned a default value, even when you've not explicitly assign one.

### Constructors
* Constructors can be **public**, **private**,or **default**.
* Marking the Constructor as **private** doesn't mean nobody can access it, it just means that nobody outside the class can access it.
* All the constructors in an object's inheritance tree must run when you make a new object.
* Even Abstract class have constructors, Although you can never say new on an abstract class, an abstract class is still a super class, so its constructors runs when someone makes an instance of concrete subclass.
* The only way to call a super constructor is by calling **super()**, this calls the **super constructor**.
* Compiler puts a default call to **super()** if we don't. and it is always the no-args super which is inserted.
* The call to **super()** must be the first statement in each constructors.
* Use **this()** to call a constructor from another overloaded constructor in the same class.
* The Call to **this()** can be used only in a constructor, and must be the first statement in a constructor.
* A constructor can have a call to **super()** or **this()** but never both.

### Object Life and Scope
* An objects life depends on entirely on the life of references referring to it.
* A local variable lives only within the method that declared the variables.

````java
public void read(){
	int s = 42;
	// 's' can be used only within this method.
}
```` 

* An instance variable lives as long as the object does. If the object is still alive, so are its instance variables.

````java
public class life{
	int size;
	
	public setSize(int s){
	size = s;
	//'s' disappears at the end of the method,
	//but 'size' can be used anywhere in the class.
	}
}
````
* **life** A local variable is alive as long as its Stack frame is on the stack.
* **Scope** A local variable is in scope only within the method in which the variable was declared.

### Garbage Collection
* An object is alive as long as there are live references to it. If a reference variable goes out of scope but is still alive.
* Object are killed in these three ways
 1. Reference goes out of scope permanently.
 2. Assign the reference object to another object.
 3. Explicitly set the reference to null. 