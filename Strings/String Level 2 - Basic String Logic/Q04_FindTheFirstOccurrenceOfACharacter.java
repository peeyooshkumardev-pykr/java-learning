// Q04 — Find the First Occurrence of a Character
// Given a string and a character, find and print the index of the first occurrence of 
// that character.

// If the character is not present, print an appropriate message.

import java.util.Scanner;

public class Q04_FindTheFirstOccurrenceOfACharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String = ");
        String str = sc.nextLine();
        
        System.out.print("Enter Character = ");
        char ch = sc.nextLine().charAt(0);

        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i)==ch){
                System.out.println("Index of the first occurrence of "+ch+" = "+i);
                break;
            }
        }
        sc.close();
    }
}
//Output
// Enter String = DataTypes
// Enter Character = T
// Index of the first occurrence of T = 4