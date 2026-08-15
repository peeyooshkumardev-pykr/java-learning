// Q01 — Find the Length of a String
// Given a string, find and print the total number of characters in the string.

import java.util.Scanner;

public class Q01_FindtheLengthofaString {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String = ");
        String str = sc.nextLine();

        System.out.println("Length of String = " + str.length());

        sc.close();
    }
}
// Output
// Enter String = Hello Peeyoosh
// Length of String = 14