// Peter Bui - 025328106
// Khang Tran - 016244538

package ass2;

public abstract class DessertItem implements  Comparable<DessertItem> {

	  protected String name;

	/**
	 * Null constructor for DessertItem class
	 */
	  public DessertItem() {
	    this("");
	  }
	/**
	 * Initializes DessertItem data
	 */
	  public DessertItem(String name) {
	      this.name = name;
	      }
	/**
	 * Returns name of DessertItem
	 * @return name of DessertItem
	 */
	  public final String getName() {
	    return name;
	  }
	/**
	 * Returns cost of DessertItem
	 * @return cost of DessertItem
	 */
	  public abstract double getCost();
	  
	  public abstract double getCal();
	  
	  public int compareTo(DessertItem item) 
	  { 
		  return (int)(this.getCal() - item.getCal()); 
	  }
	  
	  public static DessertItem max(DessertItem item1, DessertItem item2) {
		  if (item1.compareTo(item2) >= 0)
			  return item1;
		  return item2;
	  }

}
