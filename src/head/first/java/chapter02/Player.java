/***
 * Player.java
 * 18-Jan-2014 : 12:42:45 pm
 * 
 */
package head.first.java.chapter02;

/**
 * @author ubuntu
 * @packageName = head.first.java.chapter02:Player.java
 * @createdOn: 18-Jan-2014 : 12:42:45 pm
 * 
 * This is a file for my practice and notes of "Head First
 * Java, 2nd edition.".
 * Anyone can fork this repo, also the official code is available 
 * @(http://headfirstlabs.com/books/hfjava/)
 */
public class Player {
	int number = 0;			//where the guess goes.
	
	public void guess(){
		number = (int)(Math.random() * 10);
		System.out.println("I'm guessing " +number);
	}
}
