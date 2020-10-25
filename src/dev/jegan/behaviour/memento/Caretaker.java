package dev.jegan.behaviour.memento;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    private List<Memento> cache;
    private int currentState = -1;

    public Caretaker() {
        cache = new ArrayList<>();
    }

    public void setState(Memento memento) {
        cache.add(memento);
        currentState = cache.size() - 1;
    }

    public Memento getState(int index) {
        return cache.get(index);
    }

    public Memento getCurrentState() {
        return cache.get(currentState);
    }

    public Memento removeState(int index) {
        return cache.remove(index);
    }

    public Memento redo() {
        if (currentState >= cache.size() - 1) {
            currentState = cache.size() - 1;
            return getState(currentState);
        }
        currentState++;
        return getState(currentState);
    }

    public Memento undo() {
        if (currentState <= 0) {
            currentState = 0;
            return getState(currentState);
        }
        currentState--;
        return getState(currentState);
    }

}
