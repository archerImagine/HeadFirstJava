/***
 * Player.java
 * 02-Feb-2014 : 1:30:04 pm
 * 
 */
package head.first.java.chapter10;

/**
 * @author ubuntu
 * @packageName = head.first.java.chapter10:Player.java
 * @createdOn: 02-Feb-2014 : 1:30:04 pm
 * 
 * This is a file for my practice and notes of "Head First
 * Java, 2nd edition.".
 * Anyone can fork this repo, also the official code is available 
 * @(http://headfirstlabs.com/books/hfjava/)
 */
public class Player {
	static int playerCount = 0;
	private String name;
	
	public Player(String n){
		name = n;
		playerCount++;
	}
}
