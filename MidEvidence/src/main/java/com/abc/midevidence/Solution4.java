package com.abc.midevidence;

import java.util.Scanner;

//Solution - 04 Grade Number
public class Solution4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number:");

        int marks = sc.nextInt();

        if (marks > 100 || marks < 0) {
            System.out.println("Invalid input!!");
        } else if (marks >= 90) {
            System.out.println("Grade: A+");
        } else if (marks >= 70) {
            System.out.println("Grade: A");
        } else if (marks >= 60) {
            System.out.println("Grade: B");
        } else {
            System.out.println("Fail");
        }

    }
}
