/***
 * TestSyncTest.java
 * 17-Feb-2014 : 11:19:35 pm
 * 
 */
package head.first.java.chapter15;

/**
 * @author ubuntu
 * @packageName = head.first.java.chapter15:TestSyncTest.java
 * @createdOn: 17-Feb-2014 : 11:19:35 pm
 * 
 * This is a file for my practice and notes of "Head First
 * Java, 2nd edition.".
 * Anyone can fork this repo, also the official code is available 
 * @(http://headfirstlabs.com/books/hfjava/)
 */
public class TestSyncTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestSync job = new TestSync();
		Thread a = new Thread(job);
		Thread b = new Thread(job);
		a.setName("Thread A");
		b.setName("Thread B");
		
		a.start();
		b.start();

	}

}
