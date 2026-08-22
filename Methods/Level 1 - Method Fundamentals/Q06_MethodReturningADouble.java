// Q06 — Method Returning a Double
// Create a method named calculateAverage() that accepts two numbers and returns their average.

public class Q06_MethodReturningADouble {
    public static void main(String[] args) {
        System.out.print(calculateAverage(40.10, 20));
    }

    static double calculateAverage(double num1,double num2){
        return (num1+num2)/2;
    }
}
// OUTPUT
// 30.05