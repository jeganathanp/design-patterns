package dev.jegan.behaviour.observer;

import java.util.ArrayList;
import java.util.List;

public class NewsPublisher implements Publisher{
    List<Subscriber> allSubscribers = new ArrayList<>();
    private  int aritcleid = 0;

    public void addArticle(String message){
        System.out.println("Platform " + message);
        aritcleid++;
        notifyAllSubscriber("ArticleID: "+aritcleid + " Messsage: "+message);
    }
    @Override
    public void subscribe(Subscriber subscriber) {
        allSubscribers.add(subscriber);
    }

    @Override
    public void notifyAllSubscriber(String article) {
        allSubscribers.forEach(subscriber -> subscriber.update(article));
    }
}
