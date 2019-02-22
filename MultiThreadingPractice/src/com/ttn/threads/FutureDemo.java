package com.ttn.threads;

import java.util.concurrent.*;

public class FutureDemo {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService= Executors.newSingleThreadExecutor();
        Future<Float>floatFuture=executorService.submit(new Callable<Float>() {
            @Override
            public Float call() throws Exception {
                return 4.5f;
            }
        });
        executorService.shutdown();
        if(floatFuture.isDone())
        {
            System.out.println("Result received from callable is "+floatFuture.get());
        }
        if(floatFuture.isCancelled())
        {
            System.out.println("Task is cancelled");
        }
    }
}
