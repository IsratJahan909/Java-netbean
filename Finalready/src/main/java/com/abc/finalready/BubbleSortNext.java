///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package com.abc.finalready;
//
///**
// *
// * @author B11
// */
//package com.abc.myfirstproject.ProblemSolving;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//import java.util.Scanner;
//
//import java.util.Arrays;
//
//import java.util.Scanner;
//
//import java.util.Scanner;
//
//public class Homework {
//
//    public static void main(String[] args) {
//        Integer[][] array2D = {
//            {1, 99, 91, 11, 44},
//            {0, 10, 9, 9, 11},
//            {3, 23, 21, 5, 20},
//            {13, 4, 45, 66, 33},
//            {11, 0, 1, 20, 56}
//        };
//        Scanner input = new Scanner(System.in);
//        bubbleShort(array2D);
//        oddEven(input);
//        grade(input);
//    }
//
//    public static void bubble1D(Integer[] x) {
//        for (int i = 0; i < x.length - 1; i++) {
//            for (int j = 0; j < x.length - 1 - i; j++) {
//                if (x[j] > x[j + 1]) {
//                    int temp = x[j];
//                    x[j] = x[j + 1];
//                    x[j + 1] = temp;
//                }
//
//            }
//
//        }
//    }
//
// public static void bubbleShort(Integer[][] y) {
//        for (int i = 0; i < y.length - 1; i++) {
//            bubble1D(y[i]);
//            System.out.println(Arrays.toString(y[i]));
//        }
//    }
//
//    public static void oddEven(Scanner input) {
//
//        System.out.println("Enter a number");
//        int n = input.nextInt();
//
//        if (n % 2 == 0) {
//            System.out.println(n + " is a Even number");
//
//        } else {
//            System.out.println(n + " is a Odd number");
//
//        }
//
//    }
//
//    public static void grade(Scanner input) {
//
//        System.out.println("Enter your number grade:");
//        double number = input.nextDouble();
//
//        if (number > 100 || number < 0) {
//            System.out.println("Invalid Input");
//        } else if (number >= 90) {
//            System.out.println("A+");
//        } else if (number >= 70) {
//            System.out.println("A");
//        } else if (number >= 60) {
//            System.out.println("B");
//        } else {
//            System.out.println("Fail");
//   }
//}
//
//}