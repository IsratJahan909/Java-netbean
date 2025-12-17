/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExceptionHandelingExp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author B11
 */
public class copy {
    public static void bufferedFileIOReadWrite() throws IOException {
        String oldFilePath = "C:\\Users\\Faculty-1\\Desktop\\fileOutPut\\MyFirstFile.txt";
        String newFilePath = "C:\\Users\\Faculty-1\\Desktop\\fileInPut\\abc\\xyz\\Inputed.txt";

        // Ensure the destination directory exists
        File newFile = new File(newFilePath);
        File parentDir = newFile.getParentFile();

        if (!parentDir.exists()) {
            parentDir.mkdirs();
        }

        // Reading Writing
        BufferedReader reader = new BufferedReader(new FileReader(oldFilePath));
        BufferedWriter w = new BufferedWriter(new FileWriter(newFilePath));

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
