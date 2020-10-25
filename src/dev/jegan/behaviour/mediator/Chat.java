package dev.jegan.behaviour.mediator;

import java.util.ArrayList;
import java.util.List;

public class Chat implements IChat {
    List<User> users =  new ArrayList<>();

    @Override
    public void register(User user) {
        users.add(user);
    }

    @Override
    public void unRegister(User user) {
        users.remove(user);
    }

    @Override
    public void publishMessage(String msg, User publisher) {
        users.stream()
                .filter( user -> !user.equals(publisher))
                .forEach(user -> user.receiveMessage(msg));

    }
}
