/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExceptionHandelingExp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author B11
 */
public class AllexceptionExample {

    public static void main(String[] args) throws IOException {
//        consoleIO();
//          bufferedFileIOReadWrite();

        try {
            bufferedFileIOReadWrite();
        } catch (IOException e) {
            System.out.println("I/O Error:" + e.getMessage());

        }

    }
// 1. Console I/O

//    public static void consoleIO() {
//        System.out.println("=== Console I/O ===");
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter your name: ");
//        String name = scanner.nextLine();
//        System.out.println();
//        System.out.print("Enter your Age: ");
//        int age = scanner.nextInt();
//        System.out.println("Hello, " + name + "!");
//        System.out.println("Age is= " + age + "!");
//
////        scanner.close(); 
//        System.out.println();
//    }

    // 2. File I/O using BufferedReader and BufferedWriter
//    public static void bufferedFileIO() throws IOException {

//        String filePath = "C:\\Users\\B11\\Desktop\\FileOutput\\MyFirstFile.txt";
//
//        // Writing
//        BufferedWriter w = new BufferedWriter(new FileWriter(filePath));
//        writer.write("Line one using BufferedWriter.");
//        writer.newLine();
//        writer.write("Line two using BufferedWriter.");
//        writer.close();
//
//        w.write("Line one using BufferedWriter.");
//        w.newLine();
//        w.write("Line two using BufferedWriter.");
//        w.close();
//        //Reading
//        BufferedReader reader = new BufferedReader(new FileReader(filePath));
//        String line;
//        while ((line = reader.readLine()) != null) {
//            System.out.println("Read: " + line);
//        }
//        reader.close();
//        System.out.println();
//        
        
        
        // write in new file and write in another file
        public static void bufferedFileIOReadWrite() throws IOException {
        String oldFilePath ="C:\\Users\\B11\\Desktop\\FileOutput\\MyFirstFile.txt";
        String newFilePath ="C:\\Users\\B11\\Desktop\\FileInput\\MyInput.txt";
        
        //Reading Writting
        BufferedReader reader = new BufferedReader (new FileReader(oldFilePath));
        BufferedWriter w = new BufferedWriter (new FileWriter(newFilePath));
        
        String line;
        while ((line = reader.readLine()) != null) {
         w.write(line);
           w.newLine();
        }
        w.close();
        reader.close();
        System.out.println();        
        
       }   
    }



