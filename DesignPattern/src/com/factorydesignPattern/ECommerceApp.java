package com.factorydesignPattern;

public class ECommerceApp {
    public static void main(String[] args) {
        String paymentType = "PAYPAL"; // This could come from user input
        PaymentProcessor paymentProcessor = PaymentProcessorFactory.getPaymentProcessor(paymentType);

        if (paymentProcessor != null) {
            paymentProcessor.processPayment(150.00); // Process payment of $150
        } else {
            System.out.println("Invalid payment type selected.");
        }
    }
}

