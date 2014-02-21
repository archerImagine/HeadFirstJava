/***
 * Dog.java
 * 18-Jan-2014 : 9:52:15 pm
 * 
 */
package head.first.java.chapter04;

/**
 * @author ubuntu
 * @packageName = head.first.java.chapter04:Dog.java
 * @createdOn: 18-Jan-2014 : 9:52:15 pm
 * 
 * This is a file for my practice and notes of "Head First
 * Java, 2nd edition.".
 * Anyone can fork this repo, also the official code is available 
 * @(http://headfirstlabs.com/books/hfjava/)
 */
public class Dog {
	int size;
	String name;
	
	void bark(){
		if (size > 60) {
			System.out.println("Wooof! Wooof!");
			
		} else if (size > 14){
			System.out.println("Ruff! Ruff!");
		}else{
			System.out.println("Yip! Yip!");
		}
	}

}
