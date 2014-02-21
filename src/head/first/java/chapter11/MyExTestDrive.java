/***
 * MyEx.java
 * 02-Feb-2014 : 8:13:04 pm
 * 
 */
package head.first.java.chapter11;

/**
 * @author ubuntu
 * @packageName = head.first.java.chapter11:MyEx.java
 * @createdOn: 02-Feb-2014 : 8:13:04 pm
 * 
 * This is a file for my practice and notes of "Head First
 * Java, 2nd edition.".
 * Anyone can fork this repo, also the official code is available 
 * @(http://headfirstlabs.com/books/hfjava/)
 */
class MyEx extends Exception{}
public class MyExTestDrive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String test = args[0];
		try {
			System.out.print("t");
			doRisky(test);
			System.out.print("o");
			
		} catch (MyEx e) {
			System.out.print("a");
		}finally{
			System.out.print("w");
		}
		System.out.println("s");

	}
	
	static void doRisky(String t) throws MyEx{
		System.out.print("h");
		if("yes".equals(t)){
			throw new MyEx();
		}
		System.out.print("r");
	}

}
