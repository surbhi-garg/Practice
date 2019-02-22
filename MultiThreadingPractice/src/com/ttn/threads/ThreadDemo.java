package com.ttn.threads;

class RunnableThread implements Runnable{
    @Override
    public void run() {
        System.out.println("Runnable Thread"+Thread.currentThread().getName());
    }
}
class SimpleThreadDemo extends Thread
{
    public void run()
    {
        System.out.println("Thread using Thread class"+Thread.currentThread().getName());
    }

}
public class ThreadDemo {
    public static void main(String[] args) {
        System.out.println("In main");

        //When we implement runnable, we can start it by passing it's object to thread class constructor
        Thread thread1=new Thread(new RunnableThread());
        thread1.start();

        Thread thread2=new SimpleThreadDemo();
        thread2.start();

        System.out.println("Main ended");
    }
}
