// Q08 — Find the First Non-Repeating Character
// Given a string, find the first character that appears exactly once.

import java.util.Scanner;

public class Q08_FindtheFirstNonRepeatingCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String = ");
        String str = sc.nextLine();

        for(int i = 0; i<str.length(); i++){
            int count = 0;
            for(int j = 0; j<str.length(); j++){
                if(str.charAt(j)==str.charAt(i)){
                    count++;
                }
            }
            if(count==1){
                System.out.println("First Non-Repeating Character = "+str.charAt(i));
                break;
            }
        }
        sc.close();
    }
}
//Output
// Enter String = swiss
// First Non-Repeating Character = w
