
package com.abc.finalsolution;


public class Truck4 extends Vehicle4 {

   public int weight;

    public Truck4(int regularPrice, String color, int par1) {
        super(regularPrice, color);
        this.weight = weight;
    }

    @Override
    double getPurchasePrice() {
        if (weight > 2000) {
            return regularPrice * 0.9;
        } else {
            return regularPrice;
        }
    }

}
