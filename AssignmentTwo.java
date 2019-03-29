// Peter Bui - 025328106
// Khang Tran - 016244538

package ass2;

import java.util.ArrayList;
import java.util.Collections;

public class AssignmentTwo {

	public static void main(String[] args) {
		Checkout ch = new Checkout();
		IceCream i1 = new IceCream("Strawberry Ice Cream", 1.45, 127);
		Sundae i2 = new Sundae("Vanilla Ice Cream", "Caramel Sundae" ,1.05, 0.50, 137);
		Candy i3 = new Candy("Gummy Worms", 1.33, 0.89, 140);
		Cookie i4 = new Cookie("Chocolate Chip Cookies", 4, 3.99, 78);
		Candy i5 = new Candy("Salt Water Taffy", 1.50, 2.09, 160);
		Candy i6 = new Candy("Candy Corn", 3.00, 1.09, 140);
		ch.enterItem(i1);
		ch.enterItem(i2);
		ch.enterItem(i3);
		ch.enterItem(i4);
		ch.enterItem(i5);
		ch.enterItem(i6);
		ch.setTaxRate(0.065);

		System.out.printf("Number of items: %d%n%n", ch.numberOfItems());
		System.out.printf("Total cost: %d%n%n", ch.totalCost());
		System.out.printf("Total tax: %d%n%n", ch.totalTax());
		System.out.printf("Cost + Tax: %d%n%n", ch.totalCost() + ch.totalTax());
		System.out.println(ch);
		
		ArrayList<DessertItem> items_list = new ArrayList<DessertItem>();
		items_list.add(i1);
		items_list.add(i2);
		items_list.add(i3);
		items_list.add(i4);
		items_list.add(i5);
		items_list.add(i6);
		Collections.sort(items_list);
		System.out.printf("%n%nTest sort:%n");
		for(DessertItem i : items_list)
		{
			System.out.print(i);
			System.out.printf("%7.2f calories%n", i.getCal());
		}
		
	}

}
