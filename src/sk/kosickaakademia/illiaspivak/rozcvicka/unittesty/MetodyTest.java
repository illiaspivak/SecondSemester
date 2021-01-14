package sk.kosickaakademia.illiaspivak.rozcvicka.unittesty;

import org.junit.Test;

import static org.junit.Assert.*;

public class MetodyTest {


    @Test
    public void fibonacciSum() {
        assertEquals(1,Metody.fibonacciSum(1));
        assertEquals(0,Metody.fibonacciSum(0));
        assertEquals(2,Metody.fibonacciSum(2));
        assertEquals(12,Metody.fibonacciSum(5));
        assertEquals(0,Metody.fibonacciSum(-12));
    }

    @Test
    public void getFactorial() {
        assertEquals(1,Metody.getFactorial(1));
        assertEquals(1,Metody.getFactorial(0));
        assertEquals(0,Metody.getFactorial(-12));
        assertEquals(479001600,Metody.getFactorial(12));

    }

    @Test
    public void reverseNumber() {
        assertEquals(1,Metody.reverseNumber(1));
        assertEquals(145,Metody.reverseNumber(541));
        assertEquals(-51,Metody.reverseNumber(-15));
        assertEquals(0,Metody.reverseNumber(0));
        assertEquals(578,Metody.reverseNumber(875));
    }
}