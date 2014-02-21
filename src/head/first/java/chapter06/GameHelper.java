/***
 * GameHelper.java
 * 19-Jan-2014 : 12:00:11 am
 * 
 */
package head.first.java.chapter06;
import java.io.*;

/**
 * @author ubuntu
 * @packageName = head.first.java.chapter05:GameHelper.java
 * @createdOn: 19-Jan-2014 : 12:00:11 am
 * 
 * This is a file for my practice and notes of "Head First
 * Java, 2nd edition.".
 * Anyone can fork this repo, also the official code is available 
 * @(http://headfirstlabs.com/books/hfjava/)
 */
public class GameHelper {
	public String getUserInput(String prompt){
		String inputLine = null;
		
		System.out.println(prompt);
		try {
			BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
			inputLine = is.readLine();
			if(inputLine.length() == 0){
				return null;
			}			
		} catch (IOException e) {
			System.out.println("IOExceptio: " +e);
		}
		
		return inputLine;
	}
}
