package warGame;

public class App {

	
	 public static void main(String args[]) {
		 Player player1 = new Player();
		 player1.name = "Assume";
		 Player player2 = new Player();
		 player2.name = "Aggro";
		 Deck deck = new Deck();
		 deck.deckFiller();
		 deck.shuffle();
		 String winner ="";
     	 for (int i = 0; i < 26; i++) {
     		 player2.draw(deck);
     		 player1.draw(deck);
     	 } //draw loop 1
     	System.out.println("Game, Start!");
		 for (int i = 0; i <26; i++) {
			
			 if  (player1.hand.size() != 0 || player2.hand.size() != 0) {
				 System.out.println("Round: " + (i+1));
				 player1.hand.get(0).describe();
				 player2.hand.get(0).describe();
				
				 
				 
			 if (player1.hand.get(0).value > player2.hand.get(0).value) {
				 System.out.println("The winner of this round is player 1");
				 player1.incrementScore();
			 } else if (player1.hand.get(0).value < player2.hand.get(0).value) {
				 System.out.println("The winner of this round is Player 2");
				 player2.incrementScore();
			 } else if (player1.hand.get(0).value == player2.hand.get(0).value) {
				 System.out.println("Draw");
				 
			 } 
			 player1.flip();
			 player2.flip(); //player 2 flips the card
			 System.out.println("The score is: " +player1.score + " to " + player2.score);
			
		 }
	 }
		 System.out.println("Thank you for playing! The final score is: " + player1.score + " to " + player2.score);
		 
		 if (player1.score > player2.score) {
			 winner = player1.name;
		 } else if (player2.score > player1.score) {
			 winner = player2.name;
		 }
		 System.out.println("The winner is: " + winner + "! Congrats!" );
     	
		 
		 
		 
	 } //Main
	 
	 
	 
	 

	 
	 
	 
	 
	 
	 
} //Class
