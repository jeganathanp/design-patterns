package dev.jegan.behaviour.observer;

public class SMSSubscriber implements Subscriber {
    @Override
    public void update(String message) {
        System.out.println(String.format("SMS subscriber: %s", message));
    }
}
