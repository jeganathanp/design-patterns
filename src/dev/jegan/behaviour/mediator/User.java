package dev.jegan.behaviour.mediator;

public class User {
    String name;
    IChat chat;
    public User(String name, IChat chat){
        this.name = name;
        this.chat = chat;
    }

    public void receiveMessage(String message){
        System.out.println(String.format("%s <-- %s",name,message));
    }

    public  void sendMessage(String msg){
        System.out.println(String.format("%s --> %s",name,msg));
        chat.publishMessage(msg,this);
    }
}
