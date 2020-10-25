package dev.jegan.behaviour.observer;

public class EmailSubscriber implements  Subscriber{

    @Override
    public void update(String message) {
        System.out.println(String.format("Email subscriber: %s", message));
    }
}
