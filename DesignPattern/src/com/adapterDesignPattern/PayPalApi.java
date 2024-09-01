package com.adapterDesignPattern;

//Third-party PayPal API
public class PayPalApi {
	
	public void sendPayement(double amount) {
		
		System.out.println("Processing payment of $" + amount + " via PayPal");
		
	}

}
