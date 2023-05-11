package at.fhj.msd;

public class Calculator {
    public double add(double number1, double number2) {
        return number1+number2;
    }

    public double minus(double number1, double number2) {
        return number1-number2;
    }

    public double divide(double number1, double number2) {
        return number1/number2;
    }

    public double multiply(double number1, double number2) {
        return number1*number2;
    }
}

class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();


        System.out.println("Add: " + calculator.add(10, 5));
        System.out.println("Minus: " + calculator.minus(10, 5));
        System.out.println("Divide: " + calculator.divide(10, 5));
        System.out.println("Multiply: " + calculator.multiply(10, 5));
    }
}
