// Q07A — Replace a Character Manually

// Given a string, a character to find, and a replacement character, replace 
// every occurrence of the given character with the replacement character.

import java.util.Scanner;

public class Q07A_ReplaceACharacterManually {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter String = ");
        String str = sc.nextLine();

        System.out.print("Enter the charater to find = ");
        char chFind = sc.next().charAt(0);

        System.out.print("Enter the charater to replace = ");
        char chReplace = sc.next().charAt(0);

        String result = "";
        for(int i = 0; i<str.length(); i++){
            if(chFind==str.charAt(i)){
                result = result + chReplace;
            }else{
                result = result + str.charAt(i);
            }
        }
        System.out.println("Result = "+ result);
        sc.close();
    }
}
//Output
// Enter String = banana
// Enter the charater to find = a
// Enter the charater to replace = o
// Result = bonono