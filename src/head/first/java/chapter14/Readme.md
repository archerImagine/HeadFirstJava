Head First Java Chapter 14
=
This is the fourteenth Chapter learning of **Head First Java** by **Kathy Sierra** and **Bert Bates**, 
This markdown file is my notes for the fourteenth chapter, not sure if any copyright issues are there.

Serialization & File I/O
-

### Bullet Points (Serialization):-
* You can save an Object's state by serializing the Object.
* To serialize an object, you need an ObjectOutputStream.
* Streams are either connection streams or chain streams.
* Connections streams can represent a connection to a source or destination, typically file, network socket connection, or the console.
* Chain streams cannot connect to a source or destination and must be chained to a connection stream.
* To serialize an object, call *writeObject(theObject)* on the ObjectOutputStream. You do not need to call methods on the FileOutputStream.
* To be serialized, an object must implement the Serializable interface. If a superclass of the class implements Serializable, the subclass will automatically be serializable even if it does not specifically declare implements serializable.
* When an object is serialized, its entire object graph is serialized. That means any objects referenced by the serialized objects instance variable are serialized, and any object referenced by those object .. and so on.
* If any object in the graph is not serializable, an exception will be thrown at runtime, unless the instance variable referring to the object is skipped.
* Mark an instance variable with the *transient* keyword if you want serialization to skip that variable. The variable will be restored as null or default values.
* During deserialization, the class of all objects in the graph must be available to the JVM.
* You read object in (using readObject()) in the order in which they were originally written.
* The return type of readObject() is type Object, so deserialized objects must be cast to their real type.
* Static variables are not serialized! it doesn't make sense to save a static variable value as part of a specific object's state, since all objects of that type share only a single value - the one in the class.

### Bullet Points (File IO):-
* To write a text file, start with a FileWriter connection stream.
* Chain the FileWriter to a BufferedWriter for efficiency.
* A File object represent a file at a particular path, but does not represent the actual content of the file.
* With a File Object you can create, traverse, and delete directories.
* Most Streams that can use a String filename can use a File Object as well, and a File Object can be safer to use.
* To read a text file, start with a FileReader connection stream.
* Chain the FileReader to a BufferedReader for efficiency.
* To parse a text file, you need to be sure the file is written with some way to recognize the different elements. A common approach is to use some kind of character to separate the individual pieces.
* Use the String Split() method to split a String up into individual tokens. A String with one separator will have two tokens, one on each side of the separator. The *separator* doesn't count as a token.