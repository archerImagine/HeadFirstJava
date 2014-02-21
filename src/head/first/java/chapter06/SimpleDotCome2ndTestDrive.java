/***
 * SimpleDotCome2ndTestDrive.java
 * 19-Jan-2014 : 12:04:57 am
 * 
 */
package head.first.java.chapter06;

import java.util.ArrayList;

/**
 * @author ubuntu
 * @packageName = head.first.java.chapter05:SimpleDotCome2ndTestDrive.java
 * @createdOn: 19-Jan-2014 : 12:04:57 am
 * 
 * This is a file for my practice and notes of "Head First
 * Java, 2nd edition.".
 * Anyone can fork this repo, also the official code is available 
 * @(http://headfirstlabs.com/books/hfjava/)
 */
public class SimpleDotCome2ndTestDrive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int numOfGuess = 0;
		GameHelper helper = new GameHelper();
		SimpleDotCom theDotCom = new SimpleDotCom();
		
		ArrayList<String> locations = new ArrayList<String>();
		locations.add("2");
		locations.add("3");
		locations.add("4");
		
		theDotCom.setLocationCells(locations);
		
		boolean isAlive = true;
		while (isAlive == true) {
			String guess = helper.getUserInput("enter a number");
			String result = theDotCom.checkYourself(guess);
			numOfGuess++;
			
			if(result.equals("kill")){
				isAlive = false;
				System.out.println("You took " +numOfGuess +" guess");
			}
					
		}

	}

}
