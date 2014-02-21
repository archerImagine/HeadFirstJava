/***
 * DotComBust.java
 * 19-Jan-2014 : 7:35:39 pm
 * 
 */
package head.first.java.chapter06;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author ubuntu
 * @packageName = head.first.java.chapter06:DotComBust.java
 * @createdOn: 19-Jan-2014 : 7:35:39 pm
 * 
 * This is a file for my practice and notes of "Head First
 * Java, 2nd edition.".
 * Anyone can fork this repo, also the official code is available 
 * @(http://headfirstlabs.com/books/hfjava/)
 */
public class DotComBust {
	private GameHelper2 helper = new GameHelper2();
	private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
	private int numOfGuesses = 0;
	
	private void setUpGame(){
		//first make some dot coms and give them locations
		DotCom one = new DotCom();
		one.setName("Pets.com");
		
		DotCom two  = new DotCom();
		two.setName("eToys.com");
		
		DotCom three = new DotCom();
		three.setName("Go2.com");
		
		dotComsList.add(one);
		dotComsList.add(two);
		dotComsList.add(three);
		
		System.out.println("Your Goal is to sink three dot coms");
		System.out.println("Pets.com, eToys.com, Go2.com");
		System.out.println("Try to sink them all in the fewest number of guesses");
		for (DotCom dotComToSet : dotComsList) {
			ArrayList<String>newLocation = helper.placeDotCom(3);
			dotComToSet.setLocationCells(newLocation);
		}
	}
	
	private void startPlaying(){
		while(!dotComsList.isEmpty()){
			String userGuess = helper.getUserInput("Enter a guess");
			checkUserGuess(userGuess);
		}
		finishGame();
	}
	
	private void checkUserGuess(String userGuess){
		numOfGuesses++;
		String result = "miss";
		for (DotCom dotComToTest : dotComsList) {
			result = dotComToTest.checkYourself(userGuess);
			if(result.equals("hit")){
				break;
			}
			if (result.equals("kill")) {
				dotComsList.remove(dotComToTest);
				break;
			}
		}
		System.out.println("checkUserGuess: " +result);
	}
	
	
	private void finishGame(){
		System.out.println("All Dot Com are dead! your stock is now worthless");
		if (numOfGuesses <= 18) {
			System.out.println("It only took you " +numOfGuesses +" guesses");
			System.out.println("You Got out before your option sank.");
		}else{
			System.out.println("Took you long enough " +numOfGuesses +" guesses");
			System.out.println("Fish are dancing with your options.");
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DotComBust game = new DotComBust();
		game.setUpGame();
		game.startPlaying();
	}

}
