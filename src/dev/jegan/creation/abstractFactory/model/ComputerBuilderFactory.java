package dev.jegan.creation.abstractFactory.model;

public class ComputerBuilderFactory {
    public static Computer getComputer(AbstractComputerFactory factory) {
        return factory.createComputer();

    }
}
