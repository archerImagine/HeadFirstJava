package head.first.java.chapter02;
/**
 * 
 * @author ubuntu
 * @packageName = head.first.java.chapter02:Movie.java
 * @createdOn: 18-Jan-2014 : 12:33:48 pm
 * 
 * This is a file for my practice and notes of "Head First
 * Java, 2nd edition.".
 * Anyone can fork this repo, also the official code is available 
 * @(http://headfirstlabs.com/books/hfjava/)
 */
public class Movie {
	String title;
	String genere;
	int rating;
	
	void playIt(){
		System.out.println("Playing the Movie with details: "
				+ "\n" +"title: " +this.title
				+ "\n" +"genere: " +this.genere
				+ "\n" +"rating: " +this.rating);
	}
}
