Head First Java Chapter 03
=====
This is the third Chapter learning of **Head First Java** by **Kathy Sierra** and **Bert Bates**, 
This markdown file is my notes for the third chapter, not sure if any copyright issues are there.


###Declaring a variable
* **Java cares about type.**, So for this **type safety** to work, you must declare the type of your variable.  
**Variables** are of two type:  
1 **Primitive**  
2 **Object Reference**

There is only these two declaration rule.  
1 **variables must have a type.**  
2 **variables must have a name.**  

####Primitive Type
| Type          | Bit Depth     | Value Range  |
| ------------- |:-------------:| :-----:|
| **boolean**| JVM Specific|true/false |
| **char**| 16 bits|0 to 65535 |
| **byte**| 8 bits|-128 to 127 |
| **short**|16 bits| -32768 to 32767|
| **int**| 32 bits | -2147483648 to 2147483647|
| **long**|64 bits | huge|
|**float**|32 bits | varies|
|**double**|64 bits | varies|

There are eight primitive types:  
    **b**oolean **c**har **b**yte **s**hort **i**nt **l**ong **f**loat **d**ouble  
you can remember it like,  
    **b**e **c**arefull **b**ears **s**houldn't **i**ngest **l**arge **f**urry **d**og

* You can put a very large value say(long) into a small value(int), without losing information
* But you can put small value in a large variable.

####Primitive Naming Convention.
Here is the rules for naming a variables.  
1. **It must start with a letter, underscore(_), or dollar sign ($). You can't start a name with a number.**  
2. **After the first character, you can use numbers as well, just don't start it with a number.**  
3. **It cannot be from the Java reserved words.**  

####Object Reference
* There is actually no such thing as an object variable.  
* There's only an object reference variable.
* An Object reference variable holds bits that represent a way to access an object.
* It doesn't hold the object itself.
* **Object reference are like Remote Control for actual object.**
* You cannot do arithmetic on a reference variable.

####Array
* Declare an int array variable, An array variable is a remote control to an array object.

````java
int[] nums
````
* Create a new int array with a length of 3.  

````java
nums = new int[3]
````
* Give each element in the array an int value.  

````java
nums[0] = 6;
nums[1] = 5;
nums[2] = 4;
````
* Arrays are always objects, whether they're declared to hold primitives or object reference.  
* Once you've declared an array, you can't put anything in it except things that are of the declared type.  

Bullet Point
--
* Variables come in two flavors: primitive and reference
* Variable must always be declared with a name and a type.
* A primitive variable value is the bits representing the value (5, 'a',true, etc)
* A reference variable value is the bits representing a way to get to an object on the heap.
* A reference variable is like a remote control, using the dot operator (.) on a reference variable is like pressing a button on the remote control to a access a method or instance variable.
* A reference variable has a value of *null* when it is not referencing any object.
* An array is always an object, even if the array is declared to hold primitives.    

						