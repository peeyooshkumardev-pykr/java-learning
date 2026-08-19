import java.util.Scanner;

public class Q14_FindTheFactorialOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the integer = ");
        int num = sc.nextInt();

        System.out.println("Factorial of "+num);
        int mul = 1;
        for(int i = 1; i<=num; i++){
            System.out.print(i);
            if(i<num){
                System.out.print(" * ");
            }
            mul = mul * i;
        }
        System.out.print(" = "+mul);
        sc.close();
    }
}
//OUTPUT
// Enter the integer = 6
// Factorial of 6
// 1 * 2 * 3 * 4 * 5 * 6 = 720
