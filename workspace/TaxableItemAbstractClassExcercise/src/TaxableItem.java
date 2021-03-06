
public abstract class TaxableItem implements Item {

	private double taxRate;
	
	public abstract double getListPrice();
	
	public TaxableItem(double rate){
		taxRate = rate;
	}
	
	//returns the price of the item including the tax
	@Override
	public double purchasePrice() {
		return (getListPrice() * taxRate) + getListPrice();
	}

}
