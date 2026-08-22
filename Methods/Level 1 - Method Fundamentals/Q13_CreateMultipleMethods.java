// Q13 — Create Multiple Methods
// Create three separate methods:

// add() — returns the sum of two numbers.
// subtract() — returns the difference of two numbers.
// multiply() — returns the product of two numbers.
// Call all three methods from main().

public class Q13_CreateMultipleMethods {
    public static void main(String[] args) {
        System.out.println("Addition = "+add(23, 11));
        System.out.println("Subtraction = "+subtract(23, 11));
        System.out.println("Multiplication = "+multiply(23, 11));
    }

    static int add(int num1, int num2){
        return num1 + num2;
    }

    static int subtract(int num1, int num2){
        return num1 - num2;
    }

    static int multiply(int num1, int num2){
        return num1 * num2;
    }
}
// OUTPUT
// Addition = 34
// Subtraction = 12
// Multiplication = 253