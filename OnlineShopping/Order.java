package ShoppingSystem;

import java.util.Map;

public class Order {
	String orderDetail;
	ShippingInfo shippingInfo = null;
	public Map<products, Integer> Prodmap = shoppingSysten.shoppingSysteminstance.CurrentAccount.SC.SCmap;
	public Order(){
		
	}


	public double total(){
		double total = 0;
		
		for (Map.Entry<products, Integer> entry : Prodmap.entrySet()){
			total += entry.getKey().unitprice * entry.getValue();			
		}
		return total;
	}
	
	public void cancelOrder(){
		Prodmap.clear();
		//TODO show the home page
	}
	public void makePayment(){
		
	}
	
}
