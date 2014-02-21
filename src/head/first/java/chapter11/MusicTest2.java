/***
 * MusicTest2.java
 * 02-Feb-2014 : 5:36:44 pm
 * 
 */
package head.first.java.chapter11;
import javax.sound.midi.*;

/**
 * @author ubuntu
 * @packageName = head.first.java.chapter11:MusicTest2.java
 * @createdOn: 02-Feb-2014 : 5:36:44 pm
 * 
 * This is a file for my practice and notes of "Head First
 * Java, 2nd edition.".
 * Anyone can fork this repo, also the official code is available 
 * @(http://headfirstlabs.com/books/hfjava/)
 */
public class MusicTest2 {
	public void play(){
		try {
			Sequencer sequencer = MidiSystem.getSequencer();
			System.out.println("We got Sequencer.");
		} catch (MidiUnavailableException e) {
			e.printStackTrace();
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MusicTest2 mt = new MusicTest2();
		mt.play();
	}

}
