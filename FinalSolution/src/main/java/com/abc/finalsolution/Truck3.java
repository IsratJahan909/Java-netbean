package com.abc.finalsolution;

public class Truck3 extends Vehicle3 {

    public Truck3(int speed, double fuel) {

        super(speed, fuel);
    }

    @Override
    void start() {
        System.out.println("Truck start with a heavy engine");
    }

    @Override
    void stop() {
        System.out.println("Truck is stoping slow");
    }

    @Override
    void displayinfo() {
        System.out.println("Truck Info");
        super.displayinfo();
    }

}
