package org.example.behavioraldesignpatterns.strategy;

public class UPIPayment implements PaymentStrategy{
    @Override
    public void pay(int amount) {
        System.out.println("Paying using upi amount : " + amount);
    }
}
