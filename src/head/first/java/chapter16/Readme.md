Head First Java Chapter 16
=
This is the Sixteenth Chapter learning of **Head First Java** by **Kathy Sierra** and **Bert Bates**, 
This markdown file is my notes for the Sixteenth chapter, not sure if any copyright issues are there.

Collections with Generics
-

### ArrayList
* ArrayList does not have a sort method.
* ArrayList is not the only Collection
  * **TreeSet** : Keeps the elements sorted and prevents duplicates.
  * **HashMap** : Store and Access elements as name/value pairs.
  * **LinkedList** : Gives better performance when you insert or delete elements from middle.
  * **HashSet** : Prevents duplicates in the collection, and given an element, can find that element quickly.
  * **LinkedHashMap** : It remembers the order in which elements were inserted in addition to HashMap.
* To get the sort functionality from ArrayList we can change it to a TreeSet
  * **BUT** TreeSet might be more expensive. Every insert into a TreeSet requires hugh time to figure out where it should reside.

### sort()
````java
	static <T extends Comparable<? super T>> void 	sort(List<T> list)
````
* Sorts the specified list into ascending order, according to the natural ordering of its elements.
* The sort method declaration looks little strange. Because the Collection framework make heavy use of *generics*.

### Generics
* Generics means more type-safety.
* With generics, you can create type-safe collections where more problems are caught at compile-time instead of runtime.
* Without generics, the compiler would happily let you put a Pumpkin into an ArrayList that was supposed to hold only Cat Objects.
* Three things are of importance while dealing with generics.
  * Create instances of generified classes (like ArrayList)
  ````java
  	new ArrayList<Song>();
  ````
  * Declaring and assigning variables of generic types.
  ````java
  	List<Song> songList = new ArrayList<Song>();
  ````
  * Declaring (and invoking) methods that take generic types.
  ````java
  	void foo(List<Song> list);
  	x.foo(songList);
  ````
  
### Generic Classes
````java
	public class ArrayList<E>
	extends AbstractList<E>
	implements List<E>, RandomAccess, Cloneable, Serializable  
````
* Think of 'E' as a stand-in for "the type of element you want this collection to hold and return."

### Generic Methods.
* A generic method means that the method declaration uses a type parameter in its signature. It is used in this manner.
  * Using the type parameter defined in the class declaration.
  ````java
  	public class ArrayList<E> extends AbstractList<E>{
  		public boolean add(E o);
  	}
  ````
  * Using a type parameter that was NOT defined in the class definition.
  ````java
  	public <T extends Animal> void takeThing(ArrayList<T> list);
  	
  ````
* Difference between the below Code sample.
````java
	public <T extends Animal> void takeThing(ArrayList<T> list);
````
  * This one where **<T extends Animal>** is part of the method declaration, means that any ArrayList declared of a type that is Animal, or one of Animal's sub type is legal.  
**AND**
````java
	public void takeThing(ArrayList<Animal> list);
````
  * This method argument means that only an **ArrayList<Animal>** is legal and not sub type.
    * If you declare a method to take ArrayList<Animal> it can only take an ArrayList<Animal>, not ArrayList<Dog>.
    * Array types are checked again at runtime, but collection type checks happens only when you compile.
### Genrics Implement and Extends
* In generics, the keywords "extends" really means "is-a" and works for BOTH classes and interfaces.

### Collection API.
* There are three main interfaces, **List**,**Set**, and **Map**.
  1. **LIST** : **Where sequence matters.**
  2. **SET** : **Where uniqueness matters.**
  3. **MAP** : **Where finding something by key matters.**
    1. Map interface doesn't actually extend the Collection interface.
#### Object Equality
* There are two type of Equality.
  1. Reference Equality
    * Two reference, one object on the heap.
    * If you call **hashCode()** method on both reference, you'll get same result.
  2. Object Equality.
    * Two reference, two objects on the heap, but the objects are considered meaningfully equivalent.
    * We must override the **hashCode()** and **equals()** methods.

### HashSet
* A HashSet checks the hasCodes, if they are different the object are assumed to be different.

### TreeSet 
* A TreeSet is similar to HashSet in that it prevents duplicates, and it also keeps the list sorted.
* To use a TreeSet, one of these things must be true.
  * The element in the list must be of a type that implements **Comparable**.  
    **OR**  
  * You use the TreeSet's overloaded constructor that takes a Comparator.    

### Map
* Each element in a Map is actually TWO Objects - a *key* and a *value*. You can have duplicate values, but NOT Duplicate keys.    

### Generic WildCards
* There is a way a method argument that can accept an ArrayList of any Animal sub type.

````java
public void takeAnimal(ArrayList <? extends Animal> animals){
	for (Animal animal : animals) {
			animal.eat();
		}
}
````
**OR**

````java
public <T extends Animal>void takeAnimal(ArrayList <T> animals){
	for (Animal animal : animals) {
			animal.eat();
		}
}
````
* When you use a wild card in you method argument, the compiler will STOP you from doing anything that could hurt the list referenced by the method parameters.
* You can still invoke methods on the elements in the list, but you cannot add elements to the list.
* In other words, you can do things with the list elements, but you cannot put new things in the list.