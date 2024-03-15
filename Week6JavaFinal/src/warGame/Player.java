package warGame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Player {
	List<Card> hand = new ArrayList<Card>();
	int score = 0;
	String name;
	
	public void describe() {
		System.out.println(name + "'s hand: ");
		for (Card cards : hand) {
			
			cards.describe();
		}
	}
	
	public Card flip() {
		Card temporaryCard = new Card();
		if (hand.size() != 0) {
			
			temporaryCard.value = hand.get(0).value;
			temporaryCard.name = hand.get(0).name;
			hand.remove(0);
		} 
		return temporaryCard;
	}
	
	public void draw(Deck deck) {
		hand.add(deck.draw());
	}
	
	public int incrementScore() {
		score++;
		
		return score;
		
	}
	public void shuffle() {
		try {
			Collections.shuffle(hand);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
