package Practical_7.Car_Engine_System;

public class Engine {

    private String engineNumber;
    private String engineType;
    private int horsePower;

    public Engine(String engineNumber, String engineType, int horsePower) {
        this.engineNumber = engineNumber;
        this.engineType = engineType;
        this.horsePower = horsePower;
    }

    public void startEngine() {
        System.out.println("Engine Started");
    }

    public void stopEngine() {
        System.out.println("Engine Stopped");
    }

    public void displayEngineDetails() {
        System.out.println("Engine Number: " + engineNumber);
        System.out.println("Engine Type: " + engineType);
        System.out.println("Horse Power: " + horsePower);
    }
}
