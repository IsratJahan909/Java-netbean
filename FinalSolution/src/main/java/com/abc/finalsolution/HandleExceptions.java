/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abc.finalsolution;

//15
public class HandleExceptions {
    public static void main(String[] args) {
        try{
        int a = 10;
        int b = 0;
        
        int result = a/b;
            System.out.println("Result: " + result);
        } catch( ArithmeticException e){
            System.out.println("Error: Its a zero");
        }finally{
            System.out.println("no error");}
        
    }
}
