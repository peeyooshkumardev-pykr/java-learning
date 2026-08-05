//Palindrome Number
// Number = 123321
// Reverse = 123321
// Palindrome
// Number = 12344
// Reverse = 44321
// Not A Palindrome

import java.util.Scanner;
public class loop10 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Number = ");
        int num = sc.nextInt();
        int reverse=0;
        int num1=num;
        boolean isPalindrome = true;

        while(num!=0){
            reverse = reverse * 10 + num%10;
            num=num/10; 
        }
        System.out.println("Reverse = "+reverse);
        if(reverse!=num1){
            isPalindrome = false;
        }
        if(isPalindrome){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not A Palindrome");
        }
        sc.close();
    }
}
