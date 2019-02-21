package com.ttn.barista;

import java.util.Queue;

public class CompleteOrderQueue {
    static Queue<Order>completeQueue;
    public void addToQueue(Order order)
    {
        System.out.println("As soon a this is called, we can store the order.");
    }
}
