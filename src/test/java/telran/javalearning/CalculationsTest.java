package telran.javalearning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import static telran.javalearning.Calculations.*;

public class CalculationsTest
{
    @Test
    void sumTest()
    {
        assertEquals(4, sum(1, 3));
    }

    @Test
    void difTest()
    {
        assertEquals(-2, dif(1, 3));
        assertEquals(2, dif(3, 1));
    }

    @Test
    void mulTest()
    {
        assertEquals(6, mul(2, 3));
        assertEquals(6, mul(3, 2));
    }

    @Test
    void divTest()
    {
        assertEquals(0, div(2, 3));
        assertEquals(1, div(3, 2));
        assertEquals(2, div(4, 2));
    }

    @Test
    void sumOfDigitsTest()
    {
        assertEquals(15, sumOfDigits(1608));
    }

    @Test
    void maxDigitTest()
    {
        assertEquals(8, maxDigit(1608));
    }

    @Test
    void isDividedOnTest()
    {
        assertTrue(isDividedOn(14, 7));
        assertFalse(isDividedOn(16, 7));
        assertFalse(isDividedOn(16, 0));    // TODO java.lang.IllegalArgumentException: Divider cannot be zero
    }

}
