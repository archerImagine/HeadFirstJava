/***
 * Duck2.java
 * 02-Feb-2014 : 1:00:50 pm
 * 
 */
package head.first.java.chapter10;

/**
 * @author ubuntu
 * @packageName = head.first.java.chapter10:Duck2.java
 * @createdOn: 02-Feb-2014 : 1:00:50 pm
 * 
 * This is a file for my practice and notes of "Head First
 * Java, 2nd edition.".
 * Anyone can fork this repo, also the official code is available 
 * @(http://headfirstlabs.com/books/hfjava/)
 */
public class Duck2 {
	private int size;
	
	/**
	 * @return the size
	 */
	public int getSize() {
		return size;
	}

	/**
	 * @param size the size to set
	 */
	public void setSize(int size) {
		this.size = size;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*The below line gives an error:
		 * Cannot make a static reference to the non-static method getSize() from the type Duck2
		 */
		System.out.println("Size of the duck is " +getSize());

	}

}
