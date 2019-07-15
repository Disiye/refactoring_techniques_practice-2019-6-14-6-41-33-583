package com.tws.refactoring.extract_method;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.*;

public class OwingPrinterTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void printOwing() {
        System.out.print("hello");
        assertEquals("hello", outContent.toString());
    }

    @Test
    public void return_owing_when_input_name_and_orders() {
        OwingPrinter owingPrinter = new OwingPrinter();
        owingPrinter.printOwing("name", Stream.of(1, 2, 3).map(Order::new).collect(Collectors.toList()));

        String expected = "*****************************" + "\r\n";
        expected = expected.concat("****** Customer totals ******" + "\r\n");
        expected = expected.concat("*****************************" + "\r\n");
        expected = expected.concat("name: name" + "\r\n");
        expected = expected.concat("amount: 6.0" + "\r\n");

        assertEquals(expected, outContent.toString());
    }
}