package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialCalculatorTest {


    @Test
    void testForZero() {
        assertEquals(1, FactorialCalculator.calculateFactorial(0));
    }


    @Test
    void testForPositive() {

        assertEquals(2, FactorialCalculator.calculateFactorial(2));
        assertEquals(6, FactorialCalculator.calculateFactorial(3));
        assertEquals(24, FactorialCalculator.calculateFactorial(4));
    }

    @Test
    void testForNegative() {
        assertThrows(IllegalArgumentException.class, () -> FactorialCalculator.calculateFactorial(-1));

    }
}