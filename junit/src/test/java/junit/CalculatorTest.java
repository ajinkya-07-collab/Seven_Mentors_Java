package junit;

import org.junit.jupiter.api.*;

import com.junit.Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    private final Calculator calcualtor = new Calculator();

    @Test
    void testAddition() {
        assertEquals(50, calcualtor.add(20, 30));
    }

    @Test
    void testSubtraction() {
        assertEquals(80, calcualtor.subtract(100, 20));
    }

    @Test
    void testMultiplication() {
        assertEquals(80, calcualtor.multiply(40, 2));
    }

    @Test
    void testDivision() {
        assertEquals(2, calcualtor.divide(10, 0));
    }

}
