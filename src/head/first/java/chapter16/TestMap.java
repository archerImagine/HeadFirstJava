/***
 * TestMap.java
 * 20-Feb-2014 : 11:37:04 pm
 * 
 */
package head.first.java.chapter16;

import java.util.HashMap;

/**
 * @author ubuntu
 * @packageName = head.first.java.chapter16:TestMap.java
 * @createdOn: 20-Feb-2014 : 11:37:04 pm
 * 
 * This is a file for my practice and notes of "Head First
 * Java, 2nd edition.".
 * Anyone can fork this repo, also the official code is available 
 * @(http://headfirstlabs.com/books/hfjava/)
 */
public class TestMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer>scores = new HashMap<String, Integer>();
		scores.put("Kathy", 42);
		scores.put("Bert", 343);
		scores.put("Skyler", 420);
		
		System.out.println(scores);
		System.out.println(scores.get("Bert"));

	}

}
