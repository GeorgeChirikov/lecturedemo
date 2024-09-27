package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

    Calculator calculator= new Calculator();

    @Test
    public void multiplyTest(){
        assertEquals(10, calculator.multiply(5,2));
    }

    @Test
    public void subtractTest(){
        assertEquals(3, calculator.subtract(5,2));
    }

    @Test
    public void divideTest(){
        assertEquals(3, calculator.divide(6,2));
    }

}
