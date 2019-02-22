package com.ttn.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExecutorDemo {
    public static void main(String[] args) {
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
        try {
            for(Runnable cur:threadList)
            {
                executorService.submit(cur);
            }
        } finally {
                executorService.shutdown();
        }

    }
}
