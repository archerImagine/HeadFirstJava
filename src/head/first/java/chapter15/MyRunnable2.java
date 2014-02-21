/***
 * MyRunnable2.java
 * 17-Feb-2014 : 11:08:55 pm
 * 
 */
package head.first.java.chapter15;

/**
 * @author ubuntu
 * @packageName = head.first.java.chapter15:MyRunnable2.java
 * @createdOn: 17-Feb-2014 : 11:08:55 pm
 * 
 * This is a file for my practice and notes of "Head First
 * Java, 2nd edition.".
 * Anyone can fork this repo, also the official code is available 
 * @(http://headfirstlabs.com/books/hfjava/)
 */
public class MyRunnable2 implements Runnable {

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
		go();

	}

	private void go() {
		// TODO Auto-generated method stub
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		doMore();
		
	}

	private void doMore() {
		// TODO Auto-generated method stub
		System.out.println("Top of the stack.");
		
	}

}
