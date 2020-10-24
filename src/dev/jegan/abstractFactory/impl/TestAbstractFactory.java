package dev.jegan.abstractFactory.impl;

import dev.jegan.abstractFactory.model.Computer;

public class TestAbstractFactory {
    public static void main(String[] args) {
        Computer computer = ComputerBuilderFactory.getComputer(new ServerFactory("GOI",5));
        System.out.println(computer.getName());
    }
}
