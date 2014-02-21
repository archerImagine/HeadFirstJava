/***
 * MyDrawPanel.java
 * 04-Feb-2014 : 11:17:33 pm
 * 
 */
package head.first.java.chapter12;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

/**
 * @author ubuntu
 * @packageName = head.first.java.chapter12:MyDrawPanel.java
 * @createdOn: 04-Feb-2014 : 11:17:33 pm
 * 
 * This is a file for my practice and notes of "Head First
 * Java, 2nd edition.".
 * Anyone can fork this repo, also the official code is available 
 * @(http://headfirstlabs.com/books/hfjava/)
 */
public class MyDrawPanel extends JPanel {
	public void paintComponent(Graphics g) {
		g.setColor(Color.orange);  
		g.fillRect(20, 50, 100, 100); 
	}
}
