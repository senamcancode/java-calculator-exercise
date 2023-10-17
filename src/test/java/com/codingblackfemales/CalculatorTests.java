package com.codingblackfemales;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName(value = "The Calculator should")
public class CalculatorTests {

    @Test
    @DisplayName("add two numbers")
    public void testAddition() {
        final Integer sum = Calculator.add(2, 4);

        assertEquals(6, sum);
    }

    @Test
    @DisplayName("subtract two numbers")
    public void testSubtraction() {
        final Integer difference = Calculator.subtract(2, 4);

        assertEquals(-2, difference);
    }

    @Test 
    @DisplayName("multiply two numbers")
    public void testMultiplication(){
        final Integer product = Calculator.multiply(2, 4);

        assertEquals(8, product);
    }

    @Test 
    @DisplayName("multiply negative numbers")
    public void testNegativeMultiplication(){
        final Integer product = Calculator.multiply(-1, -1);

        assertEquals(1, product); 
    }

    @Test 
    @DisplayName("multiply one negative")
    public void testNegativeAndPositiveMultiplication(){
        final Integer product = Calculator.multiply(-1, 2);

        assertEquals(-2, product); 
    }

    @Test
    @DisplayName("divide two numbers")
    public void testDivision(){
        final Integer division = Calculator.divide(10, 2);

        assertEquals(10, division);
    }

    @Test
    @DisplayName("divide by 0 throws exception")
    public void testDivideByZero() {
        
        assertThrows(ArithmeticException.class, () => {
            Calculator.divide(10, 0);
        }) 
    }
}
