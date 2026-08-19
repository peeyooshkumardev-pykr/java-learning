// Q05 — Find the Last Occurrence of a Character
// Given a string and a character, find and print the index of the 
// last occurrence of that character.

// If the character is not present, print an appropriate message.

import java.util.Scanner;

public class Q05_FindTheLastOccurrenceOfACharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String = ");
        String str = sc.nextLine();
        
        System.out.print("Enter Character = ");
        char ch = sc.nextLine().charAt(0);

        int lastIndex = -1;
        boolean Found = false;
        for(int i = 0; i<str.length(); i++){
            if(ch==str.charAt(i)){
                lastIndex = i;
                Found = true;
            }
        }
        if(Found){
        System.out.println("the index of the last occurrence of "+ch+" = "+lastIndex);
        }
        else{
            System.out.println("Character Not Found");
        }
        
        sc.close();
    }
}
//Output
// Enter String = matter
// Enter Character = t
// the index of the last occurrence of t = 3

// Enter String = hello
// Enter Character = w
// Character Not Found