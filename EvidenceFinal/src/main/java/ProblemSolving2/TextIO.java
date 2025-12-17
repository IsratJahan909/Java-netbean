package ProblemSolving2;

import java.io.*;
;

public class TextIO {
    public static void main(String[] args) throws IOException {
        
        bufferedFileIO() ;
    }
     // 2. File I/O using BufferedReader and BufferedWriter
  public static void bufferedFileIO() throws IOException {        
       
        String filePath = "C:\\Users\\B-8\\Desktop\\FileOutPut\\MyFile.txt";
      //text writting 
    // Writing
       BufferedWriter w = new BufferedWriter(new FileWriter(filePath, true));
       w.write("Line one using BufferedWriter.");
       w.newLine();
       w.append("Line two using BufferedWriter.");
        w.write("Line two using BufferedWriter.");
       w.close();
    // Reading
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
       String line;
        while ((line = reader.readLine()) != null) {
          System.out.println("Read: " + line);
        }
       reader.close();
       System.out.println();
}
}