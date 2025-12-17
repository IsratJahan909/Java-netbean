
package com.abc.finalsolution;


abstract class Vehicle3 {
    
    int speed;

    public Vehicle3(int speed, double fuel) {
        this.speed = speed;
        this.fuel = fuel;
    }
    double fuel;

    public Vehicle3(double fuel) {
        this.fuel = fuel;
    }

    public Vehicle3(int speed) {
        this.speed = speed;
    }
    
    abstract void start();
    abstract void stop();

    void displayinfo(){
        System.out.println("Speed:" + speed + "Fuel: " + fuel);
    }
    
    
    
    
    
    

}
