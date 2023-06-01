package at.fhj.msd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {
    private static final Logger logger = LogManager.getLogger(Calculator.class);
    public double add(double number1, double number2) {
        logger.debug("Add-Methode wurde mit Parametern " + number1 + " und " + number2 + " aufgerufen.");
        return number1+number2;
    }

    public double minus(double number1, double number2) {
        logger.debug("Minus-Methode wurde mit Parametern " + number1 + " und " + number2 + " aufgerufen.");

        return number1-number2;
    }

    public double divide(double number1, double number2) {
        logger.debug("Divide-Methode wurde mit Parametern " + number1 + " und " + number2 + " aufgerufen.");
        if (number2 == 0) {
            logger.error("Division durch null");
            throw new ArithmeticException("Division durch null");
        }
        return number1/number2;
    }

    public double multiply(double number1, double number2) {
        logger.debug("Multiply-Methode wurde mit Parametern " + number1 + " und " + number2 + " aufgerufen.");
        return number1*number2;
    }

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

