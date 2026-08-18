// Q06 — Find the Longest Consecutive Character Sequence

// Given a string, find the character that appears consecutively for the longest time.

import java.util.Scanner;

public class Q06_FindTheLongestConsecutiveCharacterSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter String = ");
        String str = sc.nextLine();

        int maxCount = 1;
        int count = 1;
        char longestConsecutiveCharacter = str.charAt(0);

        for(int i = 0; i<str.length()-1; i++){
            
            if(str.charAt(i)==str.charAt(i+1)){
                count++;
            }
            else{
                count = 1;
            }

            if(count>maxCount){
                maxCount = count;
                longestConsecutiveCharacter = str.charAt(i);
            }
        }

        System.out.println("Longest Consecutive Character Sequence = "+ longestConsecutiveCharacter);
        System.out.println("Number of times consecutively appear = "+ maxCount);

        sc.close();
    }
}
//Output
// Enter String = abbcccc
// Longest Consecutive Character Sequence = c
// Number of times consecutively appear = 4