package com.ttn.threads;

public class SimpleThread implements Runnable {
    @Override
    public void run() {
        Thread.currentThread().getName();
        System.out.println(Thread.currentThread().getName()+"Running runnable thread");
    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        new Thread(new SimpleThread() {
        }).start();

        //anonympous
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread using anonymous class");
            }
        }).start();

        //Thread using lambda
        new Thread(()->{
            System.out.println("Thread using lambda");
        }).start();

        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main completed");
    }
}
