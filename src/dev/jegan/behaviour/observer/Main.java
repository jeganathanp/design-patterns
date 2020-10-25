package dev.jegan.behaviour.observer;

public class Main {
    public static void main(String[] args) {
        NewsPublisher publisher = new NewsPublisher();
        SMSSubscriber smsSubscriber = new SMSSubscriber();
        EmailSubscriber emailSubscriber = new EmailSubscriber();

        publisher.subscribe(smsSubscriber);
        publisher.subscribe(emailSubscriber);

        publisher.addArticle("Hello World");

        publisher.addArticle("latest news");

    }

}
