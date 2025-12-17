
package com.abc.thread.runable;

public class WorkerTask implements Runnable {
    private String name;

    public WorkerTask(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + " executed by" +Thread.currentThread().getName());
        try{
        Thread.sleep(2000);
        }catch(InterruptedException e){
        e.printStackTrace();
        }
    }
    
}
