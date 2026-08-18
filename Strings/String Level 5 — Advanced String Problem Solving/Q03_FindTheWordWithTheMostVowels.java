// Q03 — Find the Word With the Most Vowels

// Given a sentence, find the word that contains the highest number of vowels.

import java.util.Scanner;

public class Q03_FindTheWordWithTheMostVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter String = ");
        String str = sc.nextLine();

        int start = 0;
        String word = "";
        int maxVowels = 0;

        for(int i = 0; i<=str.length(); i++){
            
            if(i==str.length() || str.charAt(i)==' '){
                int count = 0; 

                for(int j = i-1; j>=start; j--){
                    if(str.charAt(j)=='a'||str.charAt(j)=='e'||str.charAt(j)=='i'||str.charAt(j)=='o'||str.charAt(j)=='u'||str.charAt(j)=='A'||str.charAt(j)=='E'||str.charAt(j)=='I'||str.charAt(j)=='O'||str.charAt(j)=='U'){
                        count++;
                    }
                }
                if(count>maxVowels){
                    maxVowels = count;
                    word = str.substring(start,i);
                }
                start = i + 1;
            }
        }
        System.out.println("Highest number of Vowels = " + maxVowels);
        System.out.println("Word With the Most Vowels = " + word);

        sc.close();
    }
}
//Output
// Enter String = java programming education
// Highest number of vowels = 5
// Word With the Most Vowels = education

// Enter String = COMPUTER science ENGINEERING algorithms
// Highest number of vowels = 5
// Word With the Most Vowels = ENGINEERING