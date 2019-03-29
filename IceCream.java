// Peter Bui - 025328106
// Khang Tran - 016244538

package ass2;

public class IceCream extends DessertItem {
	private double cost;
	private double calories;
	
	public IceCream() {
		// TODO Auto-generated constructor stub
	}

	public IceCream(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	public IceCream(String name, double newCost) {
		this(name);
		this.setCost(newCost);
	}
	
	public IceCream(String name, double newCost, double newCal) {
		this(name, newCost);
		this.calories = newCal;
	}
	
	public String toString() {
		System.out.printf("%-28s", this.getName());
		return "";
		//return this.getName();
	}

	public void setCost(double newCost) {
		this.cost = Math.round(newCost*100);
	}
	
	@Override
	public double getCost() {
		return this.cost;
	}
	
	public void setCal(double newCal) {
		this.calories = newCal;
	}
	
	@Override
	public double getCal() {
		return this.calories;
	}

}
