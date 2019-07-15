package com.tws.refactoring.extract_method;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class OwingPrinter {

    public static final double OUTSTANDING = 0.0;

    void printOwing(String name, List<Order> orders) {
        Iterator<Order> elements = orders.iterator();
        printBanner();
        System.out.println("name: " + name);
        System.out.println("amount: " + getOutstanding(elements, OUTSTANDING));
    }

    private double getOutstanding(Iterator<Order> elements, double outstanding) {
        while (elements.hasNext()) {
            Order each = (Order) elements.next();
            outstanding += each.getAmount();
        }
        return outstanding;
    }

    private void printBanner() {
        System.out.println ("*****************************");
        System.out.println ("****** Customer totals ******");
        System.out.println ("*****************************");
    }
}

class Order {
    private final double amount;

    public Order(double amount) {
        this.amount = amount;
    }

    double getAmount() {
        return amount;
    }
}