package com.ttn.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Process implements Runnable
{
    int processId;

    public Process(int processId) {
        this.processId = processId;
    }

    @Override
    public void run() {
        System.out.println("Runing process on thread: "+Thread.currentThread().getId()+"with id"+processId);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Runing process on thread: "+Thread.currentThread().getId()+"End"+processId);

    }
}


public class CachedThreadPoolDemo {
    public static void main(String[] args) {
        //using fixed pool
        ExecutorService executorService= Executors.newFixedThreadPool(10);
        for(int i=0;i<15;i++)
        {
            executorService.submit(new Thread(new Process(i)));
        }
        executorService.shutdown();
        //using cached pool
        ExecutorService cachedService=Executors.newCachedThreadPool();
        for (int i=15;i<30;i++)
        {
            cachedService.submit(new Thread(new Process(i)));
        }
        cachedService.shutdown();
    }
}
