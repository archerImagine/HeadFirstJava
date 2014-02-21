package head.first.java.chapter01;
/**
 * 
 * @author ubuntu
 * @packageName = head.first.java.chapter01:Loopy.java
 * @createdOn: 18-Jan-2014 : 12:09:25 am
 * 
 * This is a file for my practice and notes of "Head First
 * Java, 2nd edition.".
 * Anyone can fork this repo, also the official code is available 
 * @(http://headfirstlabs.com/books/hfjava/)
 */
public class Loopy {

	public static void main(String[] args) {
		int x = 1;
		System.out.println("Before the loop.");
		
		while(x < 4){
			System.out.println("In the Loop.");
			System.out.println("Value of X, is = " +x);
			 x = x + 1;
		}
		
		System.out.println("This is after the loop.");
	}

}
