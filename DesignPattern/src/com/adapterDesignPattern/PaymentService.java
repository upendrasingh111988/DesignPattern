package com.adapterDesignPattern;

public class PaymentService {
	
	private PaymentProcessor paymentProcessor;
	
	public PaymentService(PaymentProcessor paymentProcessor) {
		this.paymentProcessor=paymentProcessor;
		
	}
	public void processPayment(double amount) {
		paymentProcessor.pay(amount);
		
	}

}
