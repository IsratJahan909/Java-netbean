/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abc.binaryio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author B11
 */
public class buffer {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream("C:\\Users\\B11\\Desktop\\OldImage\\img1.jpg");
            out = new FileOutputStream("C:\\Users\\B11\\Desktop\\FileOutput\\flower.jpg");
            int c;
            byte[] buffer = new byte [1024];
            int count = 0;
            while((c = in.read(buffer)) != -1){
                System.out.println(c + " Character " + (char)c);
                count++;
                //out.write(c)
                out.write(buffer, 0, c);
            
            }
            System.out.println("Total character copied"  + count);
        } finally {
            if(in != null ){
            in.close();
            }
            if(out != null){
            out.close();
            }
        
       }
    }
}
