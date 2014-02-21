/***
 * MultiFor.java
 * 19-Jan-2014 : 12:11:08 am
 * 
 */
package head.first.java.chapter05;

/**
 * @author ubuntu
 * @packageName = head.first.java.chapter05:MultiFor.java
 * @createdOn: 19-Jan-2014 : 12:11:08 am
 * 
 * This is a file for my practice and notes of "Head First
 * Java, 2nd edition.".
 * Anyone can fork this repo, also the official code is available 
 * @(http://headfirstlabs.com/books/hfjava/)
 */
public class MultiFor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (int x = 0; x < 4; x++){
			for(int y = 4; y > 2; y--){
				System.out.println(x +" " +y);				
			}
			if(x == 1){
				x++;
			}

		}
	}

}
