/***
 * Panel1Mod3.java
 * 09-Feb-2014 : 7:27:09 pm
 * 
 */
package head.first.java.chapter13;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * @author ubuntu
 * @packageName = head.first.java.chapter13:Panel1Mod3.java
 * @createdOn: 09-Feb-2014 : 7:27:09 pm
 * 
 * This is a file for my practice and notes of "Head First
 * Java, 2nd edition.".
 * Anyone can fork this repo, also the official code is available 
 * @(http://headfirstlabs.com/books/hfjava/)
 */
public class Panel1Mod3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Panel1Mod3 gui = new Panel1Mod3();
		gui.go();
	}

	private void go() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		
		panel.setBackground(Color.darkGray);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		JButton button = new JButton("Shock Me!");
		JButton button1 = new JButton("Bliss!");
		
		panel.add(button);
		panel.add(button1);
		frame.getContentPane().add(BorderLayout.EAST,panel);
		
		frame.setSize(200, 200);
		frame.setVisible(true);
		
	}

}
