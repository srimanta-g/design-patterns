package org.example.behavioraldesignpatterns.strategy;

public class CashPayment implements PaymentStrategy{
    @Override
    public void pay(int amount) {
        System.out.println("Paying using cash amount : " + amount);
    }
}
