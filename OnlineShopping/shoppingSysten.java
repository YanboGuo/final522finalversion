package ShoppingSystem;

//import java.lang.*;
//import java.util.*;
//import java.io.*;
import GUI.WelcomePage;

public class shoppingSysten {
	public static shoppingSystem shoppingSysteminstance = new shoppingSystem();

	public static void main(String args[]) {
		
		
		shoppingSysteminstance.runSystem();
		
			WelcomePage welcomePage = new WelcomePage();
			welcomePage.setVisible(true);

		

	}
}
