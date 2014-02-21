/***
 * SimpleDotCom.java
 * 19-Jan-2014 : 4:53:02 pm
 * 
 */
package head.first.java.chapter06;
import java.util.ArrayList;
/**
 * @author ubuntu
 * @packageName = head.first.java.chapter06:SimpleDotCom.java
 * @createdOn: 19-Jan-2014 : 4:53:02 pm
 * 
 * This is a file for my practice and notes of "Head First
 * Java, 2nd edition.".
 * Anyone can fork this repo, also the official code is available 
 * @(http://headfirstlabs.com/books/hfjava/)
 */
public class SimpleDotCom {
	private ArrayList<String> locationCells;
	/**
	 * @param locationCells the locationCells to set
	 */
	public void setLocationCells(ArrayList<String> locationCells) {
		this.locationCells = locationCells;		
	}
	
	public String checkYourself(String stringGuess){
		
		String result = "miss";	
		int index = locationCells.indexOf(stringGuess);
		if (index >= 0) {
			locationCells.remove(index);
			if (locationCells.isEmpty()) {
				result = "kill";
			}else{
				result = "hit";
			}
		}
		System.out.println("Game Result " +result);
		return result;
	}

}
