/***
 * TestArrays.java
 * 18-Jan-2014 : 5:56:36 pm
 * 
 */
package head.first.java.chapter03;

/**
 * @author ubuntu
 * @packageName = head.first.java.chapter03:TestArrays.java
 * @createdOn: 18-Jan-2014 : 5:56:36 pm
 * 
 * This is a file for my practice and notes of "Head First
 * Java, 2nd edition.".
 * Anyone can fork this repo, also the official code is available 
 * @(http://headfirstlabs.com/books/hfjava/)
 */
public class TestArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] islands = new String[4];
		int [] index = new int[4];
		
		islands[0] = "Bermuda";
		islands[1] = "Fiji";
		islands[2] = "Azores";
		islands[3] = "Cozumel";
		
		
		index[0] = 1;
		index[1] = 3;
		index[2] = 0;
		index[3] = 2;
				
		int y = 0;
		int ref;
		while (y < 4) {
			ref = index[y];
			System.out.print("island = ");
			System.out.println(islands[ref]);
			y = y + 1;
		}
	}

}
