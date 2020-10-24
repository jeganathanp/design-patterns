package dev.jegan.behaviour.chainOfResponsibility;

public class DebugLog implements  Chain{
    private Chain chain;
    @Override
    public void setNext(Chain c) {
        this.chain = c;
    }

    @Override
    public void process(Log log) {
        if(log.getName().equals("debug")){
            System.out.println("This is debug log");
        }
        else{
            chain.process(log);
        }
    }
}
