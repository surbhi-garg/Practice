package com.ttn.threads;

public class WaitAndNotifyAllDemo {
    public void waitForNotify1() throws InterruptedException {
        System.out.println("Wait for notify started");
        synchronized (this)
        {
            wait();
        }
        System.out.println("Got notification!I am happy to end");
    }

    public void waitForNotify2() throws InterruptedException {
        System.out.println("I am also waiting for notification :(");
        synchronized (this)
        {
            wait();
        }
        System.out.println(":)Got notification!I am happy to end");
    }
    public void notifyAllWaitingMethod()
    {
        System.out.println("I will perform my work and notify to continue");
        System.out.println("Mywork done");
        synchronized (this)
        {
            notifyAll();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        WaitAndNotifyAllDemo waitAndNotifyAllDemo=new WaitAndNotifyAllDemo();
        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    waitAndNotifyAllDemo.waitForNotify1();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    waitAndNotifyAllDemo.waitForNotify2();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread thread3=new Thread(new Runnable() {
            @Override
            public void run() {
                waitAndNotifyAllDemo.notifyAllWaitingMethod();
            }
        });
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
