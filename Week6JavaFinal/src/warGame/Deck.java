package warGame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	static List<Card> cards = new ArrayList<Card>(); //the deck of cards, or a list of the class of Card
	
	public void deckFiller() {
		
		
		
		for (int i = 2; i < 11; i++) { //adding the of hearts cards
			Card temporaryCard = new Card();
			temporaryCard.value = i;
			temporaryCard.name = " Of Hearts";
			cards.add(temporaryCard);
				// TODO Auto-generated catch block

			
		}
			for (int i = 2; i < 11; i++) { //adding the of Diamonds cards
				Card temporaryCard = new Card();
				temporaryCard.value = i;
				temporaryCard.name = " Of Diamonds";
					cards.add(temporaryCard);
				
			}
			for (int i = 2; i < 11; i++) { //adding the of clubs cards
				Card temporaryCard = new Card();
				temporaryCard.value = i;
				temporaryCard.name = " Of Clubs";
					cards.add(temporaryCard);
				
			}
			for (int i = 2; i < 11; i++) { //adding the of Spades cards
				Card temporaryCard = new Card();
				temporaryCard.value = i;
				temporaryCard.name = " Of Spades";	
					cards.add(temporaryCard);
			}
			
			
			Card KingofHearts = new Card();
			KingofHearts.value = 14;
			KingofHearts.name = " King of Hearts";
			cards.add(KingofHearts);
			Card KingofSpades = new Card();
			KingofSpades.value = 14;
			KingofSpades.name = " King of Spades";
			cards.add(KingofSpades);
			Card KingofClubs = new Card();
			KingofClubs.value = 14;
			KingofClubs.name = " King of Clubs";
			cards.add(KingofClubs);
			Card KingofDiamonds = new Card();
			KingofDiamonds.value = 14;
			KingofDiamonds.name = " King of Diamonds";
			cards.add(KingofDiamonds);
			
			Card QueenofHearts = new Card();
			QueenofHearts.value =13;
			QueenofHearts.name = " Queen of Hearts";
			cards.add(QueenofHearts);
			Card QueenofSpades = new Card();
			QueenofSpades.value =13;
			QueenofSpades.name = " Queen of Spades";
			cards.add(QueenofSpades);
			Card QueenofClubs = new Card();
			QueenofClubs.value =13;
			QueenofClubs.name = " Queen of Clubs";
			cards.add(QueenofClubs);
			Card QueenofDiamonds = new Card();
			QueenofDiamonds.value =13;
			QueenofDiamonds.name = " Queen of Hearts";
			cards.add(QueenofDiamonds);
			
			Card JackofHearts = new Card();
			JackofHearts.value =12;
			JackofHearts.name = " Jack of Hearts";
			cards.add(JackofHearts);
			Card JackofSpades = new Card();
			JackofSpades.value =12;
			JackofSpades.name = " Jack of Spades";
			cards.add(JackofSpades);
			Card JackofClubs = new Card();
			JackofClubs.value =12;
			JackofClubs.name = " Jack of Clubs";
			cards.add(JackofClubs);
			Card JackofDiamonds = new Card();
			JackofDiamonds.value =12;
			JackofDiamonds.name = " Jack of Diamonds";
			cards.add(JackofDiamonds);
			
			Card AceofHearts = new Card();
			AceofHearts.value = 11;
			AceofHearts.name = " Ace of Hearts";
			cards.add(AceofHearts);
			Card AceofSpades = new Card();
			AceofSpades.value = 11;
			AceofSpades.name = " Ace of Spades";
			cards.add(AceofSpades);
			Card AceofClubs = new Card();
			AceofClubs.value = 11;
			AceofClubs.name = " Ace of Clubs";
			cards.add(AceofClubs);
			Card AceofDiamonds = new Card();
			AceofDiamonds.value = 11;
			AceofDiamonds.name = " Ace of Diamonds";
			cards.add(AceofDiamonds);
		}
			

		

	public void shuffle() {
		try {
			Collections.shuffle(cards);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public Card draw () {
		Card temporaryCard = new Card();
		if (cards.size() != 0) {
		temporaryCard.value = cards.get(0).value;
		temporaryCard.name = cards.get(0).name;
		cards.remove(0); }
		return temporaryCard;
	}
}
