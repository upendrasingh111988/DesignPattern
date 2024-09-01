package com.adapterDesignPattern;

//Third-party Stripe API
public class StripeApi {
	
	public void makePayement(double amount) {
		
		System.out.println("Processing payment of $" + amount + " via Stripe");
		
	}

}
