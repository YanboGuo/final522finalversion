package ShoppingSystem;
import java.util.ArrayList;

public class Home {
	  
	public ArrayList<Product> productlist = new ArrayList<Product>();
	Product p1 = new Product("apple" , 3.0);
	Product p2 = new Product("banana" ,2.0);
	Product p3 = new Product("pear" ,2.0);
	Product p4 = new Product("peach",1.0);
	
	public Home(){	
	      this.productlist.add(p1);
	      this.productlist.add(p2);
	      this.productlist.add(p3);
	      this.productlist.add(p4);
	}
	
	
	
}

