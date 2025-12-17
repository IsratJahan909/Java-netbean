
package com.abc.thread.runable;





public class MyRunnable implements Runnable{
int sleep = 0;

public MyRunnable(int sleep){
this.sleep = sleep;
}
@Override 
public void run(){
loopData();
}

public void loopData(){
for (int i = 1; i <= 10; i++){
    System.out.println(Thread.currentThread().getName() + ": " + i);
    try{
    Thread.sleep(sleep);
    }catch(InterruptedException e){
        System.out.println(e.getMessage());
    }
}
}





  
   
//    public static void main(String[] args) {
//        Thread thread1 = new Thread(new MyRunnable(900),"Runnable Thread- 1");
//        Thread thread2 = new Thread(new MyRunnable(700),"Runnable Thread- 1");
//        
//        thread1.start();
//        thread2.start();
//        
//    }

    

   
}
