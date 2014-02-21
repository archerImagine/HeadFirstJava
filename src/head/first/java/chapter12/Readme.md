Head First Java Chapter 12
=
This is the twelfth Chapter learning of **Head First Java** by **Kathy Sierra** and **Bert Bates**, 
This markdown file is my notes for the twelfth chapter, not sure if any copyright issues are there.

Event & Graphics
-

### Bullet Points:-

#### Events
* To make a GUI, start with a window, usually a JFrame.

````java
JFrame frame = new JFrame(); 
````

* You can add widgets to the frame using

````java
frame.getContentPane().add(button);
````

* Unlike most other components, the JFrame doesn't let you add to it directly, so you must add to the JFrame's content pane.
* To make the window (JFrame) display you must give it a size and tell it be visible.

````java
frame.setSize(300, 300);
frame.setVisible(true);
```` 

* To know when the user clicks a button, you need to listen for a GUI Event.
* To listen for an event, you must register your interest with an event source. An event source is the thing that 'fires' and event based on user interaction.
* The listener interface gives the event source a way to call you back, because the interface defines the method the event source will call when an event happens.
* To register for events with a source, call the source's registration method. Registration methods always take the form **add<EventType>Listener**. 
* Implement the listener interface by implementing all of the interface event-handling methods. Put your event-handling code in the listener call-back method.

````java
public void actionPerformed(ActionEvent e) {
		button.setText("I have been Clicked");
}
````

* The event object passed into the event-handler method carries information about the event, including the source of the event.  

#### Graphics
* You can draw 2D Graphics directly on to a widget.
* You can draw a .gif or .jpeg directly on to a widget.
* To draw your own graphics make a subclass of JPanel and override the painComponent() method.
* The paintComponet() method is called by the GUI system. YOU NEVER CALL IT YOURSELF. The argument to paintComponent() is a graphics object that gives you a surface to draw on, which will end up on screen.
* Typical methods to call on a Graphics Object are:

````java
	g.setColor(Color.orange);  
	g.fillRect(20, 50, 100, 100); 
````
* The Object referenced by the Graphics parameter to paintComponent() is actually a instance of the Graphics2D class.
* To invoke the Graphics2D methods, you must cast the parameter from a graphics object to a Graphics2D object.


#### Inner Class
* An inner class is a class nested inside another class.

````java
class MyOuterClass{
	class MyInnerClass{
		void go(){
		}
	}
}
````
* An inner class can use all the methods and variables of the outer class even the private ones.
* The inner class gets to use those variables and methods just as if the methods and variables were declared within the inner class.

````java
class MyOuterClass{
	private int x;
	class MyInnerClass{
		void go(){
			x = 42	//use 'x' if it were a variable of the inner class.
		}
	}
}
````

* An inner class instance must be tied to an outer class instance.

````java
class MyOuter{
	private int x;	//The outer class has a private instance variable x
	
	MyInner inner = new MyInner();	//Make an instance of the inner class,
	
	public void doStuff(){
		inner.go();	//call a method on he inner class.
	}
	
	class MyInner{
		void go(){
		x = 45;
		}
	}

}
````

* Inner class is also useful when used as a subclass of something the outer class doesn't extend.
