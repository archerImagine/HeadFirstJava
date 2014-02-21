Head First Java Chapter 13
=
This is the thirteenth Chapter learning of **Head First Java** by **Kathy Sierra** and **Bert Bates**, 
This markdown file is my notes for the thirteenth chapter, not sure if any copyright issues are there.

Layout Manager
-

### Bullet Points:-
* Layout managers control the size and location of components nested within other components.
* When you add a component to another component, the added component is controlled by the layout manager of the background component.
* A layout manager asks components for their preferred size, before making decision about the layout. Depending on the layout manager's policies, it might respect all, some or none of the components wishes.
* The BorderLayout manager lets you add a component to one of the five regions. You must specify the region when you add the component, using the following syntax.

````java
	frame.getContentPane().add(BorderLayout.NORTH,button);
````

* With BorderLayout, components in the north and south get their preferred height, but not width. Components in the east and west get their preferred width, but not height. The component in the center gets whatever is left over(unless you use **pack()**).
* The pack() method is like shrink-wrap for the components; it uses the full preferred size of the center component, then determines the size of the frame using the center as a starting point, building the rest based on what's in the other regions.
* FlowLayout places components left to right, top to bottom, in the order they were added, wrapping to a new line of components only when the components won't fit horizontally.
* FlowLayout gives components their preferred size in both dimensions.
* BoxLayout lets you align components stacked vertically, even if they could fit side-by-side. Like FlowLayout, BoxLayout uses the preferred size of the component in both dimensions.
* BorderLayout is the default layout manager for a frame, FlowLayout is the default for a panel.
* If you want a panel to use something other than flow, you have to call **setLayout()** on the panel. 