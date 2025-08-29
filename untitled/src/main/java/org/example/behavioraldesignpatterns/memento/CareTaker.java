package org.example.behavioraldesignpatterns.memento;

import java.util.Stack;

public class CareTaker {
    private final Stack<ShapeMemento> history = new Stack<>();

    public void saveState(Shape shape) {
        this.history.push(shape.save());
    }

    public void undo(Shape shape) {
        if (!this.history.isEmpty()) {
            this.history.pop();
            shape.restore(this.history.peek());
        }
    }
}
