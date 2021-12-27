package com.codedifferently.labs.lab03a.examples.example01_vehicle;

public class Vehicle {
    private String make;
    private int milesPerGallon;

    public Vehicle(){
        make = "";
        milesPerGallon = 0;
    }

    public Vehicle(String m, int mpg){
        make = m;
        milesPerGallon = mpg;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getMilesPerGallon() {
        return milesPerGallon;
    }
    public void setMilesPerGallon(int milesPerGallon) {
        this.milesPerGallon = milesPerGallon;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "make='" + make + '\'' +
                ", milesPerGallon=" + milesPerGallon +
                '}';
    }
}
