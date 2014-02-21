/***
 * GameCharacter.java
 * 10-Feb-2014 : 8:23:53 pm
 * 
 */
package head.first.java.chapter14;

import java.io.Serializable;

/**
 * @author ubuntu
 * @packageName = head.first.java.chapter14:GameCharacter.java
 * @createdOn: 10-Feb-2014 : 8:23:53 pm
 * 
 * This is a file for my practice and notes of "Head First
 * Java, 2nd edition.".
 * Anyone can fork this repo, also the official code is available 
 * @(http://headfirstlabs.com/books/hfjava/)
 */
public class GameCharacter implements Serializable {
	int power;
	String type;
	String[] weapons;
	
	public GameCharacter(int p, String t, String[] w){
		power = p;
		type = t;
		weapons = w;
	}

	/**
	 * @return the power
	 */
	public int getPower() {
		return power;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @return the weapons
	 */
	public String getWeapons() {
		String weaponList = "";
		for (int i = 0; i < weapons.length; i++) {
			weaponList += weapons[i] +" ";
		}
		return weaponList;
	}
	
	

}
