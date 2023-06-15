package at.fhj.msd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Calculator class providing basic arithmetic operations.
 *
 * @author Laurenz Altendorfer
 */
public class Calculator {
    /**
     * Logger for debug and error messages.
     */
    private static final Logger logger = LogManager.getLogger(Calculator.class);

    /**
     * Adds two numbers.
     *
     * @param number1 The first addend.
     * @param number2 THe second addend.
     * @return The sum of two numbers.
     */
    public double add(double number1, double number2) {
        logger.debug("Add-Methode wurde mit Parametern " + number1 + " und " + number2 + " aufgerufen.");
        return number1+number2;
    }

    /**
     * Subtracts one number from another.
     *
     * @param number1 The minuend.
     * @param number2 The subtrahend.
     * @return The difference of the two numbers.
     */
    public double minus(double number1, double number2) {
        logger.debug("Minus-Methode wurde mit Parametern " + number1 + " und " + number2 + " aufgerufen.");

        return number1-number2;
    }

    /**
     * Divides one number by another.
     *
     * @param number1 The dividend.
     * @param number2 The divisor.
     * @return The result of the division.
     * @throws ArithmeticException If the divisor is zero.
     */
    public double divide(double number1, double number2) {
        logger.debug("Divide-Methode wurde mit Parametern " + number1 + " und " + number2 + " aufgerufen.");
        if (number2 == 0) {
            logger.error("Division durch null");
            throw new ArithmeticException("Division durch null");
        }
        return number1/number2;
    }

    /**
     * Multiplies two numbers.
     *
     * @param number1 The first factor.
     * @param number2 The second factor.
     * @return The product of two numbers.
     */
    public double multiply(double number1, double number2) {
        logger.debug("Multiply-Methode wurde mit Parametern " + number1 + " und " + number2 + " aufgerufen.");
        return number1*number2;
    }

    /**
     * Calculates the factorial of a given number
     *
     * @param n The number to calculate the factorial of.
     * @return The factorial of n, or 0 if n is negative.
     */
    public int factorial(int n) {
        logger.debug("Factorial-Methode wurde mit Parametern " + n + " aufgerufen.");
        if (n < 0) {
            return 0;
        }
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}

