
package com.abc.thread.Class;


public class ThreadDemo {
    public static void main(String[] args) {
        
        MyWorker2 worker1 = new MyWorker2("rahim", 500);
        MyWorker2 worker2 = new MyWorker2("anik", 700);

        
        worker1.start();
        worker2.start();
    }
}