package org.example.behavioraldesignpatterns.memento;

public class ShapeMemento {
    private int x;
    private int y;

    public ShapeMemento(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
