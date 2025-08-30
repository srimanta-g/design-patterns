package org.example.behavioraldesignpatterns.strategy;

public class CreditCardPayment implements PaymentStrategy{
    @Override
    public void pay(int amount) {
        System.out.println("Paying from credit card amount : " + amount);
    }
}
