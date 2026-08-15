// Q05 — Count Consonants in a String

// Given a string, count and print the total number of consonants present in the string.

// Count both uppercase and lowercase letters. Ignore spaces, digits, and special characters.

import java.util.Scanner;
public class Q05_CountConsonantsInAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String = ");
        String str = sc.nextLine();

        System.out.print("Consonents are ( ");

        int count = 0;
        for(int i = 0; i<str.length(); i++){

            boolean isConsonant = true;

            if(Character.isLetter(str.charAt(i))){
            if(str.charAt(i)=='a'||str.charAt(i)=='A'||str.charAt(i)=='e'||str.charAt(i)=='E'||str.charAt(i)=='i'||str.charAt(i)=='I'||str.charAt(i)=='o'||str.charAt(i)=='O'||str.charAt(i)=='u'||str.charAt(i)=='U'){
                isConsonant = false;
            }
            if(isConsonant){
                System.out.print(str.charAt(i)+" ");
                count++;
            }
        }
        }
        System.out.print(")");
        System.out.println();
        System.out.println("Total number of consonants present in the string = "+count);

        sc.close();
    }
}
//Output
// Enter String = Learning Strings
// Consonents are ( L r n n g S t r n g s )
// Total number of consonants present in the string = 11