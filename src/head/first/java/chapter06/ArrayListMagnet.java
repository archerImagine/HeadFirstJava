/***
 * ArrayListMagnet.java
 * 19-Jan-2014 : 7:58:30 pm
 * 
 */
package head.first.java.chapter06;
import java.util.*;
/**
 * @author ubuntu
 * @packageName = head.first.java.chapter06:ArrayListMagnet.java
 * @createdOn: 19-Jan-2014 : 7:58:30 pm
 * 
 * This is a file for my practice and notes of "Head First
 * Java, 2nd edition.".
 * Anyone can fork this repo, also the official code is available 
 * @(http://headfirstlabs.com/books/hfjava/)
 */
public class ArrayListMagnet {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<String>a = new ArrayList<String>();
		a.add(0, "zero");
		a.add(1, "one");
		a.add(2, "two");
		a.add(3, "three");
		printAL(a);
		if (a.contains("three")) {
			a.add("four");
		}
		a.remove(2);
		printAL(a);
		if(a.indexOf("four") !=4){
			a.add(4, "4.2");
		}
		printAL(a);
		if(a.contains("two")){
			a.add("2.2");
		}
		printAL(a);
	}
	
	public static void printAL(ArrayList<String>al){
		for (String element : al) {
			System.out.print(element +" ");
		}
		System.out.println(" ");
	}

}
