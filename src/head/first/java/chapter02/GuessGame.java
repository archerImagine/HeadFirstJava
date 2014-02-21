/***
 * GuessGame.java
 * 18-Jan-2014 : 12:42:18 pm
 * 
 */
package head.first.java.chapter02;

/**
 * @author ubuntu
 * @packageName = head.first.java.chapter02:GuessGame.java
 * @createdOn: 18-Jan-2014 : 12:42:18 pm
 * 
 * This is a file for my practice and notes of "Head First
 * Java, 2nd edition.".
 * Anyone can fork this repo, also the official code is available 
 * @(http://headfirstlabs.com/books/hfjava/)
 */
public class GuessGame {
	/* GuessGame has three instance variables,
	 * for three player objects.*/
	Player p1;
	Player p2;
	Player p3;
	
	public void startGame(){
		/* Create three Player Object and assign
		 * them to the three player objects.*/
		p1 = new Player();
		p2 = new Player();
		p3 = new Player();
		
		/* Declare three variables to hold the three guess
		 * the player make.*/
		int guessp1 = 0;
		int guessp2 = 0;
		int guessp3 = 0;
		
		/* Declare three vaiable to hold a true or false
		 * based on the player answer.*/
		boolean p1isRight = false;
		boolean p2isRight = false;
		boolean p3isRight = false;
		
		/* Make a target number that player has to guess*/
		int targetNumber = (int) (Math.random() * 10);
		System.out.println("I'm thinking of a number between 0 and 9....");
		
		while (true) {
			System.out.println("Number to guess is " +targetNumber);
			
			/*Call each player guess() method*/
			p1.guess();
			p2.guess();
			p3.guess();
			
			/* Get each player guess, by accessing the number
			 * variable of each player*/
			guessp1 = p1.number;
			System.out.println("Player one guessed " +guessp1);
			
			guessp2 = p2.number;
			System.out.println("Player two guessed " +guessp2);
			
			guessp3 = p3.number;
			System.out.println("Player three guessed " +guessp3);
			
			/* check each player guess w.r.t target number*/
			if(guessp1 == targetNumber){
				p1isRight = true;
			}
			if(guessp2 == targetNumber){
				p2isRight = true;
			}
			if(guessp3 == targetNumber){
				p3isRight = true;
			}
			
			/* if player one OR player two or player three, is right,
			 * */
			if (p1isRight || p2isRight || p3isRight) {
				System.out.println("We have a winner!!");
				System.out.println("Player one got it right? " +p1isRight);
				System.out.println("Player two got it right? " +p2isRight);
				System.out.println("Player three got it right? " +p3isRight);
				System.out.println("Game Over!!");
				break;		//game over, so break out of the loop.
			}else{
				//we must keep going because no one got it right.
				System.out.println("Player will have to try again");
			}	//end if/else
			
		}// end loop
	} //end method
}	//end class
