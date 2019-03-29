// Peter Bui - 025328106
// Khang Tran - 016244538

package ass2;

import java.util.ArrayList;

public class Checkout {
	private ArrayList<DessertItem> items_list = new ArrayList<DessertItem>();
	private int totalCost, totalTax;
	private double taxRate;
	
	public Checkout() {
	}
	
	public Checkout(double newTaxRate) {
		this.setTaxRate(newTaxRate);
	}
	
	public void clear() {
		this.items_list.clear();
	}
	
	public void enterItem(DessertItem item) {
		this.items_list.add(item);
	}

	public int numberOfItems() {
		return this.items_list.size();
	}
	
	public String toString() {
		System.out.println("\tM & M Dessert Shoppe\n\t--------------------\n");
		for(DessertItem i : items_list)
		{
			System.out.print(i);
			System.out.printf("%6.2f%n", i.getCost()/100);
		}
		System.out.println("");
		System.out.printf("%-28s%6.2f%n", "Tax", ((double)(this.totalTax()))/100);
		System.out.printf("%-28s%6.2f", "Total Cost", (double)this.totalCost()/100+((double)(this.totalTax()))/100);
		return "";
	}
	
	public void setTotalCost() {
		this.totalCost = 0;
		for(DessertItem i : items_list)
		{
			this.totalCost += i.getCost();
		}
	}
	
	public int totalCost() {
		this.setTotalCost();
		return this.totalCost;
	}
	
	public void setTotalTax() {
		this.totalTax = (int) Math.round(this.totalCost() * this.taxRate);
	}
	
	public int totalTax() {
		this.setTotalTax();
		return this.totalTax;
	}
	
	public void setTaxRate(double newTaxRate) {
		this.taxRate = newTaxRate;
	}
	
	public double getTaxRate() {
		return this.taxRate;
	}
	
}
