package com.ttn.threads;

import java.util.concurrent.*;

public class SchedulingDemo {
    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService executorService= Executors.newSingleThreadScheduledExecutor();
        executorService.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("Scheduled task after 2 second called");
            }
        },2,TimeUnit.SECONDS);
        executorService.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Scheduled at a fixed rate of 1 second");
            }
        },0,1,TimeUnit.SECONDS);
        executorService.scheduleWithFixedDelay(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Scheduled With Fix Delay");
            }
        },0,2,TimeUnit.SECONDS);
    }
}
