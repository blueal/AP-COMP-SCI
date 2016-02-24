
public class Vehicle extends TaxableItem {

	private double dealerCost;
	private double markUp;
	
	public Vehicle(double dealerCost, double dealerMarkup, double rate) {
		super(rate);
		this.dealerCost = dealerCost;
		this.markUp = dealerMarkup;
	}
	
	public void changeMarkup(double dealerMarkup){
		this.markUp = dealerMarkup;
	}

	@Override
	public double getListPrice() {
		// TODO Auto-generated method stub
		return this.dealerCost + this.markUp;
	}

}
