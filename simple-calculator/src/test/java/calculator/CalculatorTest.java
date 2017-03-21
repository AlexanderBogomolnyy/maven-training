package calculator;

import calculator.Calculator;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() throws Exception {
        calculator = new Calculator();
    }

    @Test
    public void testAddCorrectAnswer() throws Exception {
        assertEquals(3, calculator.add(1, 2));
    }

    @Test
    public void testAddIncorrectAnswer() throws Exception {
        assertNotEquals(4, calculator.add(1, 2));
    }
}