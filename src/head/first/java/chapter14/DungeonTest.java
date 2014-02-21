/***
 * DungeonTest.java
 * 11-Feb-2014 : 8:55:10 pm
 * 
 */
package head.first.java.chapter14;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

/**
 * @author ubuntu
 * @packageName = head.first.java.chapter14:DungeonTest.java
 * @createdOn: 11-Feb-2014 : 8:55:10 pm
 * 
 * This is a file for my practice and notes of "Head First
 * Java, 2nd edition.".
 * Anyone can fork this repo, also the official code is available 
 * @(http://headfirstlabs.com/books/hfjava/)
 */
public class DungeonTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DungeonGame d = new DungeonGame();
		System.out.println(d.getX() +d.getY() +d.getZ());
		try {
			FileOutputStream fos = new FileOutputStream("dg.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(d);
			oos.close();
			FileInputStream fis = new FileInputStream("dg.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			d = (DungeonGame) ois.readObject();
			ois.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(d.getX() +d.getY() +d.getZ());
	}

}
