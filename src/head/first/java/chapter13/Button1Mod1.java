/***
 * Button1Mod.java
 * 09-Feb-2014 : 7:06:50 pm
 * 
 */
package head.first.java.chapter13;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * @author ubuntu
 * @packageName = head.first.java.chapter13:Button1Mod.java
 * @createdOn: 09-Feb-2014 : 7:06:50 pm
 * 
 * This is a file for my practice and notes of "Head First
 * Java, 2nd edition.".
 * Anyone can fork this repo, also the official code is available 
 * @(http://headfirstlabs.com/books/hfjava/)
 */
public class Button1Mod1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Button1Mod1 gui = new Button1Mod1();
		gui.go();
	}

	private void go() {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		JButton button = new JButton("Click like you mean it.");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().add(BorderLayout.EAST,button);
		
		frame.setSize(200, 200);
		frame.setVisible(true);		
	}

}
