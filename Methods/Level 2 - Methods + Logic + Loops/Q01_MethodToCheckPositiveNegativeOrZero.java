// Q01 — Method to Check Positive, Negative, or Zero
// Create a method named checkNumber() that accepts an integer and prints whether the number is 
// positive, negative, or zero.

public class Q01_MethodToCheckPositiveNegativeOrZero {
    public static void main(String[] args) {
        System.out.print(checkNumber(6));
    }

    static String checkNumber(int number){

        if(number<0){
            return "Number is Negative";
        }else if(number>0){
            return "Number is Positive";
        }else{
            return "Number is Zero";
        }
    }
}
// OUTPUT
// Number is Positive