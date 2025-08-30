package org.example.behavioraldesignpatterns.strategy;

public class PaymentService {
    private int amount;
    private PaymentStrategy paymentStrategy;

    PaymentService (int amount) {
        this.amount = amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void makePayment () {
        this.paymentStrategy.pay(this.amount);
    }
}
