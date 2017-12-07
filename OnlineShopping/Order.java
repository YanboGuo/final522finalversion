package ShoppingSystem;

import java.util.Map;
import java.util.Map.Entry;

public class Order {
	String orderDetail;
	ShippingInfo shippingInfo = null;
	public Map<Product, Integer> Prodmap; 
	
	/*public Order(){
		
	}*/
	
	public void placeOrder() {
          Prodmap = shoppingSysten.shoppingSysteminstance.CurrentAccount.SC.SCmap;
	}
	  
	public double total(){
		double total = 0;
		
		for (Entry<Product, Integer> entry : Prodmap.entrySet()){
			total += entry.getKey().price * entry.getValue();			
		}
		return total;
	}
	
	public void cancelOrder(){
		Prodmap.clear();
		
	}
	public void makePayment(){
		
	}
	
}
