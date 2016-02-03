
public class GroceryItemOrder {
	private String name;
	private int quantity;
	private double pricePerUnit;
	
	public GroceryItemOrder(String name, int quantity, double pricePerUnit){
		this.setName(name);
		this.setQuantity(quantity);
		this.pricePerUnit = pricePerUnit;
	}
		
	public double getCost(){
		return pricePerUnit * (double) quantity;
	}
	
	public int getQuantity(){
		return this.quantity;
	}
	
	public void setQuantity(int quantity){
		this.quantity = quantity;
	}

	public double getPricePerUnit() {
		return pricePerUnit;
	}

	public void setPricePerUnit(double pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString(){
		return this.name + "/" + this.quantity + "/" + this.pricePerUnit;
	}
}
