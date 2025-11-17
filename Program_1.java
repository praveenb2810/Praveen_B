import java.util.Scanner;

class Calculator {
    private double a;
    private double b;
    private String operation;

    // Constructor
    public Calculator(double a, double b, String operation) {
        this.a = a;
        this.b = b;
        this.operation = operation;
    }

    // Method to perform operation
    public double calculate() {
        switch (operation.toLowerCase()) {
            case "add":
            case "+":
                return a + b;

            case "subtract":
            case "-":
                return a - b;

            case "multiply":
            case "*":
                return a * b;

            case "divide":
            case "/":
                if (b != 0) {
                    return a / b;
                } else {
                    throw new ArithmeticException("Division by zero is not allowed!");
                }

            default:
                throw new IllegalArgumentException("Invalid operation: " + operation);
        }
    }

    public double getA() {
        return a;
    }
}

public class Program_1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter first number (a): ");
        double a = sc.nextDouble();

        System.out.print("Enter second number (b): ");
        double b = sc.nextDouble();

        System.out.print("Enter operation (add, subtract, multiply, divide or +, -, *, /): ");
        String operation = sc.next();

        // Create calculator object
        Calculator calc = new Calculator(a, b, operation);

        // Perform calculation
        try {
            double result = calc.calculate();
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
