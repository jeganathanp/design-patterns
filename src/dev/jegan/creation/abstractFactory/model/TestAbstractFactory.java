package dev.jegan.creation.abstractFactory.model;

public class TestAbstractFactory {
    public static void main(String[] args) {
        Computer computer = ComputerBuilderFactory.getComputer(new ServerFactory("GOI",5));
        System.out.println(computer.getName());
    }
}
