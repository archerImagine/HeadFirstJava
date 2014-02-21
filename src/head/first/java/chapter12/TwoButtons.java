/***
 * TwoButtons.java
 * 08-Feb-2014 : 8:38:58 pm
 * 
 */
package head.first.java.chapter12;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
 * @author ubuntu
 * @packageName = head.first.java.chapter12:TwoButtons.java
 * @createdOn: 08-Feb-2014 : 8:38:58 pm
 * 
 * This is a file for my practice and notes of "Head First
 * Java, 2nd edition.".
 * Anyone can fork this repo, also the official code is available 
 * @(http://headfirstlabs.com/books/hfjava/)
 */
public class TwoButtons {
	JFrame frame;
	JLabel label;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TwoButtons gui = new TwoButtons();
		gui.go();

	}

	private void go() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton labelButton = new JButton("Change Label");
		labelButton.addActionListener(new LabelListener());
		
		JButton colorButton = new JButton("Change Circle");
		colorButton.addActionListener(new ColorListener());
		
		label = new JLabel("I'm a label");
		MyDrawPanel1d drawPanel = new MyDrawPanel1d();
		
		frame.getContentPane().add(BorderLayout.SOUTH, colorButton);
		frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
		frame.getContentPane().add(BorderLayout.EAST, labelButton);
		frame.getContentPane().add(BorderLayout.WEST, label);
		
		frame.setSize(300, 300);
		frame.setVisible(true);		
	}
	
	class LabelListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			label.setText("Ouch");	//inner class knows about label			
		}		
	}	//close of inner class
	
	class ColorListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			frame.repaint();// the inner class gets to use the frame
		}		
	}	//close of inner class
}
