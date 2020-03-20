package me.rubaiya;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void addCorrectTest() {
        assertEquals(30, calculator.add(10, 20), "All is well.");
    }

    @Test
    void addIncorrectTest() {
        assertNotEquals(0, calculator.add(10, 20),"Failure is the pillar of success.");
    }

    @Test
    void addTypeIncorrectTest() {
        assertNotEquals(true, calculator.add(10, 20),"You're just not my type.");
    }

    @Test
    void addNotNullTest() {
        assertNotNull(calculator.add(10, 30), "No place for emptiness.");
    }

}
