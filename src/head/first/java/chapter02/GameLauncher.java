/***
 * GameLauncher.java
 * 18-Jan-2014 : 12:58:08 pm
 * 
 */
package head.first.java.chapter02;

/**
 * @author ubuntu
 * @packageName = head.first.java.chapter02:GameLauncher.java
 * @createdOn: 18-Jan-2014 : 12:58:08 pm
 * 
 * This is a file for my practice and notes of "Head First
 * Java, 2nd edition.".
 * Anyone can fork this repo, also the official code is available 
 * @(http://headfirstlabs.com/books/hfjava/)
 */
public class GameLauncher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		GuessGame game = new GuessGame();
		game.startGame();
	}

}
