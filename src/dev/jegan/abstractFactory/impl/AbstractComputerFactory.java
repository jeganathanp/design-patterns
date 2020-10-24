package dev.jegan.abstractFactory.impl;

import dev.jegan.abstractFactory.model.Computer;

public abstract class AbstractComputerFactory {
    private String name;
    private int numberOfCPUs;
    public AbstractComputerFactory(String name, int numberOfCPUS)
    {
        this.name = name;
        this.numberOfCPUs = numberOfCPUS;
    }

    public abstract Computer createComputer();
}
