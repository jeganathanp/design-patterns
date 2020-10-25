package dev.jegan.creation.abstractFactory.model;

public class Desktop implements  Computer{

    private String name;
    private int numberOfCPUS;
    public Desktop(String name, int numberOfCPUs){
        this.name = name;
        this.numberOfCPUS = numberOfCPUs;
    }
    @Override
    public int numberOfCPUs() {
        return numberOfCPUS;
    }

    @Override
    public String getName() {
        return name;
    }
}
