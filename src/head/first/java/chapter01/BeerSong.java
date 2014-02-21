package head.first.java.chapter01;
/**
 * 
 * @author ubuntu
 * @packageName = head.first.java.chapter01:BeerSong.java
 * @createdOn: 18-Jan-2014 : 12:19:50 am
 * 
 * This is a file for my practice and notes of "Head First
 * Java, 2nd edition.".
 * Anyone can fork this repo, also the official code is available 
 * @(http://headfirstlabs.com/books/hfjava/)
 */

public class BeerSong {

	public static void main(String[] args) {
		int beerNum = 99;
		String word = "bottles";
		
		while (beerNum >0) {
			if (beerNum == 1) {
				word = "bottle";	//singular, as in one bottle.				
			}
			System.out.println(beerNum +" " +word +" of beer on the wall");
			System.out.println(beerNum +" " +word +" of beer");
			System.out.println("Take one down");
			System.out.println("Pass it around");
			
			beerNum = beerNum -1;
			
			if (beerNum > 0) {
				System.out.println(beerNum +" " +word +" of beer on the wall");
			}else{
				System.out.println("No more bottles of beer on the wall");
			}
		}
	}

}
