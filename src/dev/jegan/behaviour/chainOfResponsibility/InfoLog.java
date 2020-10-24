package dev.jegan.behaviour.chainOfResponsibility;

public class InfoLog implements  Chain{

    private Chain chain;
    @Override
    public void setNext(Chain c) {
        this.chain = c;
    }

    @Override
    public void process(Log log) {
        if(log.getName().equals("info")){
            System.out.println("This is info log");
        }
        else{
            chain.process(log);
        }
    }
}
