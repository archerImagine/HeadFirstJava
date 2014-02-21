package head.first.java.chapter12;
import javax.swing.*;
public class SimpleGui1 {

	public static void main(String[] args) {
		//Make a Frame and a button.
		JFrame frame = new JFrame();
		//Pass the button constructor the text you want on the button
		JButton button = new JButton("Click Me!");	
		
		//Makes the program quit as soon as you close the window.
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//add the button to the frame's content pane.
		frame.getContentPane().add(button);
		
		//give frame a size in pixel.
		frame.setSize(300, 300);
		
		//make it visible.
		frame.setVisible(true);
		

	}

}
