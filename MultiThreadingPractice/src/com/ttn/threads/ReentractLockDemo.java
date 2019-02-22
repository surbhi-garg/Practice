package com.ttn.threads;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentractLockDemo {
    Lock lock=new ReentrantLock(true);
    int count=0;
    void incrementCount()
    {
        lock.lock();
        count++;
        lock.unlock();
    }
    void decrementCount()
    {
        lock.lock();
        count--;
        lock.unlock();
    }
    void worker1()
    {
        for(int i=0;i<500;i++)
            incrementCount();
    }
    void worker2()
    {
        for (int i=0;i<200;i++)
            decrementCount();
    }

    public static void main(String[] args) throws InterruptedException {
        ReentractLockDemo reentractLockDemo=new ReentractLockDemo();
        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                reentractLockDemo.incrementCount();
            }
        });
        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
                reentractLockDemo.decrementCount();
            }
        });
        thread1.start();
        thread1.join();
        thread2.start();
        thread2.join();
        System.out.println(reentractLockDemo.count);
    }
}
