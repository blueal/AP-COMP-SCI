
public class ClientCode {
	public static void main(String[] args) {
		Sandwich sandwich1 = new Sandwich("Cheesburger", 2.75);
		Sandwich sandwich2 = new Sandwich("Hamburger", 1.75);
		Sandwich sandwich3 = new Sandwich("Chickenburger", 3.75);

		Salad salad1 = new Salad("Spinach Salad", 1.25);
		Salad salad2 = new Salad("Ceasor Salad", 1.50);
		Salad salad3 = new Salad("NO Salad", 0.99);
		
		Drink drink1 = new Drink("Orange Soda", 1.00);
		Drink drink2 = new Drink("Water", 0.50);
		Drink drink3 = new Drink("Wine", 0.25);
		
		Trio trio1 = new Trio(sandwich1, salad3, drink2);
		Trio trio2 = new Trio(sandwich3, salad2, drink1);
		Trio trio3 = new Trio(sandwich2, salad1, drink3);
		
		System.out.println(trio1);
		System.out.println(trio2);
		System.out.println(trio3);
	}

}
