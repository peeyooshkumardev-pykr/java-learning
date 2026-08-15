// Q01 — Reverse Each Word in a String
// Given a sentence, reverse each individual word while keeping the order of the words unchanged.

import java.util.Scanner;

public class Q01_ReverseEachWordInAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String = ");
        String str = sc.nextLine();

        System.out.print("Resulted String = ");

        int start = 0;
        for(int i = 0; i<=str.length(); i++){

            if(i==str.length() || str.charAt(i)==' '){
                for(int j = i - 1; j>=start; j--){
                    System.out.print(str.charAt(j));
                }
                if(i<str.length()){
                    System.out.print(" ");
                }
                start = i + 1;
            }
        }
        sc.close();
    }
}
//Output
// Enter String = Object Oriented
// Resulted String = tcejbO detneirO