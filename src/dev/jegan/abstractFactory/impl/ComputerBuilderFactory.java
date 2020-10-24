package dev.jegan.abstractFactory.impl;

import dev.jegan.abstractFactory.model.Computer;

public class ComputerBuilderFactory {
    public static Computer getComputer(AbstractComputerFactory factory) {
        return factory.createComputer();

    }
}
