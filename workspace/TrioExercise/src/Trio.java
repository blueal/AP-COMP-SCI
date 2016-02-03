
public class Trio implements MenuItem{
	private String name;
	private double price;
	
	public Trio (Sandwich sandwich, Salad salad, Drink drink){
		this.setName(sandwich.getName() + "/" + salad.getName() + "/" + drink.getName());
		
		//Find the highest 2 priced items
		if(sandwich.getPrice() >= salad.getPrice()){
			this.price += sandwich.getPrice();
			if(salad.getPrice() >= drink.getPrice()){
				this.price += drink.getPrice();
			}
			else{
				this.price += drink.getPrice();
			}
		}
		else{
			this.price += salad.getPrice();
		}
	}
	
	public String getName() {
		return name + " $" + this.getPrice();
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
