
public class main {

	public static void main(String[] args) {
		Vehicle car1 = new Vehicle(20000.00, 2500.00, .10);
		
		System.out.println(car1.getListPrice());
		System.out.println(car1.purchasePrice());
		
		car1.changeMarkup(2000.00);
		
		System.out.println(car1.getListPrice());
		System.out.println(car1.purchasePrice());
	}

}
