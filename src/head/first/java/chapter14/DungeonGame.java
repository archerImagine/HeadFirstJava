/***
 * DungeonGame.java
 * 11-Feb-2014 : 8:54:02 pm
 * 
 */
package head.first.java.chapter14;

import java.io.Serializable;

/**
 * @author ubuntu
 * @packageName = head.first.java.chapter14:DungeonGame.java
 * @createdOn: 11-Feb-2014 : 8:54:02 pm
 * 
 * This is a file for my practice and notes of "Head First
 * Java, 2nd edition.".
 * Anyone can fork this repo, also the official code is available 
 * @(http://headfirstlabs.com/books/hfjava/)
 */
public class DungeonGame implements Serializable {
	public int x = 3;
	transient long y = 4;
	private short z = 5;
	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}
	/**
	 * @return the y
	 */
	public long getY() {
		return y;
	}
	/**
	 * @return the z
	 */
	public short getZ() {
		return z;
	}
	
	
}
