package dev.jegan.creation.factory.test;

import dev.jegan.creation.factory.model.vechile.Bike;
import dev.jegan.creation.factory.model.vechile.Car;
import dev.jegan.creation.factory.simpleMap.VechileFactory;

public class SimpleMapTest {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        VechileFactory factory = VechileFactory.getInstance();
        //register vechile
        factory.registerVechile("car", Car.class);
        factory.registerVechile("bike", Bike.class);

        System.out.println(factory.getVechile("car").getName());
        System.out.println(factory.getVechile("bike").getName());

    }
}
