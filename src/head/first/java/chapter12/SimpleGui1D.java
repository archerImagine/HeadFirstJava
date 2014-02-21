/***
 * SimpleGui1D.java
 * 05-Feb-2014 : 12:19:14 am
 * 
 */
package head.first.java.chapter12;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
 * @author ubuntu
 * @packageName = head.first.java.chapter12:SimpleGui1D.java
 * @createdOn: 05-Feb-2014 : 12:19:14 am
 * 
 * This is a file for my practice and notes of "Head First
 * Java, 2nd edition.".
 * Anyone can fork this repo, also the official code is available 
 * @(http://headfirstlabs.com/books/hfjava/)
 */
public class SimpleGui1D implements ActionListener {
	JFrame frame;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SimpleGui1D gui = new SimpleGui1D();
		gui.go();

	}

	private void go() {
		frame = new JFrame(); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton button = new JButton("Click Me!");
		button.addActionListener(this);
		
		MyDrawPanel1d drawPanel = new MyDrawPanel1d();
		
		frame.getContentPane().add(BorderLayout.SOUTH, button);
		frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
		
		frame.setSize(300, 300);  
		frame.setVisible(true);  
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		frame.repaint();
		
	}

	

}
