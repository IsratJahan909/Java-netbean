//
//package com.abc.thread.runable;
//
//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;
//
//
//public class ThreatPoolExample {
//    public static void main(String[] args) {
//        //create a pool with 3 threads
//        ExecutorService pool = Executors.newFixedThreadPool(10);
//        
//        //Sumit 6 tasks
//        for (int i = 1; i<=20; i++){
//        pool.execute(new WorkerTask("Task " + i));
//        }
//        pool.shutdown();
//    }
//  
//}
