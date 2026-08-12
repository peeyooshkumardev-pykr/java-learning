// Q08 — Compare Two Strings
// Given two strings, check whether they are equal or not.

// The comparison should be case-sensitive.

import java.util.Scanner;

public class Q08_CompareTwoStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st String = ");
        String str1 = sc.nextLine();

        System.out.print("Enter 2nd String = ");
        String str2 = sc.nextLine();

        if(str1.equals(str2)){
            System.out.println("Two Strings are Equal");
        }else{
            System.out.println("Two Strings are not Equal");
        }
        sc.close();
    }
}
//Output
// Enter 1st String = inheritence
// Enter 2nd String = inheritence
// Two Strings are Equal

// Enter 1st String = inheritance
// Enter 2nd String = Inheritance
// Two Strings are not Equal