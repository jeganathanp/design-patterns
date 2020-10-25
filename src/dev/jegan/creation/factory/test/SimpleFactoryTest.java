package dev.jegan.creation.factory.test;

import dev.jegan.creation.factory.simple.SimpleFactory;

public class SimpleFactoryTest {
    public static void main(String[] args) {
        SimpleFactory factory = SimpleFactory.getInstance();


        System.out.println("For 1: "+factory.getProduct(1).name());
        System.out.println("For 2: "+factory.getProduct(2).name());
    }
}
