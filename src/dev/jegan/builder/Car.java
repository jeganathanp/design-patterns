package dev.jegan.builder;

public class Car {
    private String model;
    private int numofAirbags;
    private String make;

    public Car(String model, int numofAirbags, String make){
        this.make = make;
        this.numofAirbags = numofAirbags;
        this.model = model;
    }

    public void printCarDetails(){
        System.out.println(String.format("Make: %s, Airbags: %s, model: %s ", make, numofAirbags, model));
    }

}
