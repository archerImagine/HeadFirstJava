/***
 * JukeBoxV5.java
 * 20-Feb-2014 : 11:00:01 pm
 * 
 */
package head.first.java.chapter16;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author ubuntu
 * @packageName = head.first.java.chapter16:JukeBoxV5.java
 * @createdOn: 20-Feb-2014 : 11:00:01 pm
 * 
 * This is a file for my practice and notes of "Head First
 * Java, 2nd edition.".
 * Anyone can fork this repo, also the official code is available 
 * @(http://headfirstlabs.com/books/hfjava/)
 */
public class JukeBoxV5 {
	ArrayList<Song> songList = new ArrayList<Song>();
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JukeBoxV5().go();

	}
	/*Create a new inner class that implements Comparator*/
	class ArtistCompare implements Comparator<Song>{

		@Override
		public int compare(Song o1, Song o2) {
			// TODO Auto-generated method stub
			return o1.getArtist().compareTo(o2.getArtist());
		}
		
	}
	
	private void go() {
		// TODO Auto-generated method stub
		getSongs();
		System.out.println(songList);
		Collections.sort(songList);
		System.out.println(songList);
		
		/*Make an instance of the Comparator inner class.*/
		ArtistCompare artistCompare = new ArtistCompare();
		/*Invoke sort() passing it the list and a reference to the new custom Comparator object*/
		Collections.sort(songList, artistCompare);
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
