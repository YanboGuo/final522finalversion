package ShoppingSystem;

public class Payment {
	public int balance;
	
	public Payment(){
	this.balance = 0;
	}
	
	public void makePayment(int payment){
		this.balance = this.balance - payment;
	}
	public void addMoney()
	{
		this.balance += 100;
	}
}
