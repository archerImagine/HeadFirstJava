/***
 * MyDrawPanel1d.java
 * 05-Feb-2014 : 12:14:08 am
 * 
 */
package head.first.java.chapter12;

import java.awt.*;
import javax.swing.*;

/**
 * @author ubuntu
 * @packageName = head.first.java.chapter12:MyDrawPanel1d.java
 * @createdOn: 05-Feb-2014 : 12:14:08 am
 * 
 * This is a file for my practice and notes of "Head First
 * Java, 2nd edition.".
 * Anyone can fork this repo, also the official code is available 
 * @(http://headfirstlabs.com/books/hfjava/)
 */
@SuppressWarnings("serial")
public class MyDrawPanel1d extends JPanel {
	public void paintComponent (Graphics g){
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		
		int red = (int) (Math.random() * 255);
		int green = (int) (Math.random() * 255);
		int blue = (int) (Math.random() * 255);
		
		Color randomColor = new Color(red,green,blue);
		g.setColor(randomColor);
		g.fillOval(70, 70, 100, 100);
	}
}
