package com.factorydesignPattern;

public class PayPalProcessor implements PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        // Logic to process PayPal payment
        System.out.println("Processing PayPal payment of $" + amount);
    }
}

