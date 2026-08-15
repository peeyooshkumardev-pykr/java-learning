// Q09 — Check Whether Two Strings Are Rotations

// Given two strings, check whether one string is a rotation of the other.

import java.util.Scanner;

public class Q09_CheckWhetherTwoStringsAreRotations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter String 1 = ");
        String str1 = sc.nextLine();

        System.out.print("Enter String 2 = ");
        String str2 = sc.nextLine();

        if(str1.length()==str2.length()){

            String combinedString = str1 + str1;

            if(combinedString.contains(str2)){
                System.out.println("Two Strings Are Rotations");
            }
            else{
                System.out.println("Two Strings Are Not Rotations");
            }
        }
        sc.close();
    }
}
//Output
// Enter String 1 = java
// Enter String 2 = vaja
// Two Strings Are Rotations

// Enter String 1 = hello
// Enter String 2 = world
// Two Strings Are Not Rotations