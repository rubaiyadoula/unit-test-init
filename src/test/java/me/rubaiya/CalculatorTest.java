package me.rubaiya;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calculator;

    @BeforeEach
    void init() {
        calculator = new Calculator();
    }

    @Test
    @Disabled
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

    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource(value = {"100, 200, 300", "0, 0, 0", "1, 1, 2"})
    void addParameterizedTest(int a, int b, int result) {
        assertEquals(result, calculator.add(a, b));
    }

    @Test
    void performanceTest() {
        // This test assures that the add method is calculating within 1s.
        assertTimeout(Duration.ofSeconds(1), () -> calculator.add(5, 6));
    }
}
