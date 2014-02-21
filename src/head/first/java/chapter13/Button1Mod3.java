/***
 * Button1Mod3.java
 * 09-Feb-2014 : 7:11:08 pm
 * 
 */
package head.first.java.chapter13;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * @author ubuntu
 * @packageName = head.first.java.chapter13:Button1Mod3.java
 * @createdOn: 09-Feb-2014 : 7:11:08 pm
 * 
 * This is a file for my practice and notes of "Head First
 * Java, 2nd edition.".
 * Anyone can fork this repo, also the official code is available 
 * @(http://headfirstlabs.com/books/hfjava/)
 */
public class Button1Mod3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Button1Mod3 gui = new Button1Mod3();
		gui.go();
	}

	private void go() {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		JButton button = new JButton("There is no spoon.");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Font bigFont = new Font("serif", Font.BOLD, 28);
		button.setFont(bigFont);
		
		frame.getContentPane().add(BorderLayout.NORTH,button);
		
		frame.setSize(200, 200);
		frame.setVisible(true);	
		
	}

}
