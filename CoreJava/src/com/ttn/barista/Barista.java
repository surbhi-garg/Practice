package com.ttn.barista;

public class Barista {
    public void prepareAndProcessOrder()
    {
        System.out.println("1Call the getNextOrder fromPendingOrderQueue");
        System.out.println("2. Iterate through list of products in that order and instruct the counter to make");
        System.out.println("3.Notify customer with that orderId");
        System.out.println("4. Place the order to completedQueue");

    }
    public void addOrderToCompletedQueue(Order order)
    {
        System.out.println("1. will be called by prepareAndProcessOrder");
        System.out.println("2. Add Order to completedorderQueue");
    }
    public void notifyOrderReady(Order order)
    {
        System.out.println("will be called by prepareAndProcessOrder");
        System.out.println("It will notify customer using the required mechanism");
    }
}
