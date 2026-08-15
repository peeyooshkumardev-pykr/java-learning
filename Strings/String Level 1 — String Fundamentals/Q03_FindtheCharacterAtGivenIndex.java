// Q03 — Find the Character at a Given Index

// Given a string and an index, print the character present at that index.

import java.util.Scanner;
public class Q03_FindtheCharacterAtGivenIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String = ");
        String str = sc.nextLine();

        System.out.print("Enter Index = ");
        int in = sc.nextInt();
        System.out.println("Character present at index "+ in +" = "+str.charAt(in));

        sc.close();
    }
}
//Output
// Enter String = Java Program
// Enter Index = 5
// Character present at index 5 = P