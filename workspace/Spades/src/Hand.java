
public class Hand {
	
	public static final int HAND_SIZE = 13;
	public static final int NUM_HANDS = 4;
	private Card[] cards;
	
	public Hand(Card[] cards){
		if(cards.length != HAND_SIZE){
			throw new IllegalArgumentException("Card length not equal to " + Hand.HAND_SIZE + ": " + cards.length);
		}
		this.cards = cards;
	}
	
	public Card removeCard(String cardName){
		Card temp = null;
		for(int i = 0; i < this.cards.length; i++){
			if(this.cards[i].toString().equals(cardName)){
				temp = this.cards[i];
				this.cards[i] = null;
				break;
			}
		}
		return temp;
	}
	
	public String toString(){
		//System.out.println(Deck.returnCardsAsString(this.cards));
		return Deck.returnCardsAsString(this.cards);
	}
	
}
