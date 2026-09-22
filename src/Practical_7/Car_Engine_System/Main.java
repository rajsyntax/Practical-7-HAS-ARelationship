package Practical_7.Car_Engine_System;

public class Main {

    public static void main(String[] args) {

        Car car1 = new Car(
                "GJ01AB1234",
                "Hyundai",
                "Creta",
                "EN101",
                "Petrol",
                115
        );

        Car car2 = new Car(
                "GJ02CD5678",
                "Tata",
                "Nexon",
                "EN102",
                "Diesel",
                120
        );

        System.out.println("Car 1 Details");
        car1.displayCarDetails();
        car1.displayEngineDetails();
        car1.startCar();
        car1.stopCar();

        System.out.println("\n---------------------");

        System.out.println("Car 2 Details");
        car2.displayCarDetails();
        car2.displayEngineDetails();
        car2.startCar();
        car2.stopCar();
    }
}
