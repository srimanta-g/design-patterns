package org.example.behavioraldesignpatterns.memento;

public class Client {
    public static void main(String[] args) {
        Shape shape = new Shape(1, 1);
        CareTaker history = new CareTaker();

        history.saveState(shape);

        shape.setX(2);
        shape.setY(3);

        history.saveState(shape);

        shape.setX(4);
        shape.setY(5);

        history.saveState(shape);

        System.out.println(shape);

        history.undo(shape);
        history.undo(shape);

        System.out.println(shape);

    }
}
