import java.util.*;

public class Deck {
	private Card[] deck;
	public static final int DECK_SIZE = 52;
	
	public Deck(){
		this.deck = new Card[DECK_SIZE];
		int i = 0;
		for(int suit = Card.MIN_SUIT; suit <= Card.MAX_SUIT; suit++){
			for(int value = Card.MIN_VALUE; value <= Card.MAX_VALUE; value++){
				this.deck[i] = new Card(suit,value);
				i++;
			}
		}
	}
	
	public void shuffle(){
		for(int i = this.deck.length - 1; i >= 0; i--){
			int random = (int) (i * Math.random());
			Card temp = this.deck[random];
			this.deck[random] = this.deck[i];
			this.deck[i] = temp;
		}
	}
	
	public Hand[] deal(){
		Hand[] hands = new Hand[Hand.NUM_HANDS];
		
		for(int i = 0; i < hands.length; i++){
			
			int startHand = i * Hand.HAND_SIZE;
			int endHand = startHand + Hand.HAND_SIZE;
			
			Card[] c = Arrays.copyOfRange(this.deck, startHand, endHand );
			hands[i] = new Hand(c);
			
		}
		return hands;
	}
	
	public static String returnCardsAsString(Card[] cardsArray){
		if(cardsArray == null || cardsArray.length == 0){
			return "";
		}
		else if (cardsArray.length == 1){
			return "" + cardsArray[0];
		}
		else{
			String output = "";
			for(int i = 0; i < cardsArray.length - 1; i++){
				output += cardsArray[i] + ", ";
			}
			output += cardsArray[cardsArray.length - 1];
			return output;
		}
	}
	
	public String toString(){
		return returnCardsAsString(this.deck);
		/*String output = "";
		for(int i = 0; i < this.deck.length - 2; i++){
			output += this.deck[i] + ", ";
		}
		output += this.deck[this.deck.length - 1];
		return output;
		*/
	}
}
