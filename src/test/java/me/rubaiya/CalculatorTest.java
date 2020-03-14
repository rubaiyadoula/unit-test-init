package me.rubaiya;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    void addTest() {
        Calculator calculator = new Calculator();
        assertEquals(calculator.add(10, 20), 30);
    }

}
