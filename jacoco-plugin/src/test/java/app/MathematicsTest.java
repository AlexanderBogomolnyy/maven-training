package app;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MathematicsTest {

    private Mathematics mathematics;

    @Before
    public void setUp() throws Exception {
        mathematics = new Mathematics();
    }

    @Test
    public void testAdd() throws Exception {
        assertEquals(2, mathematics.add(1, 1));
    }

    @Test
    public void testAbsPositive() throws Exception {
        assertEquals(1, mathematics.abs(1));
    }

    @Test
    public void testAbsNegative() throws Exception {
        assertEquals(1, mathematics.abs(-1));
    }

    @Test(expected = ArithmeticException.class)
    public void testDivArithmeticException() throws Exception {
        mathematics.div(0, 0);
    }

}