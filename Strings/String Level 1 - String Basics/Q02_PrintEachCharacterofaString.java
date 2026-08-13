// Print Each Character of a String

// Given a string, print each character of the string on a separate line.

import java.util.Scanner;

public class Q02_PrintEachCharacterofaString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String = ");
        String str = sc.nextLine();

        for(int i = 0; i<str.length(); i++){
            System.out.println(str.charAt(i));
        }
        sc.close();
    }
}
// Output
// Enter String = Peeyoosh
// P
// e
// e
// y
// o
// o
// s
// h
