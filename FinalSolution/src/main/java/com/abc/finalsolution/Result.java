/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abc.finalsolution;

import java.util.Scanner;

/**
 *
 * @author B11
 */
public class Result {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number:");
        int marks = sc.nextInt();

        if (marks > 100 || marks < 0) {
            System.out.println("Invalid input!!");
        } else if (marks >= 70) {
            System.out.println("Grade: A+");
        } else if (marks >= 90) {
            System.out.println("Grade: A+");
        } else {
            System.out.println("Fail");
        }

    }
}
