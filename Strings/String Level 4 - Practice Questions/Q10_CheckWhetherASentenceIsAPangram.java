// Q10 — Check Whether a Sentence Is a Pangram

// Given a sentence, check whether it contains every letter of the English alphabet at least once.

import java.util.Scanner;

public class Q10_CheckWhetherASentenceIsAPangram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String = ");
        String str = sc.nextLine().toLowerCase();

        boolean containEveryCharacter = true;
        for(int i = 'a'; i<='z'; i++){
            boolean found = false;
            for(int j = 0; j<str.length(); j++){
                if(str.charAt(j)==i){
                    found = true;
                }
            }
            if(!found){
                containEveryCharacter = false;
                break;
            }
        }
        if(containEveryCharacter){
            System.out.println("Sentence Is a Pangram");
        }else{
            System.out.println("Sentence Is Not a Pangram");
        }

        sc.close();
    }
}
//Output
// Enter String = THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG
// Sentence Is a Pangram

// Enter String = Hello java
// Sentence Is Not a Pangram