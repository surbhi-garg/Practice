package com.ttn.barista;

import java.util.List;

public class Cashier {
    int employeeId;
    String name;
    public void collectPayment(float cash)
    {
        System.out.println("This method will be called in take order, after computing the total price of order" +
                "Made this as collectPayment(), so that if any other mechanism than cash comes, we can process accordingly");
    }
    public int takeOrder(List<Product> productList)
    {
        int tokenNumber=0;//any random token number generator logic here
        System.out.println("This method will sum the price of all products and calls collectPayment by calculating sum" +
                "and generate a toke number for that order");
        System.out.println("this will also call placeOrderToPendingQueue with by creating an Order object");
        return tokenNumber;
    }
    public void placeOrderToPendingQueue(Order order)
    {
        System.out.println("This method will add the order to a pending order queue" +
                "by calling a method addToPendingOrdersof class PendingOrderQueue");
    }
}
