// Q10 — Check Whether a String Contains Only Digits
// Given a string, check whether every character in the string is a digit from 0 to 9.

import java.util.Scanner;

public class Q10_CheckWhetherAStringContainsOnlyDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String = ");
        String str = sc.nextLine();

        boolean isTrue = true;
        for(int i = 0; i<str.length(); i++){
            if(!Character.isDigit(str.charAt(i))){
                isTrue = false;
                break;
            }
        }
        if(isTrue){
            System.out.println("String contains only digits.");
        }else{
            System.out.println("String does not contain only digits.");
        }
        sc.close();
    }
}
// //Output
// Enter String = 98765
// String contains only digits.

// Enter String = Hello 123
// String does not contain only digits.