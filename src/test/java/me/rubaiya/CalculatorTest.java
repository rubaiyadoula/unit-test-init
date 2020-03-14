package me.rubaiya;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void addCorrectTest() {
        assertEquals(calculator.add(10, 20), 30, "All is well.");
    }

    @Test
    void addIncorrectTest() {
        assertNotEquals(calculator.add(10, 20), 0, "Failure is the pillar of success.");
    }

    @Test
    void addTypeIncorrectTest() {
        assertNotEquals(calculator.add(10, 20), true, "You're just not my type.");
    }

    @Test
    void addNotNullTest() {
        assertNotNull(calculator.add(10, 30), "No place for emptiness.");
    }

}
