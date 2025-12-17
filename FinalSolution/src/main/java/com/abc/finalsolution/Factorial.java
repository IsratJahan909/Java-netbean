/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.isratbd.problemsolving;

import java.util.*;

/**
 *
 * @author User
 */
public class Factorial {

    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        System.out.print("Enter Your factorial number: ");
        int m = l.nextInt();
        long result = Factorial(m);
        System.out.println("Factorial = " + result);
    }

    public static long Factorial(int n) {
        long m = 1;
        for (int i = 2; i <= n; i++) {
            m *= i;
        }
        return m;
    }

}
