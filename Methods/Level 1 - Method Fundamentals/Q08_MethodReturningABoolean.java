// Q08 — Method Returning a Boolean
// Create a method named isEven() that accepts an integer and returns true if the number is even 
// and false otherwise.

public class Q08_MethodReturningABoolean {
    public static void main(String[] args) {
        System.out.print(isEven(44));
    }

    static boolean isEven(int number){
        if(number % 2 == 0){
            return true;
        }else{
            return false;
        }
    }
}
// OUTPUT
// true