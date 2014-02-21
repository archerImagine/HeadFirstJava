package head.first.java.chapter01;
/**
 * 
 * @author ubuntu
 * @packageName = head.first.java.chapter01:PhraseOMatic.java
 * @createdOn: 18-Jan-2014 : 12:30:03 am
 * 
 * This is a file for my practice and notes of "Head First
 * Java, 2nd edition.".
 * Anyone can fork this repo, also the official code is available 
 * @(http://headfirstlabs.com/books/hfjava/)
 */

public class PhraseOMatic {

	public static void main(String[] args) {
		//Make three sets of words to choose from.
		//Creating string arrays
		String[] wordListOne = {"24/7", "multi-Tier","30,000 foot","B-to-B","win-win",
								"front-end","web-based","pervasive","smart","six-sigma","critical-path","dynamic"};
		String[] wordListTwo = {"empowered","sticky","value-added","oriented","centric","distributed","clustered",
								"branded","outside-the-box","positioned","networked","focussed","leveraged","aligned",
								"targeted","shared","cooperative","accelerated"};
		String[] wordListThree = {"process","tipping-point","solution","architecture","core competency","strategy",
								"mindshare","portal","space","vision","paradigm","mission"};
		
		//find out how many words are in each list.
		//Java array has a property which will tell its own length.
		int oneLength = wordListOne.length;
		int twoLength = wordListTwo.length;
		int threeLength = wordListThree.length;
		
		//generate three random numbers.
		int rand1 = (int)(Math.random() * oneLength);
		int rand2 = (int)(Math.random() * twoLength);
		int rand3 = (int)(Math.random() * threeLength);
		
		//now build a phrase.
		//the + operator concatenates the words.
		String phrase = wordListOne[rand1] +" " +wordListTwo[rand2] +" " +wordListThree[rand3];
		
		//print the phrase.
		System.out.println("What we want is a " +phrase);
	}

}
