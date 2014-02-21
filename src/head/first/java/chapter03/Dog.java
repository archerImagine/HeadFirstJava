/***
 * Dog.java
 * 18-Jan-2014 : 5:48:41 pm
 * 
 */
package head.first.java.chapter03;

/**
 * @author ubuntu
 * @packageName = head.first.java.chapter03:Dog.java
 * @createdOn: 18-Jan-2014 : 5:48:41 pm
 * 
 * This is a file for my practice and notes of "Head First
 * Java, 2nd edition.".
 * Anyone can fork this repo, also the official code is available 
 * @(http://headfirstlabs.com/books/hfjava/)
 */
public class Dog {

	/**
	 * @param args
	 */
	String name;
	public void bark(){
		System.out.println(name + " says Ruff!");
	}
	public static void main(String[] args) {
		//Make a Dog object and access it.
		Dog dog1 = new Dog();
		dog1.bark();
		dog1.name = "Bart";
		
		//now make a Dog Array.
		Dog[] myDogs = new Dog[3];
		//and put some dogs in it.
		myDogs[0] = new Dog();
		myDogs[1] = new Dog();
		myDogs[2] = dog1;
		
		//Now access the Dogs using the array references.
		myDogs[0].name = "Fred";
		myDogs[1].name = "Marge";
		
		//What is myDogs[2] name?
		System.out.println("Last Dog Name is " +myDogs[2].name);
		
		//now loop through the array and tell all dogs to bark.
		int x = 0;
		while (x < myDogs.length) {
			myDogs[x].bark();
			x = x + 1;
		}
		

	}

}
