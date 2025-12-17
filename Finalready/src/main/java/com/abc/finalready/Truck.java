/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.isratbd.problemsolving;

/**
 *
 * @author User
 */
//public class Truck {
//
//    public static void main(String[] args) {
//        Truck edgeCaseTruck = new Truck(40000, "Yellow", 1000);
//        System.out.println("Price - below:" + edgeCaseTruck.getPurchasePrice());
//
////test just above threshold
//        Truck aboveThresholdTruck = new Truck(40000, "Black", 2001);
//        System.out.println("Price - below:" + aboveThresholdTruck.getPurchasePrice());
//
//    }
//    int weight;
//    private double regularPrice;
//
//    public Truck(double regularPrice, String color, int weight) {
//        super(regularPrice, color);
//        this.weight = weight;
//    }
//
//    public double getPurchasePrice() {
//        if (weight > 2000) {
//            return regularPrice * 0.9;
//        } else {
//            return regularPrice;
//        }
//    }
//
//}
//}




public class Truck extends Vehicle {
    int weight;

    
    public Truck(double regularPrice, String color, int weight) {
        super(regularPrice, color); 
        this.weight = weight;
    }

    
    @Override
    public double getPurchasePrice() {
        if (weight > 2000) {
            return regularPrice * 0.9; 
        } else {
            return regularPrice;
        }
    }

    
    public static void main(String[] args) {
        Truck lightTruck = new Truck(30000, "Red", 1500);
        System.out.println("Light Truck Price: " + lightTruck.getPurchasePrice());

        Truck heavyTruck = new Truck(40000, "Blue", 2500);
        System.out.println("Heavy Truck Price: " + heavyTruck.getPurchasePrice());
    }
}
