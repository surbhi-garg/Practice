package com.ttn.threads;

import java.util.concurrent.atomic.AtomicIntegerArray;

public class AtomicClassDemo {
    AtomicIntegerArray atomicIntegerArray=new AtomicIntegerArray(10);
    void worker1()
    {
        for(int i=0;i<9;i++)
        {
            atomicIntegerArray.set(i,i+1);
        }
    }
    void worker2()
    {
        for(int i=0;i<9;i++)
        {
            atomicIntegerArray.set(i,i+2);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        AtomicClassDemo atomicClassDemo=new AtomicClassDemo();
        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                atomicClassDemo.worker1();
            }
        });
        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
             atomicClassDemo.worker2();
            }
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        for(int i=0;i<atomicClassDemo.atomicIntegerArray.length();i++)
        {
            System.out.println(atomicClassDemo.atomicIntegerArray.get(i));
        }
    }
}
