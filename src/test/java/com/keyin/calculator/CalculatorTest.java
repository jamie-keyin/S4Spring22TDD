package com.keyin.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    private Calculator calculatorUnderTest = new Calculator();

    @Test
    public void testAdd() {
        StringBuilder output = new StringBuilder();

        int resultOne = calculatorUnderTest.add(1,1);
        output.append("First Addition Result: " + resultOne);
        output.append('\n');
        Assertions.assertEquals(2, resultOne);

        int resultTwo = calculatorUnderTest.add(2,2);
        output.append("Second Addition Result: " + resultTwo);
        output.append('\n');
        Assertions.assertEquals(4, resultTwo);

        Assertions.assertEquals(25, calculatorUnderTest.add(5,20));

        Assertions.assertNotEquals(3, calculatorUnderTest.add(2,2));

        Assertions.assertNotEquals(5, calculatorUnderTest.add(2,2));

        System.out.println(output);
    }
}
