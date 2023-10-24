public class TestShop {
	public static void main(String[] args) {
		Book buk=new Book("I have no mouth, and I must scream", "Goodwill", 11.11,11.10,3.50,.13, "George", "November", 55);
		Food fud=new Food("Bannana","Walmart",0.60,.02,1.2,.13,"Sell by 11/30","Use by 12/05" );
		General gun=new General("Generator","Walmart",56.78,26.50,43.37,.13);
		
		
		System.out.println(buk.getMonth());
		System.out.println(fud.sell);
		System.out.println(gun.getCost());
		System.out.println(ShoppingCart.getNumofItems());
		System.out.println(ShoppingCart.TotalCost());
		System.out.println(ShoppingCart.TotalShop());

	}
}
