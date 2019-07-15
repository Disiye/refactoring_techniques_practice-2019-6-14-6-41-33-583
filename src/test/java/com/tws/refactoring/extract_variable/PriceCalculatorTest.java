package com.tws.refactoring.extract_variable;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PriceCalculatorTest {
    @Test
    public void should_return_price_when_input_quantity() {
        // given
        PriceCalculator priceCalculator = new PriceCalculator();
        int quantity = 500;
        int itemPrice = 1;

        // when
        double price = priceCalculator.getPrice(quantity, itemPrice);

        // then
        assertEquals(550d, price, 1e-6);
    }
}
