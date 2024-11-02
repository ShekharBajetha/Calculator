package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        // Example usage of the calculator
        System.out.println("Addition: " + calculator.add(2, 3)); // Should print 5
        System.out.println("Subtraction: " + calculator.subtract(5, 3)); // Should print 2
    }
}
