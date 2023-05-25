package at.fhj.msd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void testAdd() {
        assertEquals(15, calculator.add(10, 5));
        assertEquals(0, calculator.add(-5, 5));
        assertEquals(-10, calculator.add(-5, -5));
    }

    @Test
    void testMinus() {
        assertEquals(5, calculator.minus(10, 5));
        assertEquals(0, calculator.minus(5, 5));
        assertEquals(-10, calculator.minus(-5, 5));
    }

    @Test
    void testDivide() {
        assertEquals(2, calculator.divide(10, 5));
        assertEquals(1, calculator.divide(5, 5));
        assertEquals(-1, calculator.divide(-5, 5));
    }

    @Test
    void testMultiply() {
        assertEquals(50, calculator.multiply(10, 5));
        assertEquals(0, calculator.multiply(0, 5));
        assertEquals(-25, calculator.multiply(-5, 5));
    }

    @Test
    void testFactorialOfPositiveNumber() {
        assertEquals(120, calculator.factorial(5));
    }

    @Test
    void testFactorialOfZero() {
        assertEquals(1, calculator.factorial(0));
    }

    @Test
    void testFactorialOfNegativeNumber() {
        assertEquals(0, calculator.factorial(-5));
    }



}
