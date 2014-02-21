/***
 * JukeBoxV2.java
 * 18-Feb-2014 : 11:15:47 pm
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
 * @packageName = head.first.java.chapter16:JukeBoxV2.java
 * @createdOn: 18-Feb-2014 : 11:15:47 pm
 * 
 * This is a file for my practice and notes of "Head First
 * Java, 2nd edition.".
 * Anyone can fork this repo, also the official code is available 
 * @(http://headfirstlabs.com/books/hfjava/)
 */
public class JukeBoxV2 {
	ArrayList<String> songList = new ArrayList<String>();

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JukeBoxV2().go();

	}

	private void go() {
		// TODO Auto-generated method stub
		getSongs();
		System.out.println(songList);
		
		Collections.sort(songList);
		System.out.println(songList);
		
	}

	private void getSongs() {
		// TODO Auto-generated method stub
		try {
			File file = new File("SongList.txt");
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
		songList.add(tokens[0]);		
	}

}
