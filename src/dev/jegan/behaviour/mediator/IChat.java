package dev.jegan.behaviour.mediator;

public interface IChat {
    public void register(User user);
    public void unRegister(User user);
    public void publishMessage(String msg, User user);
}
