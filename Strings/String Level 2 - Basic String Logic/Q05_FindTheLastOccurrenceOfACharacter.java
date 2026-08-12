// Q05 — Find the Last Occurrence of a Character
// Given a string and a character, find and print the index of the last occurrence of that character.

// If the character is not present, print an appropriate message.

import java.util.Scanner;

public class Q05_FindTheLastOccurrenceOfACharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String = ");
        String str = sc.nextLine();
        
        System.out.print("Enter Character = ");
        char ch = sc.nextLine().charAt(0);

        int lastIndex = 0; 
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i)==ch){
                lastIndex = i;
            }
        }
        System.out.println("Index of the Last occurrence of "+ch+" = "+lastIndex);

        sc.close();
    }
}
//Output
// Enter String = Occurrence
// Enter Character = c
// Index of the Last occurrence of c = 8