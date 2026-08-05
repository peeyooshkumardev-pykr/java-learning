//Count the Digits in a number.
import java.util.Scanner;

public class loop7 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number = ");
        int num = sc.nextInt();
        int count = 0;
        while(num!=0){
            num = num/10;
            count++;
        }
        System.out.println("Number of Digits = " + count);
        sc.close();
    }
}
// Enter Number = 987654321
// Number of Digits = 9