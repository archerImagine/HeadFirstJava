/***
 * Duck1.java
 * 01-Feb-2014 : 10:30:29 pm
 * 
 */
package head.first.java.chapter09;

/**
 * @author ubuntu
 * @packageName = head.first.java.chapter09:Duck1.java
 * @createdOn: 01-Feb-2014 : 10:30:29 pm
 * 
 * This is a file for my practice and notes of "Head First
 * Java, 2nd edition.".
 * Anyone can fork this repo, also the official code is available 
 * @(http://headfirstlabs.com/books/hfjava/)
 */
public class Duck1 {
	int size;
	
	public Duck1(){
		System.out.println("Duck1 is alive QUACK, But size is not set: " +size);
	}

	/**
	 * @param size the size to set
	 */
	public void setSize(int size) {
		this.size = size;
	}
	
}
