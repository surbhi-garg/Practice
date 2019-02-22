package com.ttn.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceListAwaitTermination {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService= Executors.newSingleThreadExecutor();
        List<Runnable> threadList=new ArrayList<Runnable>();
        threadList.add(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread1");
            }
        });
        threadList.add(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread2");
            }
        });
        threadList.add(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread3");
            }
        });

            for(Runnable cur:threadList)
            {
                executorService.submit(cur);
            }

            executorService.shutdown();
            executorService.awaitTermination(1000L, TimeUnit.MILLISECONDS);
            if(executorService.isTerminated())
            {
                System.out.println("All tasks are terminated");
            }
            else
            {
                System.out.println("Some tasks are pending");
            }
    }
}
