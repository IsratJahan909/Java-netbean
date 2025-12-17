/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abc.binaryio;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author B11
 */
public class BufferedStream {
    public static void main(String[] args) throws IOException{
        String source = "C:\\Users\\B11\\Desktop\\CopyImage\\flower.jpg";
        String dest ="C:\\Users\\B11\\Desktop\\OldImage2\\handy.jpg";
        
        try{
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest));
        
        byte[] buffer = new byte [4096];
        
        int bytesRead;
        
        while ((bytesRead = bis.read(buffer)) != -1){
        bos.write(buffer, 0, bytesRead);
        }
        }
    catch (IOException e) {
     e.printStackTrace();
}
    System.out.println("File copies(with buffer) from " + source + "to" + dest);
    }
  
}
