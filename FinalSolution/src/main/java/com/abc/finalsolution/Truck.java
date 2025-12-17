/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abc.finalsolution;

import java.util.Vector;

/**
 *
 * @author B11
 */
//public class Truck extends Vehicle {
//
//    int weight;
//
//}
//
//public Truck (double regularPrice,String color, int weight) {
//    super (regularPrice, color);
//this.weight = weight;
//
//
//public double getPurchasePrice(){
//     if (weight > 2000){
//   retun regularPrice * 0.9;
//} else {
//   return regularPrice;
//}
//}
//public double getPurchasePrice(){
//if (weight >200)
//}
//}
//test edge case for truck weight
public class Truck extends Vehicle2 {

    public static void main(String[] args) {
        Truck edgeCaseTruck = new Truck(40000, "Yellow", 1000);
        System.out.println("Price - below:" + edgeCaseTruck.getPurchasePrice());

//test just above threshold
        Truck aboveThresholdTruck = new Truck(40000, "Black", 2001);
        System.out.println("Price - below:" + aboveThresholdTruck.getPurchasePrice());

    }
    int weight;

    public Truck(double regularPrice, String color, int weight) {
        super(regularPrice, color);
        this.weight = weight;
    }

    public double getPurchasePrice() {
        if (weight > 2000) {
            return regularPrice * 0.9;
        } else {
            return regularPrice;
        }
    }

    
}

