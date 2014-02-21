/***
 * MovieTestDrive.java
 * 18-Jan-2014 : 12:36:47 pm
 * 
 */
package head.first.java.chapter02;

/**
 * @author ubuntu
 * @packageName = head.first.java.chapter02:MovieTestDrive.java
 * @createdOn: 18-Jan-2014 : 12:36:47 pm
 * 
 * This is a file for my practice and notes of "Head First
 * Java, 2nd edition.".
 * Anyone can fork this repo, also the official code is available 
 * @(http://headfirstlabs.com/books/hfjava/)
 */
public class MovieTestDrive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Movie one = new Movie();
		one.title = "Gone with the Stock";
		one.genere = "Tragic";
		one.rating = -2;
		
		Movie two = new Movie();
		two.title = "Lost in Cubicle Space";
		two.genere = "Comedy";
		two.rating = 5;
		
		Movie three = new Movie();
		three.title = "Byte Club";
		three.genere = "Tragic but ultimately uplifting";
		three.rating = 127;
		
		one.playIt();
		two.playIt();
		three.playIt();

	}

}
