/***
 * MusicTest1.java
 * 02-Feb-2014 : 5:33:43 pm
 * 
 */
package head.first.java.chapter11;
import javax.sound.midi.*;
/**
 * @author ubuntu
 * @packageName = head.first.java.chapter11:MusicTest1.java
 * @createdOn: 02-Feb-2014 : 5:33:43 pm
 * 
 * This is a file for my practice and notes of "Head First
 * Java, 2nd edition.".
 * Anyone can fork this repo, also the official code is available 
 * @(http://headfirstlabs.com/books/hfjava/)
 */
public class MusicTest1 {
	public void play(){
		/*This below line has a error:-
		 * Unhandled exception type MidiUnavailableException
		 */
		Sequencer sequencer = MidiSystem.getSequencer();
		System.out.println("We got Sequencer.");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MusicTest1 mt = new MusicTest1();
		mt.play();
	}

}
