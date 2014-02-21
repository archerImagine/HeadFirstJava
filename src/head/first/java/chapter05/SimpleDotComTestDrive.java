/***
 * SimpleDotComTestDrive.java
 * 18-Jan-2014 : 11:57:56 pm
 * 
 */
package head.first.java.chapter05;

/**
 * @author ubuntu
 * @packageName = head.first.java.chapter05:SimpleDotComTestDrive.java
 * @createdOn: 18-Jan-2014 : 11:57:56 pm
 * 
 * This is a file for my practice and notes of "Head First
 * Java, 2nd edition.".
 * Anyone can fork this repo, also the official code is available 
 * @(http://headfirstlabs.com/books/hfjava/)
 */
public class SimpleDotComTestDrive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SimpleDotCom dot = new SimpleDotCom();
		int[] locations = {2,3,4};
		dot.setLocationCells(locations);
		String userGuess = "2";
		String result = dot.checkYourself(userGuess);
	}

}
