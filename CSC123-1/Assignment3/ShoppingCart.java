// Hugo Noyola (hnoyola1@toromail.csudh.edu)
public class ShoppingCart extends Object{
	String name;
	String vendor;
	double price;
	double cost;
	double weight;
	double taxRate;
	private static int counter;
	private static double total;
	private static String items = "";


	public ShoppingCart(String name, String vendor, double price, double cost, double weight, double taxRate) {
		this.name = name;
		this.vendor = vendor;
		this.price = price;
		this.cost = cost;
		this.weight = weight;
		this.taxRate = taxRate;
		counter++;
		total += price + (price*taxRate);
		items += name +" "+price+" "+taxRate +" "+ String.format("%.2f", (price+(price*taxRate))) + "\n";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getTaxRate() {
		return taxRate;
	}

	public void setTaxRate(double taxRate) {
		this.taxRate = taxRate;
	}

	public static int getNumofItems() {
		return counter;
	}
	
	public static String TotalCost() {
		String res = String.format("%.2f", total);
		return res;
	}
	
	public static String TotalShop() {
		return items;
	}
}
