// Q16 — Method to Find LCM
// Create a method named findLCM() that accepts two integers and returns their 
// Least Common Multiple.

import java.util.Scanner;

public class Q16_MethodToFindLCM {

    static int findLCM(int num1, int num2){
        int multiple = Math.max(num1,num2);

        while(true){
            if(multiple % num1 == 0 && multiple % num2 == 0){
                return multiple;
            }
            multiple++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the 1st integer = ");
        int num1= sc.nextInt();

        System.out.print("Enter the 2nd integer = ");
        int num2 = sc.nextInt();

        System.out.print("LCM = "+ findLCM(num1, num2));
        sc.close();
    }
}
// OUTPUT
// Enter the 1st integer = 12
// Enter the 2nd integer = 18
// LCM = 36