// Peter Bui - 025328106
// Khang Tran - 016244538

package ass2;

public class Candy extends DessertItem {
	private double weight;
	private double price_per_lb;
	private double cost;
	private double calories;
	
	public Candy() {
	}

	public Candy(String name) {
		super(name);
	}
	
	public Candy(String name, double newWeight, double newPr) {
		this(name);
		this.weight = newWeight;
		this.price_per_lb = newPr;
		this.setCost();
	}
	
	public Candy(String name, double newWeight, double newPr, double newCal) {
		this(name, newWeight, newPr);
		this.calories = newCal;
	}
	
	public String toString() {
		System.out.println(weight + " lbs. @ " + price_per_lb + " /lb.");
		System.out.printf("%-28s", this.getName());
		return "";
	}
	
	public void setCost() {
		this.cost = Math.round(weight*price_per_lb*100);
	}

	@Override
	public double getCost() {
		return this.cost;
	}
	
	public void setWei(double newWei) {
		this.weight = newWei;
	}
	
	public double getWei() {
		return this.weight;
	}
	
	public void setPrplb(double newPrplb) {
		this.price_per_lb = newPrplb;
	}
	
	public double getPrplb() {
		return this.price_per_lb;
	}
	
	public void setCal(double newCal) {
		this.calories = newCal;
	}
	
	@Override
	public double getCal() {
		return this.calories;
	}

}
