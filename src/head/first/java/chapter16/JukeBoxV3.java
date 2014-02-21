/***
 * JukeBoxV3.java
 * 20-Feb-2014 : 12:25:40 am
 * 
 */
package head.first.java.chapter16;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;

/**
 * @author ubuntu
 * @packageName = head.first.java.chapter16:JukeBoxV3.java
 * @createdOn: 20-Feb-2014 : 12:25:40 am
 * 
 * This is a file for my practice and notes of "Head First
 * Java, 2nd edition.".
 * Anyone can fork this repo, also the official code is available 
 * @(http://headfirstlabs.com/books/hfjava/)
 */
public class JukeBoxV3 {
	ArrayList<Song> songList = new ArrayList<Song>();
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JukeBoxV3().go();
	}

	private void go() {
		// TODO Auto-generated method stub
		getSongs();
		System.out.println(songList);
		
		//This line gives an compile error:-
		//Bound mismatch: The generic method sort(List<T>) of type Collections is not applicable 
		//for the arguments (ArrayList<Song>). The inferred type Song is not a valid substitute 
		//for the bounded parameter <T extends Comparable<? super T>>

		Collections.sort(songList);
		System.out.println(songList);
		
	}

	private void getSongs() {
		// TODO Auto-generated method stub
		try {
			File file = new File("SongListMore.txt");
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line = null;
			
			while((line = reader.readLine()) != null){
				addSong(line);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	private void addSong(String line) {
		// TODO Auto-generated method stub
		String [] tokens = line.split("/");
		Song nextSong = new Song(tokens[0], tokens[1],tokens[2],tokens[3]);
		songList.add(nextSong);	
		
	}

}
