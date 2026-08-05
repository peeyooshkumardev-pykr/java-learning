//Check whether a number is prime.
import java.util.Scanner;
public class loop9 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Number = ");
        int n = sc.nextInt();

        boolean isPrime = true;

        if(n<=1){
            isPrime = false;
        }

        for(int i = 2; i<n; i++){
            if(n%i==0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not a Prime");
        }
        sc.close();
    }
}
// Number = 77
// Not a Prime

// Number = 73
// Prime Number