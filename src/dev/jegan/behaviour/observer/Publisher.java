package dev.jegan.behaviour.observer;

public interface Publisher {
    public void subscribe(Subscriber subscriber);
    public void notifyAllSubscriber(String article);
}
