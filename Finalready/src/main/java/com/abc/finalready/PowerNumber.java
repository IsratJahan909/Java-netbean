/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.isratbd.problemsolving;

/**
 *
 * @author User
 */
import java.util.Scanner;

public class PowerNumber {

    public static double calculatePower(double base, int exponent) {
        return Math.pow(base, exponent);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the base: ");
        double base = sc.nextDouble();

        
        System.out.print("Enter the exponent: ");
        int exponent = sc.nextInt();

        
        double result = calculatePower(base, exponent);

        System.out.println(base + " raised to the power " + exponent + " = " + result);

        sc.close();
    }
}
