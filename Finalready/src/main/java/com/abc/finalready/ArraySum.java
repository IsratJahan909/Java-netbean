///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package com.isratbd.problemsolving;
//
//import java.util.Arrays;
//
///**
// *
// * @author User
// */
//
////    public class ArraySum {
////    public static void main(String[] args) {
////        int[] array = {2, 4, 6, 8, 10};
////        int sum = 0;
////        
////        System.out.print("The array : " + Arrays.toString(array));
////        
////        for (int n : array) {
////            sum += n;
////        }
////        System.out.println("\nSum: " + sum);
////    }
////
////}
//
//
//public class ArraySum{
//
//public static void main (String[] args){
//int [] array = {2, 4, 9, 1};
//int sum = 0;
//System.out.print("The array: " + Arrays.toString(array));
//
//for (int n : array){
//     sum += n;
//}
//
//System.out.println("Sum: " + sum);
//
//}
//}
//
//import java.util.Arrays;
//import java.util.Scanner; 
//
//public class ArraySum {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("কতটি সংখ্যা ইনপুট দিবে? ");
//        int n = sc.nextInt();
//
//        int[] array = new int[n];
//        int sum = 0;
//
//        
//        for (int i = 0; i < n; i++) {
//            System.out.print("array[" + i + "] = ");
//            array[i] = sc.nextInt();
//        }
//
//        System.out.println("The array: " + Arrays.toString(array));
//
//        // sum calculation
//        for (int num : array) {
//            sum += num;
//        }
//
//        System.out.println("Sum: " + sum);
//
//        sc.close(); 
//    }
//}
