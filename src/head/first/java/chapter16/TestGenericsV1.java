/***
 * TestGenericsV1.java
 * 21-Feb-2014 : 12:03:03 am
 * 
 */
package head.first.java.chapter16;

import java.util.Iterator;

/**
 * @author ubuntu
 * @packageName = head.first.java.chapter16:TestGenericsV1.java
 * @createdOn: 21-Feb-2014 : 12:03:03 am
 * 
 * This is a file for my practice and notes of "Head First
 * Java, 2nd edition.".
 * Anyone can fork this repo, also the official code is available 
 * @(http://headfirstlabs.com/books/hfjava/)
 */
public class TestGenericsV1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TestGenericsV1().go();
	}

	private void go() {
		// TODO Auto-generated method stub
		/*Declare and create an Animal array
		 * that holds both dogs and cats.*/
		Animal[] animals = {new Dog(), new Cat(), new Dog()};
		
		/*Declare and create a Dog array, that holds only Dogs.*/
		Dog[] dogs = {new Dog(), new Dog(), new Dog()};
		
		/*Call takeAnimals() with both array types.*/
		takeAnimals(animals);
		takeAnimals(dogs);
	}
	
	/*The crucial part is that the takeAnimals() method can take an
	 * Animal[] or a Dog(), since Dog IS-A animal.
	 * Polymorphism in action.*/
	private void takeAnimals(Animal[] animals) {
		// TODO Auto-generated method stub
		for (Animal animal : animals) {
			/*We can ONLY call the methods declared in type animal.*/
			animal.eat();
		}
		
	}

}
