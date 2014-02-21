/***
 * Button1Mod4.java
 * 09-Feb-2014 : 7:14:03 pm
 * 
 */
package head.first.java.chapter13;

import java.awt.BorderLayout;

import javax.swing.*;

/**
 * @author ubuntu
 * @packageName = head.first.java.chapter13:Button1Mod4.java
 * @createdOn: 09-Feb-2014 : 7:14:03 pm
 * 
 * This is a file for my practice and notes of "Head First
 * Java, 2nd edition.".
 * Anyone can fork this repo, also the official code is available 
 * @(http://headfirstlabs.com/books/hfjava/)
 */
public class Button1Mod4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Button1Mod4 gui = new Button1Mod4();
		gui.go();

	}

	private void go() {
		JFrame frame = new JFrame();
		
		JButton east = new JButton("East");
		JButton west = new JButton("West");
		JButton north = new JButton("North");
		JButton south = new JButton("South");
		JButton center = new JButton("Center");
		
		
		frame.getContentPane().add(BorderLayout.EAST,east);
		frame.getContentPane().add(BorderLayout.WEST,west);
		frame.getContentPane().add(BorderLayout.NORTH,north);
		frame.getContentPane().add(BorderLayout.SOUTH,south);
		frame.getContentPane().add(BorderLayout.CENTER,center);
		
		frame.setSize(300, 300);
		frame.setVisible(true);
	}

}
