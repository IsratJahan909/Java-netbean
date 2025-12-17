/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExceptionHandelingExp;

import static ExceptionHandelingExp.CommonJavaExceptions.arithmeticExample;
import static ExceptionHandelingExp.CommonJavaExceptions.arrayIndexOutOfBoundsExample;
import static ExceptionHandelingExp.CommonJavaExceptions.classNotFoundExceptionExample;
import static ExceptionHandelingExp.CommonJavaExceptions.ioExceptionExample;
import static ExceptionHandelingExp.CommonJavaExceptions.nullExample;

import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author B11
 */
public class ExecptionHandeling {
   

       public static void main(String[] args) {
        nullExample();
        System.out.println("Hello");
        
        
        
        arithmeticExample();
        arrayIndexOutOfBoundsExample();
        ioExceptionExample();
        classNotFoundExceptionExample();
//        throwsExample();
    }


////4.IOException 
//    public static void ioExceptionExample() {
//       try {
//         FileReader reader = new FileReader("C:\\Users\\B11\\Documents\\NetBeansProjects");
//     }catch (IOException t) {
//            System.out.println("Caught IOException: " + t.getMessage());}
//    }
//
//// 5. Throw Keyword
//    public static void throwExample(int age) {
//     if (age < 0) {
//        throw new NullPointerException("5, Age must be 0+");
//     }else {
//         System.out.println("Welcome");}        
//     } 
//
//    private static void throwExample() {
//       try  {
//      throwExample(-5);
//    }catch (NullPointerException e) {
//       System.out.println(e.getMessage());
//    }
//    }
    
    // 6.Throws Keyword
    public static void throwsExample() throws java.io.IOException {
        throw new java.io.IOException ("6, File not found,");
    }
//    public static void ioExceptionExample() throws java.io.IOException{
//        FileReader reader = new FileReader(C:\Users\B11\Pictures\img3.jpg);
//    }
} 
    
