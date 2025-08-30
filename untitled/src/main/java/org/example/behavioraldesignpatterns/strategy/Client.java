package org.example.behavioraldesignpatterns.strategy;

public class Client {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService(100);
        paymentService.setPaymentStrategy(new CashPayment());
        paymentService.makePayment();

        paymentService.setAmount(200);
        paymentService.setPaymentStrategy(new UPIPayment());

        paymentService.makePayment();
    }
}
