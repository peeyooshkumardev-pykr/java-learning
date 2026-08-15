// Q09 — Find the First Repeating Character

// Given a String, find the first character that appears more than once.

import java.util.Scanner;

public class Q09_FindtheFirstRepeatingCharacter {
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
            if(count>1){
                System.out.println("First Repeating Character = "+str.charAt(i));
                break;
            }
        }
        sc.close();
    }
}
// Output
// Enter String = Programming
// First Repeating Character = r
