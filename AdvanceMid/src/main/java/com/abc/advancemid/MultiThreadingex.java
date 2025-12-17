
package com.abc.advancemid;

public class MultiThreadingex extends Thread {

    public void run() {
        for (int i = 1; i < 5; i++) {
            System.out.println("Thread-1: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}



