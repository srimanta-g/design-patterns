package org.example.behavioraldesignpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class MainProducer {
    List<Consumer> listOfConsumers;
    MainProducer() {
        this.listOfConsumers = new ArrayList<>();
    }

    public void addConsumer (Consumer consumer) {
        this.listOfConsumers.add(consumer);
    }

    public void removeConsumer (Consumer consumer) {
        this.listOfConsumers.remove(consumer);
    }

    public void updateConsumers () {
        for (Consumer c : this.listOfConsumers) {
            c.update();
        }
    }
}
