/***
 * RunThreads.java
 * 17-Feb-2014 : 11:11:42 pm
 * 
 */
package head.first.java.chapter15;

/**
 * @author ubuntu
 * @packageName = head.first.java.chapter15:RunThreads.java
 * @createdOn: 17-Feb-2014 : 11:11:42 pm
 * 
 * This is a file for my practice and notes of "Head First
 * Java, 2nd edition.".
 * Anyone can fork this repo, also the official code is available 
 * @(http://headfirstlabs.com/books/hfjava/)
 */
public class RunThreads implements Runnable {

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 25; i++) {
			String threadName = Thread.currentThread().getName();
			System.out.println(threadName +" is running");
		}

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RunThreads runner = new RunThreads();
		Thread alpha = new Thread(runner);
		Thread beta = new Thread(runner);
		
		alpha.setName("Alpha Thread");
		beta.setName("Beta Thread");
		
		alpha.start();
		beta.start();

	}

}
