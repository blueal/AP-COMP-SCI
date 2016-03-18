
public class AlcoholDrink extends Drink {
	
	private int maxGulp = Integer.MIN_VALUE;

	public AlcoholDrink(String name, int sugar) {
		super(name, sugar, 5);
	}

	public AlcoholDrink(String name, int sugar, int oz) {
		super(name, sugar, 5);
	}
	
    public void printLabel(){
    	System.out.print("You must be 21 years old or older to drink this. ");
    	super.printLabel();
    }

	public int getMaxGulp() {
		return maxGulp;
	}
    
	public boolean chug(int gulp){
		if(gulp > maxGulp && gulp <= this.getOunces()){
			this.maxGulp = gulp;
		}
		return super.chug(gulp);
	}

}
