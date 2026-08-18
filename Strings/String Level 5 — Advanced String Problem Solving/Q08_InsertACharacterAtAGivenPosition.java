// Q08 — Insert a Character at a Given Position

// Given a string, a character, and an index, insert the character at that position.

import java.util.Scanner;

public class Q08_InsertACharacterAtAGivenPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter String = ");
        String str = sc.nextLine();

        System.out.print("Enter the character = ");
        char ch = sc.next().charAt(0);

        System.out.print("Enter the index = ");
        int index = sc.nextInt();

        if(index>=str.length()){
            System.out.println("Out Of Range!");
            sc.close();
            return;
        }
        
        String resulString = "";
        for(int i = 0; i<str.length(); i++){

            if(i==index){
                char tempCh = str.charAt(i);
                resulString = resulString + ch + tempCh;
            }else{
                resulString = resulString + str.charAt(i);
            }
        }
        System.out.println("Result String = "+ resulString);
        sc.close();
    }
}
//Output
// Enter String = hello 
// Enter the character = X
// Enter the index = 4
// Result String = hellXo

// Enter String = hello
// Enter the character = x
// Enter the index = 6
// Out Of Range!
