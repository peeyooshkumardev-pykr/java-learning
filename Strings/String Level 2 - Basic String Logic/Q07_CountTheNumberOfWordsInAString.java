// Q07 — Count the Number of Words in a String
// Given a sentence, count and print the total number of words.

// Words are separated by spaces.

import java.util.Scanner;

public class Q07_CountTheNumberOfWordsInAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String = ");
        String str = sc.nextLine();

        int count = 0;
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i)!=' '){
                if(i==0 || str.charAt(i-1)==' '){
                    count++;
                }
            }
        }
        System.out.println("Total number of words = "+count);
        sc.close();
    }
}
//Output
// Enter String = Java is platform independent.
// Total number of words = 4