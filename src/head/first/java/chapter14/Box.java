/***
 * Box.java
 * 10-Feb-2014 : 8:17:38 pm
 * 
 */
package head.first.java.chapter14;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author ubuntu
 * @packageName = head.first.java.chapter14:Box.java
 * @createdOn: 10-Feb-2014 : 8:17:38 pm
 * 
 * This is a file for my practice and notes of "Head First
 * Java, 2nd edition.".
 * Anyone can fork this repo, also the official code is available 
 * @(http://headfirstlabs.com/books/hfjava/)
 */
public class Box implements Serializable {
	private int width;
	private int height;
	
	/**
	 * @param width the width to set
	 */
	public void setWidth(int width) {
		this.width = width;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(int height) {
		this.height = height;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Box myBox = new Box();
		myBox.setWidth(20);
		myBox.setHeight(50);
		
		try {
			FileOutputStream fs = new FileOutputStream("foo.ser");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(myBox);
			os.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
