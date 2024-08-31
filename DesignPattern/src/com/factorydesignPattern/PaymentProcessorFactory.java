package com.factorydesignPattern;

public class PaymentProcessorFactory {

    public static PaymentProcessor getPaymentProcessor(String type) {
        if (type == null || type.isEmpty()) {
            return null;
        }
        switch (type) {
            case "CREDIT_CARD":
                return new CreditCardProcessor();
            case "PAYPAL":
                return new PayPalProcessor();
            case "CRYPTO":
                return new CryptoProcessor();
            default:
                throw new IllegalArgumentException("Unknown payment type");
        }
    }
}

