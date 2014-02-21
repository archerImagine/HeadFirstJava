/***
 * DogTestDrive.java
 * 18-Jan-2014 : 9:54:17 pm
 * 
 */
package head.first.java.chapter04;

/**
 * @author ubuntu
 * @packageName = head.first.java.chapter04:DogTestDrive.java
 * @createdOn: 18-Jan-2014 : 9:54:17 pm
 * 
 * This is a file for my practice and notes of "Head First
 * Java, 2nd edition.".
 * Anyone can fork this repo, also the official code is available 
 * @(http://headfirstlabs.com/books/hfjava/)
 */
public class DogTestDrive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Dog one = new Dog();
		one.size = 70;
		
		Dog two = new Dog();
		two.size = 8;
		
		Dog three = new Dog();
		three.size = 35;
		
		one.bark();
		two.bark();
		three.bark();
		
	}

}
