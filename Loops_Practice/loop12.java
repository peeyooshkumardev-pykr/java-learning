//Perfect Number
import java.util.Scanner;

public class loop12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number = ");
        int num = sc.nextInt();
        boolean isPerfect = true;
        int sum = 0;
        for(int i = 1; i<num; i++){
            if(num%i==0){
                sum = sum + i;
            }
        }
        if(sum!=num){
            isPerfect = false;
        }
        if(isPerfect){
            System.out.println("Perfect number");
        }
        else{
            System.out.println("Not a Perfect number");
        }
        sc.close();
    }
}
