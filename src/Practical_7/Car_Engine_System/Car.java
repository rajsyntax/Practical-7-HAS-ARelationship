package Practical_7.Car_Engine_System;


public class Car {

    private String carNumber;
    private String brand;
    private String model;
    private Engine engine;

    public Car(String carNumber, String brand, String model,
               String engineNumber, String engineType, int horsePower) {

        this.carNumber = carNumber;
        this.brand = brand;
        this.model = model;

        // Composition
        engine = new Engine(engineNumber, engineType, horsePower);
    }

    public void startCar() {
        System.out.println("\n" + brand + " " + model + " Starting...");
        engine.startEngine();
    }

    public void stopCar() {
        System.out.println(brand + " " + model + " Stopping...");
        engine.stopEngine();
    }

    public void displayCarDetails() {
        System.out.println("\nCar Number: " + carNumber);
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }

    public void displayEngineDetails() {
        engine.displayEngineDetails();
    }
}
