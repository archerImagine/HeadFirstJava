/***
 * PlayerTestDrive.java
 * 02-Feb-2014 : 1:32:21 pm
 * 
 */
package head.first.java.chapter10;

/**
 * @author ubuntu
 * @packageName = head.first.java.chapter10:PlayerTestDrive.java
 * @createdOn: 02-Feb-2014 : 1:32:21 pm
 * 
 * This is a file for my practice and notes of "Head First
 * Java, 2nd edition.".
 * Anyone can fork this repo, also the official code is available 
 * @(http://headfirstlabs.com/books/hfjava/)
 */
public class PlayerTestDrive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Player Count before init " +Player.playerCount);
		Player one = new Player("Tiger Woods");
		System.out.println("Player Count After init " +Player.playerCount);

	}

}
