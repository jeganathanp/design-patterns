package dev.jegan.abstractFactory.model;

public abstract class AbstractComputerFactory {
    private String name;
    private int numberOfCPUs;
    public AbstractComputerFactory(String name, int numberOfCPUS)
    {
        this.name = name;
        this.numberOfCPUs = numberOfCPUS;
    }

    public abstract  Computer createComputer();
}
