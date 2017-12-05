package ShoppingSystem;
import java.util.*;



public class Profile {
	
	public String username = null;
	
	public String address = null;
	public String phonenumber = null;
	public Payment payment = null;
	public String email = null;
	account account;
	private String password = null;
	public Payment Balance = null;

	public Profile(String username, String password, account account) {
		this.username = username;
		this.password = password;
		this.account = account;
		this.Balance = new Payment();
	}

	public void updateProfile(String profilename, String Phone, String Email, String Add){
		this.username = profilename;
		this.phonenumber = Phone;
		this.email = Email;
		this.address = Add;
		
	}	

	public void updatePassword(String old, String New) {
		
		
	}





}
