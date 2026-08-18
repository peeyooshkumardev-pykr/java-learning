// Q09 — Print Each Word With Its Number of Vowels

// Given a sentence, print every word along with the number of vowels it contains.

import java.util.Scanner;

public class Q09_PrintEachWordWithItsNumberOfVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter String = ");
        String str = sc.nextLine();
        
        int start = 0;
        for(int i = 0; i<=str.length(); i++){

            int count = 0;

            if(i==str.length() || str.charAt(i)==' '){

                for(int j = start; j<i; j++){
                    if(str.charAt(j)=='a'||str.charAt(j)=='e'||str.charAt(j)=='i'||str.charAt(j)=='o'||str.charAt(j)=='u'||str.charAt(j)=='A'||str.charAt(j)=='E'||str.charAt(j)=='I'||str.charAt(j)=='O'||str.charAt(j)=='U'){
                        count++;
                    }
                }
                System.out.println(str.substring(start,i)+" = "+count);

                start = i + 1;
            }
        }
        sc.close();
    }
}
// Output
// Enter String = Java is powerful
// Java = 2
// is = 1
// powerful = 3

// Enter String = JAVA IS FREE
// JAVA = 2
// IS = 1
// FREE = 2