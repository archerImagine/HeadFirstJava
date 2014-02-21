/***
 * ThreadTester2.java
 * 17-Feb-2014 : 11:10:26 pm
 * 
 */
package head.first.java.chapter15;

/**
 * @author ubuntu
 * @packageName = head.first.java.chapter15:ThreadTester2.java
 * @createdOn: 17-Feb-2014 : 11:10:26 pm
 * 
 * This is a file for my practice and notes of "Head First
 * Java, 2nd edition.".
 * Anyone can fork this repo, also the official code is available 
 * @(http://headfirstlabs.com/books/hfjava/)
 */
public class ThreadTester2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable theJob = new MyRunnable2();
		Thread t = new Thread(theJob);
		
		t.start();
		
		System.out.println("Back in main.");

	}

}
