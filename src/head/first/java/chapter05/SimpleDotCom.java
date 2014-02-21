/***
 * SimpleDotCom.java
 * 18-Jan-2014 : 11:52:45 pm
 * 
 */
package head.first.java.chapter05;


/**
 * @author ubuntu
 * @packageName = head.first.java.chapter05:SimpleDotCom.java
 * @createdOn: 18-Jan-2014 : 11:52:45 pm
 * 
 * This is a file for my practice and notes of "Head First
 * Java, 2nd edition.".
 * Anyone can fork this repo, also the official code is available 
 * @(http://headfirstlabs.com/books/hfjava/)
 */
public class SimpleDotCom {
	private int[] locationCells;
	private int numOfHits = 0;
	/**
	 * @param locationCells the locationCells to set
	 */
	public void setLocationCells(int[] locationCells) {
		this.locationCells = locationCells;
	}
	
	public String checkYourself(String stringGuess){
		int guess = Integer.parseInt(stringGuess);
		String result = "miss";
		
		for (int cell : locationCells) {
			if(guess == cell){
				result = "hit";
				numOfHits++;
				break;						
			}
		}
		
		if (numOfHits == locationCells.length) {
			result = "kill";
		}
		
		System.out.println("Game Result " +result);
		
		
		return result;
	}
}
