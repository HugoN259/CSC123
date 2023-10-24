
public class Food extends ShoppingCart{
	String sell;
	String use;
	public Food(String name, String vendor, double price, double cost, double weight, double taxRate, String sell,
			String use) {
		super(name, vendor, price, cost, weight, taxRate);
		this.sell = sell;
		this.use = use;
	}
	public String getSell() {
		return sell;
	}
	public void setSell(String sell) {
		this.sell = sell;
	}
	public String getUse() {
		return use;
	}
	public void setUse(String use) {
		this.use = use;
	}
	
	
}
