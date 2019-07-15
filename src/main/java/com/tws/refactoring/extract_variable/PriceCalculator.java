package com.tws.refactoring.extract_variable;

public class PriceCalculator {

    private static final int QUANTITY_MAX = 500;
    private static final double SHIPPING_MAX = 100.0;

    double getPrice(int quantity, int itemPrice) {
        double basePrice = quantity * itemPrice;
        double discount = Math.max(0, quantity - QUANTITY_MAX) * itemPrice * 0.05;
        double shipping = Math.min(quantity * itemPrice * 0.1, SHIPPING_MAX);
        return basePrice - discount + shipping;
    }
}
