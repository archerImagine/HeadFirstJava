/***
 * DotCom.java
 * 19-Jan-2014 : 7:28:31 pm
 * 
 */
package head.first.java.chapter06;
import java.util.*;
/**
 * @author ubuntu
 * @packageName = head.first.java.chapter06:DotCom.java
 * @createdOn: 19-Jan-2014 : 7:28:31 pm
 * 
 * This is a file for my practice and notes of "Head First
 * Java, 2nd edition.".
 * Anyone can fork this repo, also the official code is available 
 * @(http://headfirstlabs.com/books/hfjava/)
 */
public class DotCom {
	private ArrayList<String>locationCells;
	private String name;
	/**
	 * @param locationCells the locationCells to set
	 */
	public void setLocationCells(ArrayList<String> locationCells) {
		this.locationCells = locationCells;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	public String checkYourself(String userInput){
		String result = "miss";
		int index = locationCells.indexOf(userInput);
		if(index>= 0){
			locationCells.remove(index);
			if(locationCells.isEmpty()){
				result = "kill";
				System.out.println("Ouch! you sunk " +name +" ");
			}else{
				result = "hit";
			}
		}
		return result;
	}
}
