
package com.abc.thread.Class;


public class RunnableDemo {
    public static void main(String[] args) {
        
        Runnable task1 = new MyTask("Task - 1", 500);
        Runnable task2 = new MyTask("Task - 2", 700);

        
        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);

        
        thread1.start();
        thread2.start();
    }
}
