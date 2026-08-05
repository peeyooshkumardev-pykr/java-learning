//Find the factorial of a number
import java.util.Scanner;

public class loop6 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number = ");
        int n = sc.nextInt();
        int factorial = 1;

        for(int i = 1; i<=n; i++){
            factorial = factorial * i;
        }
        System.out.println("Factorial of n = " + factorial);
        sc.close();
    }
}
// Enter Number = 5
// Factorial of n = 120