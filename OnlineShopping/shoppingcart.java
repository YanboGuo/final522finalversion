package ShoppingSystem;
import java.util.*;

public class shoppingcart {
	public Map<products, Integer> SCmap;

	
	public shoppingcart() {
		SCmap = new HashMap<products, Integer>();
		products P1 = new products("apple", 2.0);
		products P2 = new products("orange", 4.0);
		products P3 = new products("orange", 4.0);
		products P4 = new products("orange", 4.0);
		addtocart(P1, 6);
		addtocart(P2, 5);
		addtocart(P4, 3);
		addtocart(P3, 2);
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
