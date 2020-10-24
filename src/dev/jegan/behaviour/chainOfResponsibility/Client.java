package dev.jegan.behaviour.chainOfResponsibility;

public class Client {
    public static void main(String[] args) {
        Log log = new Log("info");
        Chain cInfo = new InfoLog();
        Chain cDebug = new DebugLog();
        cInfo.setNext(cDebug);
        cInfo.process(log);
    }
}
