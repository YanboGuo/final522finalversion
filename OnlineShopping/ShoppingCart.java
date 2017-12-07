package ShoppingSystem;
import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {

    public Map<Product, Integer> SCmap;
	public Order order;
	
	public ShoppingCart() {
		SCmap = new HashMap<Product, Integer>();
		order = new Order();
	}

	public void addtoCart(Product PD, int quantity) {
		SCmap.put(PD, quantity);
	}
	
	public double total(){
		
		double totalvalue = 0;
		
		for(Map.Entry<Product, Integer> Entry : SCmap.entrySet()){
			
			totalvalue = totalvalue + Entry.getKey().price * Entry.getValue();
			
		}
		return totalvalue;
	}
   
}
