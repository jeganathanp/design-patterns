package dev.jegan.creation.abstractFactory.impl;

import dev.jegan.creation.abstractFactory.model.Computer;
import dev.jegan.creation.abstractFactory.model.Server;

public class ServerFactory extends AbstractComputerFactory {
    String name;
    int numberOfCPUS;
    public ServerFactory(String name, int numberOfCPUS) {
        super(name, numberOfCPUS);
        this.name = name;
        this.numberOfCPUS = numberOfCPUS;
    }

    @Override
    public Computer createComputer() {
        return new Server(this.name, this.numberOfCPUS);
    }
}
