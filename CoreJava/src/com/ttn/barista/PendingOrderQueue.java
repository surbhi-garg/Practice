package com.ttn.barista;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class PendingOrderQueue {
   static Queue<Order>pendingOrders;
   static void addToPendingOrders(Order order)
   {
       System.out.println("This will add the order to the queue using queue add method");
   }
   static Order getNextOrder()
   {
       System.out.println("this will dequeue element from queue and returns next order");
       return new Order(1, new ArrayList<Product>());
   }

}
