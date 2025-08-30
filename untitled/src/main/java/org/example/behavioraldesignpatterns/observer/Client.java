package org.example.behavioraldesignpatterns.observer;

public class Client {
    public static void main(String[] args) {
        MainProducer mainProducer = new MainProducer();

        mainProducer.addConsumer(new Mobile());
        Consumer tv = new TV();
        mainProducer.addConsumer(tv);

        mainProducer.updateConsumers();

        mainProducer.removeConsumer(tv);

        mainProducer.updateConsumers();
    }
}
