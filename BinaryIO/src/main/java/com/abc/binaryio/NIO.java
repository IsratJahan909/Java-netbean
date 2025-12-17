/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abc.binaryio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 *
 * @author B11
 */
public class NIO {

    public static void main (String[] args) {
        Path source = Paths.get("C:\\Users\\B11\\Desktop\\CopyImage\\flower.jpg");
        Path dest = Paths.get("C:\\Users\\B11\\Desktop\\New Image\\hand.jpg");

        try {
            Files.copy(source, dest, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Copied using NIO Files.copy()");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
