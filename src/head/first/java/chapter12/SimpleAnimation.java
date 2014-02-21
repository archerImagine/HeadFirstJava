/***
 * SimpleAnimation.java
 * 08-Feb-2014 : 11:12:15 pm
 * 
 */
package head.first.java.chapter12;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * @author ubuntu
 * @packageName = head.first.java.chapter12:SimpleAnimation.java
 * @createdOn: 08-Feb-2014 : 11:12:15 pm
 * 
 * This is a file for my practice and notes of "Head First
 * Java, 2nd edition.".
 * Anyone can fork this repo, also the official code is available 
 * @(http://headfirstlabs.com/books/hfjava/)
 */
public class SimpleAnimation {
	int x = 70;
	int y = 70;		// x,y coordinates of circle.
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SimpleAnimation gui = new SimpleAnimation();
		gui.go();

	}
	private void go() {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MyDrawPanel drawPanel = new MyDrawPanel();
		
		frame.getContentPane().add(drawPanel);
		frame.setSize(300, 300);
		frame.setVisible(true);
		
		for (int i = 0; i < 130; i++) {
			x++;
			y++;
			
			drawPanel.repaint();//ask panel to repaint itself.
			
			try {
				Thread.sleep(50);				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	class MyDrawPanel extends JPanel{
		public void paintComponent(Graphics g){
			//clear the previous rectangle first.
			g.setColor(Color.white);
			g.fillRect(0, 0, this.getWidth(), this.getHeight());
			
			g.setColor(Color.green);
			g.fillOval(x, y, 40, 40);
		}
	}

}
