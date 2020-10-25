package dev.jegan.behaviour.mediator;

public class Main {
    public static void main(String[] args) {
        Chat chat = new Chat();
        User user1 = new User("user1",chat);
        User user2 = new User("user2",chat);
        User user3 = new User("user3",chat);

        chat.register(user1);
        chat.register(user2);
        chat.register(user3);


        user1.sendMessage("Hii");
    }
}
