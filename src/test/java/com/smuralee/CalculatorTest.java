package com.smuralee;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class CalculatorTest {

    private static Calculator calculator;

    private static int a;
    private static int b;

    @BeforeAll
    static void setup() {
        a = 10;
        b = 20;
        calculator = spy(new Calculator());
    }

    @Test
    @DisplayName("GIVEN 2 numbers, WHEN added, THEN sum is returned ")
    void add() {
        assertEquals(30, calculator.add(a, b));
        verify(calculator, times(1)).add(a, b);
    }
}
