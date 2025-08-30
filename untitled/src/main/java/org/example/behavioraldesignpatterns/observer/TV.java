package org.example.behavioraldesignpatterns.observer;

public class TV implements Consumer{
    @Override
    public void update() {
        System.out.println("TV updated");
    }
}
