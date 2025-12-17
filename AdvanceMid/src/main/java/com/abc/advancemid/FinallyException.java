package com.abc.advancemid;


public class FinallyException {
//    public static void main(String[] args) {
//       try {
//       int result = 10/0;
//       }catch(ArithmeticException e){
//       
//           System.out.println("Arithmetic Exception found " + e.getMessage());
//       }finally{ System.out.println("It is a  finally block");}
//    }
    
    
    public static void main(String[] args) {
        try{
        int red = 10/0;
        }catch (ArithmeticException e){
            System.out.println("Arithmetic Exception found " + e.getMessage());
        }finally {System.out.println("It is a finally block");
        }
    }
}
