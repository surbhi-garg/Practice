package com.ttn.barista;

public class Customer {
    private String name;
    private long phoneNumber;

    public Customer(String name, long phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void waitForToken() {
        System.out.println("This method will keep customer waiting,until the token number is in completed queue,ie, barista raises notification" +
                "after that signal the customer with chosen mechanism");
    }
    public void collectCofee()
    {
        System.out.println("After the customer collects coffee, the order is stored in order table");
    }

}
