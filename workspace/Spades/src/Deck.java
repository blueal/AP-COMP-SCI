
public class Deck {
	private Card[] deck;
	
	public Deck(){
		this.deck = new Card[52];
		int i = 0;
		for(int suit = Card.MIN_SUIT; suit <= Card.MAX_SUIT; suit++){
			for(int value = Card.MIN_VALUE; value <= Card.MAX_VALUE; value++){
				this.deck[i] = new Card(suit,value);
				i++;
			}
		}
	}
	
	public String toString(){
		String output = "";
		for(int i = 0; i < 50; i++){
			output += this.deck[i] + ", ";
		}
		output += this.deck[51];
		return output;
	}
}
