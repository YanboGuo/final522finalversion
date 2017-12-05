package ShoppingSystem;
import java.util.*;



public class account {
	private Scanner accountscanner = new Scanner(System.in);
	public String username = null;
	public String password = null;
	public Profile profile = null;
	public shoppingcart SC = null;
	public CardInfo cardInfo = null;

	public account(String username, String password) {
		this.username = username;
		this.password = password;
		this.profile = new Profile(username, password, this);
		this.SC = new shoppingcart();
	}
	

	public boolean verify(String pd) {
		boolean answer = false;
		if (this.password.equalsIgnoreCase(pd)) {
			answer = true;
		}
		return answer;
	}



}
