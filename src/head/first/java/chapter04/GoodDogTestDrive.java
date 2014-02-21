/***
 * GoodDogTestDrive.java
 * 18-Jan-2014 : 9:58:10 pm
 * 
 */
package head.first.java.chapter04;

/**
 * @author ubuntu
 * @packageName = head.first.java.chapter04:GoodDogTestDrive.java
 * @createdOn: 18-Jan-2014 : 9:58:10 pm
 * 
 * This is a file for my practice and notes of "Head First
 * Java, 2nd edition.".
 * Anyone can fork this repo, also the official code is available 
 * @(http://headfirstlabs.com/books/hfjava/)
 */
public class GoodDogTestDrive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		GoodDog one = new GoodDog();
		one.setSize(70);
		
		GoodDog two = new GoodDog();
		two.setSize(8);
		
		System.out.println("Dog one: " +one.getSize());
		System.out.println("Dog two: " +two.getSize());
		
		one.bark();
		two.bark();
	}

}
