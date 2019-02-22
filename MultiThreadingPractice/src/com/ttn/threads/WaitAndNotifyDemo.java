package com.ttn.threads;


public class WaitAndNotifyDemo {
    public void waitForNotify() throws InterruptedException {
        System.out.println("Wait for notify started");
        synchronized (this)
        {
            wait();
        }
        System.out.println("Got notification!I am happy to end");
    }
    public void notifyWaitingMethod()
    {
        System.out.println("I will perform my work and notify to continue");
        System.out.println("Mywork done");
        synchronized (this)
        {
            notify();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        WaitAndNotifyDemo waitAndNotifyDemo=new WaitAndNotifyDemo();
        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    waitAndNotifyDemo.waitForNotify();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
                waitAndNotifyDemo.notifyWaitingMethod();
            }
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
    }
}
