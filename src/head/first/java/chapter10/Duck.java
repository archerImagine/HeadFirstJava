/***
 * Duck.java
 * 02-Feb-2014 : 12:57:43 pm
 * 
 */
package head.first.java.chapter10;

/**
 * @author ubuntu
 * @packageName = head.first.java.chapter10:Duck.java
 * @createdOn: 02-Feb-2014 : 12:57:43 pm
 * 
 * This is a file for my practice and notes of "Head First
 * Java, 2nd edition.".
 * Anyone can fork this repo, also the official code is available 
 * @(http://headfirstlabs.com/books/hfjava/)
 * This does not compiles.
 */
public class Duck {
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
		/*The below line gives a error: Cannot make a static reference to the non-static 
		 * field size.
		 */
		System.out.println("Size of the duck is " +size);
	}

}
