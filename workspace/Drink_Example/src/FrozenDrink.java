
public class FrozenDrink extends Drink {

	public FrozenDrink(String name, int sugar) {
		super(name, sugar);
	}

	public FrozenDrink(String name, int sugar, int oz) {
		super(name, sugar, oz);
	}
	
	public String getState() { return "frozen"; } 
	
	 public boolean chug(int gulp){
		 if(gulp > 2){
			 System.out.println("You cannot gulp more than 2 ounces or else you'll get brain freeze!");
			 return false;
		 }
		 return super.chug(gulp);
	 }

}
