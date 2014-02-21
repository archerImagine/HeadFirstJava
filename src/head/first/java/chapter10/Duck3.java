/***
 * Duck3.java
 * 02-Feb-2014 : 1:03:16 pm
 * 
 */
package head.first.java.chapter10;

/**
 * @author ubuntu
 * @packageName = head.first.java.chapter10:Duck3.java
 * @createdOn: 02-Feb-2014 : 1:03:16 pm
 * 
 * This is a file for my practice and notes of "Head First
 * Java, 2nd edition.".
 * Anyone can fork this repo, also the official code is available 
 * @(http://headfirstlabs.com/books/hfjava/)
 */
public class Duck3 {
	private int size;
	private static int duckCount=0;
	
	public Duck3(){
		duckCount++;
	}

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
	 * @return the duckCount
	 */
	public static int getDuckCount() {
		return duckCount;
	}
}
