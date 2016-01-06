
public class Hand {
	
	private static final int HAND_SIZE = 13;
	private Card[] cards;
	
	public Hand(Card[] cards){
		if(cards.length != HAND_SIZE){
			throw new IllegalArgumentException("Card length not equal to 13: " + cards.length);
		}
	}
	
	public String toString(){
		
	}
}
