package org.calculator;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Calculator
{
    private static final Logger logger = LogManager.getLogger(Calculator.class.getName());

    public double add(double a,double b)
    {
        return a+b;
    }

    public double multiply(double a,double b)
    {
        return a*b;
    }

    public double difference(double a,double b)
    {
        return a-b;
    }

    public double division(double a,double b)
    {
        if(b == 0)
        {
            throw new ArithmeticException("Cant division by 0");
        }
        else {
            return a / b;
        }
    }

    public double add(String a, String b)
    {
        double numA = Integer.parseInt(a);
        double numB = Integer.parseInt(b);
        return numA + numB;
    }

    public static void main(String[] args)
    {
        BasicConfigurator.configure();
        Calculator calculator = new Calculator();

        logger.info(calculator.add(5.3,6.7));
    }


}
