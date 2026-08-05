//Find the sum of numbers from 1 to n
import java.util.Scanner;

public class loop5 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number = ");
        int n = sc.nextInt();
        int sum = 0;

        for(int i = 1; i<=n; i++){
            sum = sum + i;
        }
        System.out.println("Sum of numbers in n = " + sum);
        sc.close();
    }
}
// Enter Number = 5
// Sum of numbers in n = 15