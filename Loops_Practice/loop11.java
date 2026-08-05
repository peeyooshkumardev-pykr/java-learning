//Armstrong Number
// Number = 371
// ArmStrong
import java.util.Scanner;
public class loop11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number = ");
        int num = sc.nextInt();
        boolean isArmstrong = true;
        int num1 = num;
        int temp = 0;
        int sum = 0;

        while(num!=0){
            temp = num % 10;
            temp = temp*temp*temp;
            sum = sum + temp;
            num=num/10;
        }
        if(sum!=num1){
            isArmstrong = false;
        }
        if(isArmstrong){
            System.out.println("ArmStrong");
        }
        else{
            System.out.println("Not ArmStrong");
        }
        sc.close();
    }
}
