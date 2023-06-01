package at.fhj.msd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

class Main {
    private static final Logger logger = LogManager.getLogger();
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        logger.info("Starte die Berechnung");

        System.out.println("Add: " + calculator.add(10, 5));
        System.out.println("Minus: " + calculator.minus(10, 5));
        System.out.println("Divide: " + calculator.divide(10, 5));
        System.out.println("Multiply: " + calculator.multiply(10, 5));

        logger.error("Fehler bei der Berechnung");
    }
}

