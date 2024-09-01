package com.adapterDesignPattern;

public class StripeApiAdapter implements PaymentProcessor {
	
	private StripeApi stripeApi;
	
	public StripeApiAdapter() {
		this.stripeApi= new StripeApi();
	}
	
	

	@Override
	public void pay(double amount) {
		
		stripeApi.makePayement(amount);
	}

}
