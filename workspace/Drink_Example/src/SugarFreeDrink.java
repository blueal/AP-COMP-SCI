
public class SugarFreeDrink extends Drink {
	SugarFreeDrink(String name, int oz){
		Drink(name, 0, oz);
		this.name = name;
		this.gramsOfSugar = 0;
		this.ounces = oz; 

	}
}
