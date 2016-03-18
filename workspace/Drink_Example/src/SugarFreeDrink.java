
public class SugarFreeDrink extends Drink {
	boolean artificalSweeteners;
	SugarFreeDrink(String name, boolean artifical){
		super(name, 0, 20);
		artificalSweeteners = artifical;
	}
	
	public void printDrinkLabel(){
		if(artificalSweeteners){
			System.out.println("This drink is not natural.");
		}
		else{
			System.out.println("This drink has no artificial sweeteners.");
		}
	}
}
