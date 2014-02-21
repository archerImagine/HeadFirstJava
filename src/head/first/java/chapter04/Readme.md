Head First Java Chapter 04
=====
This is the fourth Chapter learning of **Head First Java** by **Kathy Sierra** and **Bert Bates**, 
This markdown file is my notes for the fourth chapter, not sure if any copyright issues are there.

Bullet Points
-

* Classes define what an object knows and what an object does.
* Things an object knows are its **instance variable**.
* Things an object does are its **method**.
* Methods can use instance variables so that objects of the same type can behave differently.
* A method can have parameters, which means you can pass one or more values into the method.
* The number and type of values you pass in must match the order and type of the parameters declared by the method.
* Values passed in and out of methods can be implicitly promoted to a larger type or explicitly cast to a smaller type.
* The values you pass as an arguments to a method can be a literal value or a variable of the declared parameter type.
* A method must declare a return type, A void return type means the method doesn't return anything.
* if a method declares a non-void return type, it must return a value compatible with the declared return type.

###Encapsulation.
* To support encapsulation, the instance variable should be hidden by the use of **private** access modifiers.
* The instance variables can only be accessed using a **getter** or a **setter** method with **public** access modifiers.
* Any place where a particular value can be used, a **method** call that returns *that type* can be used.

###Instance Variable Vs Local Variable.
* Instance variable always gets a default value. these default values are
|Data Type|Default Value|
|integers | 0 |
|floating points | 0.0|
|booleans | false|
|references | null|
* Instance variables are declared *inside a class* but not within a method.
* Local variables are declared *within a method*
* Local variables must be initialized before use

###Equality of primitive or reference
* Two *primitives* can be compared using the **==** operator.
* When **==** is used for equality check of references it just tells if both reference point to the same Heap Address.

