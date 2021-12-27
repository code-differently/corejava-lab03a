package com.codedifferently.labs.lab03a.examples.example01_vehicle;

public class VehicleTester {
    public static void main(String[] args) {
        Vehicle car01 = new Vehicle();
        System.out.println(car01);

        Vehicle car02 = new Vehicle("Honda", 30);
        System.out.println(car02);
    }
}
