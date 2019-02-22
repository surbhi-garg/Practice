package com.ttn.threads;

public class SleepAndJoinDemo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main started");
        Thread thread1=new Thread(new RunnableThread(){
            @Override
            public void run()
            {
                for(int i=0;i<5;i++)
                {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Thread-1----"+i);
                }
            }
        });
        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=5;i<10;i++)
                {
                    System.out.println("Thread2---"+i);
                }
            }
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println("Main Ended");

    }
}
