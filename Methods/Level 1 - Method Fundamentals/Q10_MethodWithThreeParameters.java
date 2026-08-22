// Q10 — Method With Three Parameters
// Create a method named calculateTotal() that accepts the prices of three items and 
// returns their total.


public class Q10_MethodWithThreeParameters {
    public static void main(String[] args) {
        System.out.print(calculateTotal(45, 32, 100));
    }

    static int calculateTotal(int a,int b,int c){
        return a+b+c;
    }
}
// OUTPUT
// 177