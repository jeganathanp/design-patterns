package dev.jegan.builder;

public class CarBuilder {


    private String make;
    private String model;
    private int numofAirbags;

    public CarBuilder(){}

    public CarBuilder(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public CarBuilder setModel(String model) {
        this.model = model;
        return this;
    }


    public int getNumofAirbags() {
        return numofAirbags;
    }

    public CarBuilder setNumofAirbags(int numofAirbags) {
        this.numofAirbags = numofAirbags;
        return  this;
    }

    public String getMake() {
        return make;
    }

    public CarBuilder setMake(String make) {
        this.make = make;
        return this;
    }

    public Car build(){
        return new Car(this.model,this.numofAirbags, this.make);
    }

}
