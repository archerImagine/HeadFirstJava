/***
 * DrumKitTestDrive.java
 * 18-Jan-2014 : 1:03:02 pm
 * 
 */
package head.first.java.chapter02;

/**
 * @author ubuntu
 * @packageName = head.first.java.chapter02:DrumKitTestDrive.java
 * @createdOn: 18-Jan-2014 : 1:03:02 pm
 * 
 * This is a file for my practice and notes of "Head First
 * Java, 2nd edition.".
 * Anyone can fork this repo, also the official code is available 
 * @(http://headfirstlabs.com/books/hfjava/)
 */
public class DrumKitTestDrive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Drumkit d = new Drumkit();
		d.playSnare();
		
		d.snare = false;
		if (d.snare == true) {
			d.playSnare();
		}
		d.playTopHat();

	}

}
