package dev.jegan.behaviour.chainOfResponsibility;

public interface Chain {
    void setNext(Chain c);
    void process(Log log);
}
