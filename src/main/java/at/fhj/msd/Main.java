package at.fhj.msd;

class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();


        System.out.println("Add: " + calculator.add(10, 5));
        System.out.println("Minus: " + calculator.minus(10, 5));
        System.out.println("Divide: " + calculator.divide(10, 5));
        System.out.println("Multiply: " + calculator.multiply(10, 5));
    }
}

