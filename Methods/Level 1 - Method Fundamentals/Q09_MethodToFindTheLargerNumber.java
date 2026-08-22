// Q09 — Method to Find the Larger Number
// Create a method named findLargest() that accepts two integers and returns the larger number.

public class Q09_MethodToFindTheLargerNumber {
    public static void main(String[] args) {
        System.out.print("Largest Number = "+findLargest(33, 11));
    }

    static int findLargest(int a, int b){
        if(a>b){
            return a;
        }else{
            return b;
        }
    }
}
// OUTPUT
// Largest Number = 33
