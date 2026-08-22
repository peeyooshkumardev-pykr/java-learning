// Q02 — Method to Check Divisibility by 3 and 5

// Create a method named isDivisibleByBoth() that accepts an integer and returns true if the number 
// is divisible by both 3 and 5, otherwise returns false.

public class Q02_MethodToCheckDivisibilityBy3and5 {
    public static void main(String[] args) {
        System.out.print(isDivisibleByBoth(15));
    }

    static boolean isDivisibleByBoth(int number){

        return number%3==0 && number%5==0;
    }
}
// OUTPUT
// true