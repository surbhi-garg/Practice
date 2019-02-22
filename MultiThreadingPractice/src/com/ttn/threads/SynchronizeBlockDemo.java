package com.ttn.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SynchronizeBlockDemo {
    int count = 0;

    void incrementCount() {
        synchronized (this) {
            count++;
        }
    }

    void decrementCount() {
        synchronized (this) {
            count--;
        }
    }

    void worker1() {
        for (int i = 0; i < 5000; i++)
            incrementCount();
        for (int i = 0; i < 200; i++)
            decrementCount();
    }

    void worker2() {
        for (int i = 0; i < 5000; i++)
            decrementCount();
        for (int i = 0; i < 200; i++)
            incrementCount();
    }


    public static void main(String[] args) throws InterruptedException {
        SynchronizeMethodDemo synchronizeMethodDemo = new SynchronizeMethodDemo();
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronizeMethodDemo.worker1();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronizeMethodDemo.worker2();
            }
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(synchronizeMethodDemo.count);
    }
}
