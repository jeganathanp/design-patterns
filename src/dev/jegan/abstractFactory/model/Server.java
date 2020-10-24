package dev.jegan.abstractFactory.model;

public class Server implements  Computer{
    private String name;
    private int numberOfCPUS;
    public Server(String name, int numberOfCPUs){
        this.name = name;
        this.numberOfCPUS = numberOfCPUs;
    }
    @Override
    public int numberOfCPUs() {
        return numberOfCPUS;
    }

    @Override
    public String getName() {
        return "Server Name " + name;
    }
}
