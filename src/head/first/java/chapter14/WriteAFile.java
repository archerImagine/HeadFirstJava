/***
 * WriteAFile.java
 * 11-Feb-2014 : 8:39:07 pm
 * 
 */
package head.first.java.chapter14;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author ubuntu
 * @packageName = head.first.java.chapter14:WriteAFile.java
 * @createdOn: 11-Feb-2014 : 8:39:07 pm
 * 
 * This is a file for my practice and notes of "Head First
 * Java, 2nd edition.".
 * Anyone can fork this repo, also the official code is available 
 * @(http://headfirstlabs.com/books/hfjava/)
 */
public class WriteAFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter writer = new FileWriter("Foo.txt");
			writer.write("hello foo!");
			writer.close();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
