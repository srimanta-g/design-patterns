package org.example.behavioraldesignpatterns.observer;

public class Mobile implements Consumer{
    @Override
    public void update() {
        System.out.println("Mobile updated");
    }
}
