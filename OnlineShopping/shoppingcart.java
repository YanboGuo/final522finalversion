package ShoppingSystem;
import java.util.*;

public class shoppingcart {
	Map<products, Integer> SCmap;
	private Scanner scanSC = new Scanner(System.in);
	
	public shoppingcart() {
		SCmap = new HashMap<products, Integer>();
	}

	public void addtocart(products PD, int quantity) {
		SCmap.put(PD, quantity);
	}

	public void editcart() {
		
	}

	public void viewcart() {
		if(SCmap.isEmpty()){
			System.out.println("There is nothing in your shopping cart.");
			System.out.println(" ");
			System.out.println("Is there anything else you want to do?");
			this.list();
		}
		else{
			System.out.println("These are the products in your shopping cart");
			for(Map.Entry<products, Integer> Entry : SCmap.entrySet()){				
				System.out.println(" ");
				System.out.println("name: "+ Entry.getKey().name + " || " + " quantity: " + Entry.getValue()  );
				System.out.println("The total will be: " + total());
				System.out.println(" ");
				System.out.println(" ");

	
			}
			System.out.println("  ");
			this.list();
		}
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

	public void list() {
		
		System.out.println(" ");
		System.out.println("1: View Shopping Cart ");
		System.out.println("2: Place Order ");
		System.out.println("3: Edit Shopping Cart");
		System.out.println("4: Go to Order Page");
		System.out.println("5: Return to Home Page");
		System.out.println("6: Return to Account Page");
		System.out.println("7: Sign out");
		System.out.println(" ");
		System.out.println("Please select what you want to do");
		
		if(scanSC.hasNextInt()){
			int selection = scanSC.nextInt();
			scanSC.nextLine();
			if (selection == 1){
				this.viewcart();
			}
			else if (selection == 2){
				this.placeOrder();
			}
			else if (selection == 3){
				this.editcart();
			}
			else if (selection == 4){
				
			}
			else if (selection == 5){
				shoppingSystem.web.list();
			}
			else if (selection == 6){
				shoppingSystem.web.Account.list();
			}
			else if (selection == 7){
				shoppingSystem.web.Account.Signout();
			}
			else{
				this.list();
			}
		}
		else{
			this.list();
		}
		
	}

}
