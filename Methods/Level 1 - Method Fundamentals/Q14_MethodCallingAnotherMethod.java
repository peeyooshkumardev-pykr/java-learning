// 14 — Method Calling Another Method
// Create two methods:

// square() — returns the square of a number.
// calculateFourTimes() — uses the square() method to calculate four times the number's square.

public class Q14_MethodCallingAnotherMethod {
    public static void main(String[] args) {
        System.out.print("Four times = "+calculateFourTimes(5));
    }

    static int square(int number){
        return number*number;
    }

    static int calculateFourTimes(int number){
        return square(number)*4;
    }
}
// OUTPUT
// Four times = 100