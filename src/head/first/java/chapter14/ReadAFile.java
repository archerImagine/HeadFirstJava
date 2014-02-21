/***
 * ReadAFile.java
 * 11-Feb-2014 : 8:42:38 pm
 * 
 */
package head.first.java.chapter14;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author ubuntu
 * @packageName = head.first.java.chapter14:ReadAFile.java
 * @createdOn: 11-Feb-2014 : 8:42:38 pm
 * 
 * This is a file for my practice and notes of "Head First
 * Java, 2nd edition.".
 * Anyone can fork this repo, also the official code is available 
 * @(http://headfirstlabs.com/books/hfjava/)
 */
public class ReadAFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			File myFile = new File("Foo.txt");
			FileReader fileReader = new FileReader(myFile);
			BufferedReader reader = new BufferedReader(fileReader);
			
			String line = null;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
			reader.close();			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
