package ShoppingSystem;
import java.util.*;


public class shoppingSystem {

	public ArrayList<account> arraylist=new ArrayList<account>();;
	public static Home web = new Home();
	
	public account CurrentAccount = null;

	public void runSystem() {

		products p1 = new products("Apple", 2.0);
		products p2 = new products("Orange", 3.6);
		products p3 = new products("Pear", 4.3);
		products p4 = new products("Grape", 2.7);
		products p5 = new products("Watermelon", 2.6);
		products p6 = new products("Peach", 5.8);
		web.addproduct(p1);
		web.addproduct(p2);
		web.addproduct(p3);
		web.addproduct(p4);
		web.addproduct(p5);
		web.addproduct(p6);
	}


	
	
	public void createAccount(String username, String passcode){
		account new_account = new account(username, passcode);
		arraylist.add(new_account);
		this.CurrentAccount = new_account;
	}



	

	public account find(String checkuser) {
		account findaccount = null;
		for (account c : arraylist) {
			if (c.username.equals(checkuser)) {
				findaccount = c;
			}
		}

		return findaccount;
	}

	public boolean checkAvailability(String username) {
		boolean Availability = true;
		for (account c1 : arraylist) {
			if (c1.username.equals(username)) {
				Availability = false;
				break;
			}
		}
		return Availability;
	}

}
