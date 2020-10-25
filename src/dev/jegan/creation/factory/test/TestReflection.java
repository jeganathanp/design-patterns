package dev.jegan.creation.factory.test;

import dev.jegan.creation.factory.model.product.ProductOne;
import dev.jegan.creation.factory.model.product.ProductTwo;
import dev.jegan.creation.factory.reflection.ProductFactoryUsingReflection;

import java.lang.reflect.InvocationTargetException;

public class TestReflection {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        ProductFactoryUsingReflection factory = ProductFactoryUsingReflection.getInstance();
        factory.registerProduct(1, ProductOne.class);
        factory.registerProduct(2, ProductTwo.class);

        System.out.println("For 1: "+factory.getProduct(1).name());
        System.out.println("For 2: "+factory.getProduct(2).name());
    }
}
