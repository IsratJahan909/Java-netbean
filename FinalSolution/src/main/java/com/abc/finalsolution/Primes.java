/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.isratbd.problemsolving;

import java.awt.BorderLayout;
import java.util.*;

/**
 *
 * @author User
 */
public class Primes {

    public static void main(String[] args) {
        Scanner sl = new Scanner(System.in);
        System.out.print("Enter Your Number: ");
        int n = sl.nextInt();
        primes(n);
    }

    public static void primes(int n) {
        if (n <= 1) {
            System.out.println(n + " is not Prime");
            return;
        }
        for (int j = 2; j < Math.sqrt(n); j++) {
            if (n % j == 0){
                System.out.println(n + " is not Prime");
                return;
            }

        }
        System.out.println(n + " is Prime ");

    }
}
