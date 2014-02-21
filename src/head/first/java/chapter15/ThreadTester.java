/***
 * ThreadTester.java
 * 17-Feb-2014 : 10:55:37 pm
 * 
 */
package head.first.java.chapter15;

/**
 * @author ubuntu
 * @packageName = head.first.java.chapter15:ThreadTester.java
 * @createdOn: 17-Feb-2014 : 10:55:37 pm
 * 
 * This is a file for my practice and notes of "Head First
 * Java, 2nd edition.".
 * Anyone can fork this repo, also the official code is available 
 * @(http://headfirstlabs.com/books/hfjava/)
 */
public class ThreadTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable threadJob = new MyRunnable();
		Thread myThread = new Thread(threadJob);
		
		myThread.start();
		System.out.println("Back in Main.");

	}

}
