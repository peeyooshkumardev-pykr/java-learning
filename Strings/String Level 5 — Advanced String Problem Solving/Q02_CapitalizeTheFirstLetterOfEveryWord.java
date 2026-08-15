// Q02 — Capitalize the First Letter of Every Word

// Given a sentence, convert the first character of every word to uppercase.

import java.util.Scanner;

public class Q02_CapitalizeTheFirstLetterOfEveryWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter String = ");
        String str = sc.nextLine();

        String result = "";
        for(int i = 0; i<str.length(); i++){

            if(i==0 || str.charAt(i-1)==' '){
                result = result + Character.toUpperCase(str.charAt(i));
            }else{
                result = result + str.charAt(i);
            }
        }
        System.out.println(result);
        sc.close();
    }
}
//Output
// Enter String = java is object-oriented
// Java Is Object-oriented