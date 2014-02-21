package head.first.java.chapter02;
/**
 * 
 * @author ubuntu
 * @packageName = head.first.java.chapter02:DogTestDrive.java
 * @createdOn: 18-Jan-2014 : 12:30:29 pm
 * 
 * This is a file for my practice and notes of "Head First
 * Java, 2nd edition.".
 * Anyone can fork this repo, also the official code is available 
 * @(http://headfirstlabs.com/books/hfjava/)
 */
public class DogTestDrive {

	public static void main(String[] args) {
		Dog d = new Dog();	//make a dog Object.
		d.size = 40;		//use the dot operator to set the size of dog.
		d.bark(); 			//use the dot operator to call the bark method

	}

}
