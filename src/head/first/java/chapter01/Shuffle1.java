package head.first.java.chapter01;
/**
 * 
 * @author ubuntu
 * @packageName = head.first.java.chapter01:Shuffle1.java
 * @createdOn: 18-Jan-2014 : 12:47:58 am
 * 
 * This is a file for my practice and notes of "Head First
 * Java, 2nd edition.".
 * Anyone can fork this repo, also the official code is available 
 * @(http://headfirstlabs.com/books/hfjava/)
 */
public class Shuffle1 {

	public static void main(String[] args) {
		int x = 3;
		while (x > 0) {
			if (x > 2) {
				System.out.print("a");
			}
			x = x - 1;
			System.out.print("-");
			if (x == 2) {
				System.out.print("b c");
			}
			if (x == 1) {
				System.out.print("d");
				x = x - 1;
			}
		}
	}

}
