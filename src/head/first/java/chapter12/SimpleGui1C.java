/***
 * SimpleGui1C.java
 * 04-Feb-2014 : 11:18:19 pm
 * 
 */
package head.first.java.chapter12;

import javax.swing.JFrame;

/**
 * @author ubuntu
 * @packageName = head.first.java.chapter12:SimpleGui1C.java
 * @createdOn: 04-Feb-2014 : 11:18:19 pm
 * 
 * This is a file for my practice and notes of "Head First
 * Java, 2nd edition.".
 * Anyone can fork this repo, also the official code is available 
 * @(http://headfirstlabs.com/books/hfjava/)
 */
public class SimpleGui1C {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SimpleGui1C gui = new SimpleGui1C();  
		gui.go(); 
	}

	private void go() {
		JFrame frame = new JFrame(); 
		MyDrawPanel m = new MyDrawPanel(); 
		frame.getContentPane().add(m);  
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
		frame.setSize(300, 300);  
		frame.setVisible(true);  
	}

}
