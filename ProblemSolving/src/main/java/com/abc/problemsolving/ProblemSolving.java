/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.abc.problemsolving;

import java.awt.BorderLayout;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author B11
 */
public class ProblemSolving {

    public static void main(String[] args) {
        fibonacci(10);
        System.out.println("5! = " + factory(5));
        System.out.println("6! (recursive) = " + factorialRecarsiv(6));

//        System.out.println("=== Prime Numbers up to 30 ===");
//        primes(30);
//        
        Scanner s = new Scanner(System.in);
//        System.out.println("Enter the number");
//        primes(s.nextInt());

        int[][] array2d = {
            {1, 3, 6},
            {5, 6, 1, 8, 9, 3, 4, 5},
            {6, 8, 2, 6, 4, 9, 7, 2, 5, 6}
        };

integer

//       arraySort2d(array2d);
//      Interger[] array ={ 6,8,2,6,4,9,7,2,5,6,1};
//       arraysort(array);
//       arrayPrint(array);
    }

    // Q01: Fibonacci Number
    public static void fibonacci(int n) {
        int a = 0, b = 1, c;
        System.out.print("Fibonacci Series: " + a + " " + b);
        for (int i = 2; i < n; i++) {
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
        System.out.println();
    }

    //Q02: Factorial Number
    public static long factory(int n) {
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // 2nd solution of factorial
    public static long factorialRecarsiv(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorialRecarsiv(n - 1);
    }

//    Q03: Prime Number from 1 to n
//    public static void primes(int n) {
//        if (n <= 1) {
//            System.out.println(n + " is not Prime ");
//            return;
//        }
//        for (int j = 2; j <= Math.sqrt(n); j++) {
//            if (n % j == 0) {
//                System.out.println(n + " is not Prime ");
//                return;
//            }
//
//        }
//    }
//    //Prime Number Series:
//    public static void primes(int n) {
//        System.out.print("Prime numbers up to " + n + ": ");
//        for (int i = 2; i <= n; i++) {
//            boolean isPrime = true;
//            for (int j = 2; j <= Math.sqrt(i); j++) {
//                if (i % j == 0) {
//                    isPrime = false;
//                    break;
//                }
//            }
//            if (isPrime) {
//                System.out.print(i + " ");
//            }
//        }
//        System.out.println();
//    }
    //Q04:Sort Multidimensional Array:
//    public static void arraySort2d(int[][] Array2d) {
//        for (int[] array : Array2d) {
//            Arrays.sort(array);
//            System.out.println(Arrays.toString(array));
//        }
//        System.out.println("Arrays.deepToString(args)");
//    }
    // sorting array in ascending and decending method
//    public static void arraySort (Integer[]array) {
//    Arrays.sort(array);
//    }
//    public static void arrayPrint(Integer[] array){
//      for (Integer i : array) {
//          System.out.println(i +" ");}
//    }
//    System.out.println();
}

//Q05:Sort Array in Reverse Order
//    public static void reverseSortArray(int[] arr){
//    Arrays.sort(arr);
//        System.out.println("Reverse Sorted Array: ");
//        for (int i = arr.length - 1; i >= 0; i--)
//            System.out.print(arr[i] + " ");
//    
//    }
public static void bubbleSort(Integer[] arr){
  int n = arr.length;
for (int i = 0; i < n - 1 ; i++){
  for (int j = 0; j< n - 1- i; j++){
    if (arr[j] > arr[j + 1]){
int temp = arr[j];
arr[j + 1 ] = temp;
}

}
}



}
