//Reverse a Number
import java.util.Scanner;
public class loop8{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number = ");
        int num = sc.nextInt();
        int reverse = 0;

        while(num!=0){
            reverse = reverse*10 + num % 10;
            num = num/10; 
        }
        System.out.println(reverse);

        sc.close();
    }
}
// Enter the Number = 45678
// 87654