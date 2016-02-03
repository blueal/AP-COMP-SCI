
public class ClientCode {
	Sandwich sandwich1 = new Sandwich("Cheesburger", 2.75);
	Salad salad1 = new Salad("Spinach Salad", 1.25);
	Drink drink1 = new Drink("Orange Soda", 1.00);
	
	System.out.println();
	Trio trio1 = new Trio(sandwich1, salad1, drink1);
	
	System.out.println(trio1);
}
