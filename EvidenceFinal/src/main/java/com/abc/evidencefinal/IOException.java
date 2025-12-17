//package com.abc.evidencefinal;
//
//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.File;
//import java.io.FileReader;
//import java.io.FileWriter;
//
//public class IOException {
//    public static void main(String[] args) throws java.io.IOException {
//        try{
//        bufferedFileIOReadWrite();
//        } catch (IOException e) {
//            System.err.println("Error during file operation: " + e.getMessage());
//        }
//        }
//    
//
//    public static void bufferedFileIOReadWrite() throws java.io.IOException {
//        String oldFilePath = "C:\\Users\\Faculty-1\\Desktop\\fileOutPut\\MyFirstFile.txt";
//        String newFilePath = "C:\\Users\\Faculty-1\\Desktop\\fileInPut\\abc\\xyz\\Inputed.txt";
//
//        // Ensure the destination directory exists
//        File newFile = new File(newFilePath);
//        File parentDir = newFile.getParentFile();
//
//        if (!parentDir.exists()) {
//            parentDir.mkdirs();
//        }
//
//        // Reading Writing
//        BufferedReader reader = new BufferedReader(new FileReader(oldFilePath));
//        BufferedWriter w = new BufferedWriter(new FileWriter(newFilePath));
//
//        String line;
//        while ((line = reader.readLine()) != null) {
//            w.write(line);
//            w.newLine();
//        }
//        w.close();
//        reader.close();
//        System.out.println();
//    }
//
//    private String getMessage() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
//
//}
//
