/***
 * Animal.java
 * 01-Feb-2014 : 10:58:14 pm
 * 
 */
package head.first.java.chapter09.ConstructorTrial;

/**
 * @author ubuntu
 * @packageName = head.first.java.chapter09.ConstructorTrial:Animal.java
 * @createdOn: 01-Feb-2014 : 10:58:14 pm
 * 
 * This is a file for my practice and notes of "Head First
 * Java, 2nd edition.".
 * Anyone can fork this repo, also the official code is available 
 * @(http://headfirstlabs.com/books/hfjava/)
 */
public abstract class Animal {
	private String name;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	public Animal (String theName){
		name = theName;
	}
}
