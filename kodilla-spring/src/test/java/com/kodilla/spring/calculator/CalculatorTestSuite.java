package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.testng.Assert.assertEquals;

public class CalculatorTestSuite {
    @Test
    public void testCalculations() {
        // Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        double d1 = 4;
        double d2 = 2;
        double expectedSumResult = 6;
        double expectedSubResult = 2;
        double expectedMulResult = 8;
        double expectedDivResult = 2;


        // When
        double sumResult = calculator.add(d1, d2);
        double subResult = calculator.sub(d1, d2);
        double mulResult = calculator.mul(d1, d2);
        double divResult = calculator.div(d1, d2);

        // Then
        assertEquals(expectedSumResult, sumResult);
        assertEquals(expectedSubResult, subResult);
        assertEquals(expectedMulResult, mulResult);
        assertEquals(expectedDivResult, divResult);
    }
}
