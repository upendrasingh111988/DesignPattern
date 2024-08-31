package com.factorydesignPattern;

public class CryptoProcessor implements PaymentProcessor{

	@Override
    public void processPayment(double amount) {
        // Logic to process cryptocurrency payment
        System.out.println("Processing cryptocurrency payment of $" + amount);
    }
}
