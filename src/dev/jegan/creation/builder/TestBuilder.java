package dev.jegan.creation.builder;

public class TestBuilder {
    public static void main(String[] args) {
        Car car = new CarBuilder().setMake("Honda").setModel("Civic").setNumofAirbags(5).build();
        car.printCarDetails();
    }
}
