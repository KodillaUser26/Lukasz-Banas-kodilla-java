package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.Assert;

public class CalculatorTestSuite {

    @Test
    public void testCalculatorSum() {
        //given
        double a = 4;
        double b = 2;

        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //when
        double result = calculator.add(a, b);

        //then
        Assert.assertEquals(6, result);
    }

    @Test
    public void testCalculatorMul() {
        //given
        double a = 4;
        double b = 2;

        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //when
        double result = calculator.mul(a, b);

        //then
        Assert.assertEquals(8, result);
    }

    @Test
    public void testCalculatorDiv() {
        //given
        double a = 4;
        double b = 2;

        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //when
        double result = calculator.div(a, b);

        //then
        Assert.assertEquals(2, result);
    }

    @Test
    public void testCalculatorSub() {
        //given
        double a = 4;
        double b = 2;

        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //when
        double result = calculator.sub(a, b);

        //then
        Assert.assertEquals(2, result);
    }

}