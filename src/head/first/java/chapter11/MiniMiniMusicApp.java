/***
 * MiniMiniMusicApp.java
 * 02-Feb-2014 : 8:04:56 pm
 * 
 */
package head.first.java.chapter11;
import javax.sound.midi.*;
/**
 * @author ubuntu
 * @packageName = head.first.java.chapter11:MiniMiniMusicApp.java
 * @createdOn: 02-Feb-2014 : 8:04:56 pm
 * 
 * This is a file for my practice and notes of "Head First
 * Java, 2nd edition.".
 * Anyone can fork this repo, also the official code is available 
 * @(http://headfirstlabs.com/books/hfjava/)
 */
public class MiniMiniMusicApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MiniMiniMusicApp mini = new MiniMiniMusicApp();
		System.out.println("In Main");
		mini.play();

	}
	
	public void play(){
		try {
			//get a Sequencer and open it.
			System.out.println("1");
			Sequencer player = MidiSystem.getSequencer();
			player.open();
			
			System.out.println("2");
			Sequence seq = new Sequence(Sequence.PPQ, 4);
			Track track = seq.createTrack();
			
			System.out.println("3");
			ShortMessage a = new ShortMessage();
			a.setMessage(144, 1, 44, 100);
			MidiEvent noteOn = new MidiEvent(a, 1);
			track.add(noteOn);
			
			System.out.println("4");
			ShortMessage b = new ShortMessage();
			b.setMessage(128, 1, 44, 100);
			MidiEvent noteOff = new MidiEvent(b, 16);
			track.add(noteOff);
			
			System.out.println("5");			
			player.setSequence(seq);
			player.start();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
