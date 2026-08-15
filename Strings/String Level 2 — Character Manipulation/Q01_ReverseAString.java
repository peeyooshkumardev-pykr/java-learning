// Q01 — Reverse a String
// Given a string, reverse it and print the reversed string.

import java.util.Scanner;

public class Q01_ReverseAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String = ");
        String str = sc.nextLine();

        System.out.println("Reversed String");

        int temp;
        for(int i = 0; i<str.length(); i++){
            temp = str.length()-1-i;
            System.out.print(str.charAt(temp));
        }
        sc.close();
    }
}
//Output
// Enter String = Reverse
// Reversed String
// esreveR