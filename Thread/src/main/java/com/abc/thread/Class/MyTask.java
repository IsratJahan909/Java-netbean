
package com.abc.thread.Class;

class MyTask implements Runnable {
    private String name;
    private int delay;

    
    public MyTask(String name, int delay) {
        this.name = name;
        this.delay = delay;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(name + " is working... Step " + i);
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                System.out.println(name + " interrupted!");
            }
        }
        System.out.println(name + " finished work!");
    }
}
