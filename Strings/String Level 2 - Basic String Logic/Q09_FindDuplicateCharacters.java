// Q09 — Find Duplicate Characters

// Given a string, find and print the characters that appear more than once.

// Each duplicate character should be printed only once.

import java.util.Scanner;

public class Q09_FindDuplicateCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String = ");
        String str = sc.nextLine();

        for(int i = 0; i<str.length(); i++){
            int count = 0;
            boolean isAlreadyPrinted = false;
            for(int j = 0; j<str.length(); j++){
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            for(int j = 0; j<i; j++){
                if(str.charAt(i)==str.charAt(j)){
                    isAlreadyPrinted = true;
                    break;
                }
            }
            if(count>1 && !isAlreadyPrinted){
                System.out.print(str.charAt(i)+" ");
            }
        }
        sc.close();
    }
}
//Output
// Enter String = Java programming
// a r g m 