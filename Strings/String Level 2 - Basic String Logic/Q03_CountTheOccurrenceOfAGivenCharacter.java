// Q03 — Count the Occurrence of a Given Character
// Given a string and a character, count how many times that character appears in the string.

// The comparison should be case-sensitive.

import java.util.Scanner;

public class Q03_CountTheOccurrenceOfAGivenCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String = ");
        String str = sc.nextLine();

        System.out.print("Enter Character = ");
        char ch = sc.nextLine().charAt(0);
        
        int count = 0;
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i)==ch){
                count++;
            }
        }
        System.out.println("Number of times "+ch+" appears in the string = "+count);

        sc.close();
    }
}
//Output
// Enter String = Programming
// Enter Character = m
// Number of times m appears in the string = 2