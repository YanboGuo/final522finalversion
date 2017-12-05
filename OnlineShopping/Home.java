package ShoppingSystem;
import java.util.*;

public class Home {
	public ArrayList<products> productlist;
	private Scanner scanhome = new Scanner(System.in);
	public account Account = null;

	public Home() {
		productlist = new ArrayList<products>();

	}

	// page to add product to shopping cart.

	public void setaccount(account Acc) {
		this.Account = Acc;
	}

	// The list for Home page.
	
	// method to add products into our system.
	public void addproduct(products newProd) {
		this.productlist.add(newProd);
	}
}
