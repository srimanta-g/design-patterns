package org.example.behavioraldesignpatterns.memento;

public class Shape {
    private int x;
    private int y;

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public ShapeMemento save() {
        return new ShapeMemento(this.x, this.y);
    }

    public void restore(ShapeMemento memento) {
        this.x = memento.getX();
        this.y = memento.getY();
    }

    @Override
    public String toString() {
        return "Shape{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
