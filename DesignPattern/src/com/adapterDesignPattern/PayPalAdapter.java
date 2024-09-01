package com.adapterDesignPattern;

public class PayPalAdapter implements PaymentProcessor {
	
	private PayPalApi palApi;
	
	public PayPalAdapter() {
		this.palApi= new PayPalApi();
	}

	@Override
	public void pay(double amount) {
		palApi.sendPayement(amount);
		
	}

}
