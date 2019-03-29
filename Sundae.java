// Peter Bui - 025328106
// Khang Tran - 016244538

package ass2;

public class Sundae extends IceCream {
	private String top;
	private double top_cost;

	public Sundae() {
	}

	public Sundae(String name) {
		super(name);
	}
	
	public Sundae(String icname, String topname, double icCost, double toCost) {
		super(icname);
		this.setCost(icCost);
		this.top = topname;
		this.top_cost = toCost;
		this.setCost();
	}
	
	public Sundae(String icname, String topname, double icCost, double toCost, double newCal) {
		this(icname, topname,  icCost,  toCost);
		this.setCal(newCal);
	}
	
	public String toString() {
		System.out.printf("%s with%n%-28s", this.top, this.getName());
		return "";
		//return this.getName();
	}
	
	public void setCost() {
		this.setCost((this.getCost() + this.top_cost*100)/100);
	}
	
	public void setTop(String newTop) {
		this.top = newTop;
	}
	
	public String getTop() {
		return this.top;
	}
	
	public void setTopCost(double newTopCost) {
		this.top_cost = newTopCost;
	}
	
	public double getTopCost() {
		return this.top_cost;
	}

}
