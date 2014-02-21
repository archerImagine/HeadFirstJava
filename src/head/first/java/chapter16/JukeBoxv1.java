/***
 * JukeBoxv1.java
 * 18-Feb-2014 : 11:03:19 pm
 * 
 */
package head.first.java.chapter16;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

/**
 * @author ubuntu
 * @packageName = head.first.java.chapter16:JukeBoxv1.java
 * @createdOn: 18-Feb-2014 : 11:03:19 pm
 * 
 * This is a file for my practice and notes of "Head First
 * Java, 2nd edition.".
 * Anyone can fork this repo, also the official code is available 
 * @(http://headfirstlabs.com/books/hfjava/)
 */
public class JukeBoxv1 {
	ArrayList<String> songList = new ArrayList<String>();

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JukeBoxv1().go();

	}

	private void go() {
		// TODO Auto-generated method stub
		getSongs();
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
