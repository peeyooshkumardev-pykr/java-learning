// Q04 — Count Vowels in a String

// Given a string, count and print the total number of vowels (a, e, i, o, u) present in the string.
// The program should count both uppercase and lowercase vowels.

import java.util.Scanner;

public class Q04_CountVowelsInAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String = ");
        String str = sc.nextLine();

        System.out.print("Vowels are (");

        int  count = 0;
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i)=='a'||str.charAt(i)=='A'||str.charAt(i)=='e'||str.charAt(i)=='E'||str.charAt(i)=='i'||str.charAt(i)=='I'||str.charAt(i)=='o'||str.charAt(i)=='O'||str.charAt(i)=='u'||str.charAt(i)=='U'){
                System.out.print(str.charAt(i) + " ");
                count++;
            }
        }
        System.out.print(")");
        System.out.println();
        System.out.println("Total number of vowels (a, e, i, o, u) present in the string = "+count);

        sc.close();
    }
}
//Output
// Enter String = Education
// Vowels are (E u a i o )
// Total number of vowels (a, e, i, o, u) present in the string = 5

// Enter String = Peeyoosh
// Vowels are (e e o o )
// Total number of vowels (a, e, i, o, u) present in the string = 4