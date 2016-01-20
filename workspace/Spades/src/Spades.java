import java.util.*;

public class Spades {
	public static void main (String[] args){
		//Card kingClubs = new Card(0,13);
		Card c1 = new Card(0,13);
		Card c2 = new Card(2,12);
		Card c3 = new Card(3,14);
		Card c4 = new Card(0,2);
		Card c5 = new Card(1,10);
		
		Deck deck1 = new Deck();
		
		
		//System.out.println(kingClubs);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		
		System.out.println(deck1);
		deck1.shuffle();
		System.out.println(deck1);
		
		Hand[] hands = deck1.deal();
		for(int i = 0; i < hands.length; i++){
			System.out.println("HAND " + i + ": " + hands[i]);
		}
		
		Scanner console = new Scanner(System.in);
		
		boolean takingInput = true;
		while(takingInput){
			System.out.print("ENTER YA HAND YOU WANT TO REMOVE A CARD FROM: ");
			int deckToRemoveCard = console.nextInt();
			System.out.print("ENTER YA CARD YA WANT TO REMOVE: ");
			String cardToRemove = console.next();
			System.out.println("REMOVING THIS CARD [" + cardToRemove + "] FROM DECK [" + deckToRemoveCard + "]");
			System.out.println("This card has been removed: " + hands[deckToRemoveCard].removeCard(cardToRemove));
			System.out.println("HAND " + deckToRemoveCard + ": " + hands[deckToRemoveCard]);
		}
		
	}

}
