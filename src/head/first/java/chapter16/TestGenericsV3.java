/***
 * TestGenericsV3.java
 * 21-Feb-2014 : 12:15:37 am
 * 
 */
package head.first.java.chapter16;

import java.util.ArrayList;

/**
 * @author ubuntu
 * @packageName = head.first.java.chapter16:TestGenericsV3.java
 * @createdOn: 21-Feb-2014 : 12:15:37 am
 * 
 * This is a file for my practice and notes of "Head First
 * Java, 2nd edition.".
 * Anyone can fork this repo, also the official code is available 
 * @(http://headfirstlabs.com/books/hfjava/)
 */
public class TestGenericsV3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TestGenericsV3().go();
	}

	private void go() {
		// TODO Auto-generated method stub
		ArrayList<Animal> animals = new ArrayList<Animal>();
		animals.add(new Dog());
		animals.add(new Cat());
		animals.add(new Dog());
		
		takeAnimals(animals);
		
		ArrayList<Dog> dogs = new ArrayList<Dog>();
		dogs.add(new Dog());
		dogs.add(new Dog());
		
		takeAnimals(dogs);
	}
	private void takeAnimals(ArrayList<Animal> animals) {
		// TODO Auto-generated method stub
		for (Animal animal : animals) {
			/*We can ONLY call the methods declared in type animal.*/
			animal.eat();
		}
		
	}
}
