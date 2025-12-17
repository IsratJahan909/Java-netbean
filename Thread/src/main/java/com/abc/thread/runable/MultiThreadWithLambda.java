
package com.abc.thread.runable;


public class MultiThreadWithLambda {
    public static void main(String[] args) {
        
    
  Thread thread1 = new Thread(() -> {
  for (int i = 1; i <= 10; i++){
      System.out.println(Thread.currentThread().getName() + ": " + i);
      try {
      Thread.sleep(500);
      }catch (InterruptedException e){
          System.out.println(e.getMessage());
      }
  }
  },"Tread - 1: --");
  
  Thread thread2 = new Thread(() -> {
  for (int i = 1; i <= 10; i++){
      System.out.println(Thread.currentThread().getName() + ": " + i);
      try {
      Thread.sleep(500);
      }catch (InterruptedException e){
          System.out.println(e.getMessage());
      }
  
  
  
}
  },"Tread - 2: --");
  thread1.start();
   thread2.start();
  
  }
          }
