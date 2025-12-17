package com.abc.advancemid;

public class ThreadMain {

    public static void main(String[] args) {
         MultiThreadingex t1 = new MultiThreadingex();
         MultiThreadingex t2 = new MultiThreadingex();
         MultiThreadingex t3 = new MultiThreadingex();
        t1.start();
        t2.start();
         t3.start();
        
        for (int i = 1; i < 5; i++) {
            System.out.println("Main Thread: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
