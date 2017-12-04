package ShoppingSystem;
import java.util.*;

public class shoppingcart {
	public Map<products, Integer> SCmap;

	
	public shoppingcart() {
		SCmap = new HashMap<products, Integer>();
	}

	public void addtocart(products PD, int quantity) {
		SCmap.put(PD, quantity);
	}


	public void placeOrder() {

	}
	public double total(){
		double totalvalue = 0;
		
		for(Map.Entry<products, Integer> Entry : SCmap.entrySet()){
			
			totalvalue = totalvalue + Entry.getKey().unitprice * Entry.getValue();
			
		}
		return totalvalue;
	}



}
