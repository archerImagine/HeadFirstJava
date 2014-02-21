/***
 * TestSync.java
 * 17-Feb-2014 : 11:17:59 pm
 * 
 */
package head.first.java.chapter15;

/**
 * @author ubuntu
 * @packageName = head.first.java.chapter15:TestSync.java
 * @createdOn: 17-Feb-2014 : 11:17:59 pm
 * 
 * This is a file for my practice and notes of "Head First
 * Java, 2nd edition.".
 * Anyone can fork this repo, also the official code is available 
 * @(http://headfirstlabs.com/books/hfjava/)
 */
public class TestSync implements Runnable {
	private int balance;
	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i < 50; i++){
			increment();
			System.out.println(Thread.currentThread().getName() + " balance is " +balance);
		}

	}

	private  void increment() {
		// TODO Auto-generated method stub
		int i = balance;
		balance = i + 1;
		
	}

}
