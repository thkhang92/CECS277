// Peter Bui - 025328106
// Khang Tran - 016244538

package ass2;

public class Cookie extends DessertItem {
	private double quantity;
	private double price_per_dz;
	private double cost;
	private double calories;

	public Cookie() {
	}

	public Cookie(String name) {
		super(name);
	}
	
	public Cookie(String name, double newQuantity, double newPr) {
		this(name);
		this.quantity = newQuantity;
		this.price_per_dz = newPr;
		this.setCost();
	}
	
	public Cookie(String name, double newQuantity, double newPr, double newCal) {
		this(name, newQuantity, newPr);
		this.calories = newCal;
	}
	
	public String toString() {
		System.out.println(quantity + " @ " + price_per_dz + " /dz.");
		System.out.printf("%-28s", this.getName());
		return "";
		//return quantity + " @ " + price_per_dz + " /dz.\n" + this.getName();
	}
	
	public void setCost() {      
		this.cost = Math.round(quantity*price_per_dz/12*100);
	}

	@Override
	public double getCost() {
		return this.cost;
	}
	
	public void setQuan(double newQuan) {
		this.quantity = newQuan;
	}
	
	public double getQuan() {
		return this.quantity;
	}
	
	public void setPrpdz(double newPrpdz) {
		this.price_per_dz = newPrpdz;
	}
	
	public double getPrpdz() {
		return this.price_per_dz;
	}
	
	public void setCal(double newCal) {
		this.calories = newCal;
	}
	
	@Override
	public double getCal() {
		return this.calories;
	}

}
