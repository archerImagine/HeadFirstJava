/***
 * GoodDog.java
 * 18-Jan-2014 : 9:56:27 pm
 * 
 */
package head.first.java.chapter04;

/**
 * @author ubuntu
 * @packageName = head.first.java.chapter04:GoodDog.java
 * @createdOn: 18-Jan-2014 : 9:56:27 pm
 * 
 * This is a file for my practice and notes of "Head First
 * Java, 2nd edition.".
 * Anyone can fork this repo, also the official code is available 
 * @(http://headfirstlabs.com/books/hfjava/)
 */
public class GoodDog {
	private int size;

	/**
	 * @return the size
	 */
	public int getSize() {
		return size;
	}

	/**
	 * @param size the size to set
	 */
	public void setSize(int size) {
		this.size = size;
	}
	
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
