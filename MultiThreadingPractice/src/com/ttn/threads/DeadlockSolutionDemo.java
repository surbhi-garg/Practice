package com.ttn.threads;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadlockSolutionDemo {
    Lock lock1 = new ReentrantLock(true);
    Lock lock2 = new ReentrantLock(true);

    public void acquireLock(Lock lock1, Lock lock2) {

        boolean acquireLock1 = lock1.tryLock();//Checking if lock1 is able to obtain lock
        boolean acquireLock2 = lock2.tryLock();//Checking if lock2 is able to obtain lock

        //both have obtained lock
        if (acquireLock1 && acquireLock2) {
            return;
        }
        //lock1 is acquired
        if (acquireLock1) {
            lock1.unlock();
        }
        //lock2 is acquired
        if (acquireLock2) {
            lock2.unlock();
        }

    }

    public void worker1() {
        //try acquiring lock in order lock1-->lock2
        acquireLock(lock1, lock2);
        System.out.println("lock 1 worker 1");
        System.out.println("lock 2 worker 1");
        lock2.unlock();
        lock1.unlock();
    }

    public void worker2() {
        //reversing the order of acquirelock lock2--->lock1
        //if both locks will be granted at same time, it will be a deadlock, tryLock is preventing it
        acquireLock(lock2, lock1);
        System.out.println("lock 1 worker 2");
        System.out.println("lock 2 worker 2");
        lock1.unlock();
        lock2.unlock();
    }

    public static void main(String[] args) throws InterruptedException {
        DeadlockSolutionDemo deadlockSolutionDemo = new DeadlockSolutionDemo();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                deadlockSolutionDemo.worker1();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                deadlockSolutionDemo.worker2();
            }
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
    }
}


