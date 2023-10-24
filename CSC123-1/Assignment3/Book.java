
public class Book extends ShoppingCart {

	String Author;
	String month;
	int Pgs;
	
	public Book(String name, String vendor, double price, double cost, double weight, double taxRate, String author,
			String month, int pgs) {
		super(name, vendor, price, cost, weight, taxRate);
		Author = author;
		this.month = month;
		Pgs = pgs;
	}

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public int getPgs() {
		return Pgs;
	}

	public void setPgs(int pgs) {
		Pgs = pgs;
	}
	
}
