public class Card {
	public static final int MIN_SUIT = 0;
	public static final int MAX_SUIT = 3;
	public static final int MIN_VALUE = 2;
	public static final int MAX_VALUE = 14;
	
	// Clubs = 0, diamonds = 1, hearts = 2. spades = 3
	private int suit;
	
	// Value = face value of card. 2 = 2... j = 11, q = 12, k = 13, a = 14
	private int value;
	
	public Card(int suit, int value){
		if(suit < MIN_SUIT || suit > MAX_SUIT){
			throw new IllegalArgumentException("Suit is above or below limits: " + suit);
		}
		if(value < MIN_VALUE || value > MAX_VALUE){
			throw new IllegalArgumentException("Value is above or below limits: " + value);
		}
		this.suit = suit;
		this.value = value;				
	}
	
	public int getSuit(){
		return this.suit;
	}
	public int getValue(){
		return this.value;
	}
	
	public String toString(){
		String valueString = "";
		String suitString = "";
		
		if(this.value <= 10){
			valueString = "" + this.value;
		}
		else if (this.value == 11){
			valueString = "J";
		}
		else if (this.value == 12){
			valueString = "Q";
		}
		else if (this.value == 13){
			valueString = "K";
		}
		else if (this.value == 14){
			valueString = "A";
		}
		
		
		if (this.suit == 0){
			suitString = "S";
		}
		else if (this.suit == 1){
			suitString = "D";
		}
		else if (this.suit == 2){
			suitString = "H";
		}
		else if (this.suit == 3){
			suitString = "C";
		}
		
		
		return valueString + suitString;
	}
}
