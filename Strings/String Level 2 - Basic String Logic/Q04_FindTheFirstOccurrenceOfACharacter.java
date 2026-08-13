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

        boolean found = false;
        int firstIndex = -1;
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i)==ch){
                firstIndex = i;
                found = true;
                break;
            }
        }
        if(found){
            System.out.println("Index of the first occurrence of "+ch+" = "+firstIndex);
        }else{
            System.out.println("Character Not Found!");
        }
        sc.close();
    }
}
//Output
// Enter String = Pulsur
// Enter Character = u
// Index of the first occurrence of u = 1

// Enter String = Bike
// Enter Character = s
// Character Not Found!