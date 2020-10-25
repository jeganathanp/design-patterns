package dev.jegan.creation.abstractFactory.impl;

import dev.jegan.creation.abstractFactory.model.Computer;

public class ComputerBuilderFactory {
    public static Computer getComputer(AbstractComputerFactory factory) {
        return factory.createComputer();

    }
}
