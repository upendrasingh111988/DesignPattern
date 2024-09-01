package com.adapterDesignPattern;

public class ECommerceApp {

	public static void main(String[] args) {
		// Using PayPal
		PaymentProcessor paypalProcessor= new PayPalAdapter();
		PaymentService paymentService= new PaymentService(paypalProcessor);
		
		paymentService.processPayment(100.0);
		
		// Using Stripe
		PaymentProcessor strippaymentProcessor= new StripeApiAdapter();
		paymentService= new PaymentService(strippaymentProcessor);
		paymentService.processPayment(150.0);
	}

}
