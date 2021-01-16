package org.calculator;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator;
    private static final Logger logger = LogManager.getLogger(Calculator.class.getName());

    @Before
    public void setUp() throws Exception
    {
        BasicConfigurator.configure();
        calculator = new Calculator();
    }

    @Test
    public void when5Add10ResultIs10()
    {
        double expected = 15;
        double methodResult = calculator.add(5,10);
        assertEquals(expected,methodResult,0.001);
    }

    @Test
    public void add()
    {
        double expected = 340;
        double methodResult = calculator.add(320,20);
        assertEquals(expected,methodResult,0.001);

        double expected1 = 5;
        double methodResult1 = calculator.add(-5,10);
        assertEquals(expected1,methodResult1,0.001);
    }

    @Test
    public void when5AddTo10AsStringThenResult15() {
        double expected = 15;
        double result = calculator.add("10", "5");
        assertEquals(expected, result, 0.001);
    }

    @Test(expected = Exception.class)
    public void whenInputIncorrectValueThenThrowException() {
        calculator.add("asdfgasdf", "5");
    }

    @Test
    public void when5Difference10ResultIsMinus5()
    {
        double expected = -5;
        double methodResult = calculator.difference(5,10);
        assertEquals(expected,methodResult,0.001);
    }

    @Test
    public void difference()
    {
        double expected = 100;
        double methodResult = calculator.difference(105,5);
        assertEquals(expected,methodResult,0.001);

        double expected1= 0;
        double methodResult1 = calculator.difference(0,0);
        assertEquals(expected1,methodResult1,0.001);
    }

    @Test
    public void when5Multiply0ResultIs0()
    {
        double expected = 0;
        double methodResult = calculator.multiply(5,0);
        assertEquals(expected,methodResult,0.001);
    }


    @Test
    public void multiply()
    {
        double expected = 2;
        double methodResult = calculator.multiply(2,1);
        assertEquals(expected,methodResult,0.001);

        double expected1 = 25;
        double methodResult1 = calculator.multiply(5,5);
        assertEquals(expected1,methodResult1,0.001);
    }

    @Test(expected = ArithmeticException.class)
    public void when5DivisionBy0ResultIsException()
    {
        calculator.division(5,0);
    }

    @Test
    public void division()
    {
        double expected = 5;
        double methodResult = calculator.division(25,5);
        assertEquals(expected,methodResult,0.001);

        double expected1 = 7.2;
        double methodResult1 = calculator.division(36,5);
        assertEquals(expected1,methodResult1,0.01);
    }

}