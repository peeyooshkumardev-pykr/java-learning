// Q02 — Check Whether a String Contains Duplicate Characters

// Given a string, check whether any character appears more than once.

import java.util.Scanner;

public class Q02_CheckWhetherAStringContainsDuplicateCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String = ");
        String str = sc.nextLine();

        boolean hasNoDuplicates = true;

        for(int i = 0; i<str.length(); i++){

            int count = 0;

            for(int j = 0; j<str.length(); j++){
                if(str.charAt(j)==str.charAt(i)){
                    count++;
                }
            }
            if(count>1){
                hasNoDuplicates = false;
                break;
            }
        }
        if(hasNoDuplicates){
                System.out.print("String does not contain duplicate characters");
            }
            else{
                System.out.print("String contain duplicate characters");
            }

        sc.close();
    }
}
//Output
// Enter String = Money
// String does not contain duplicate characters

// Enter String = Monsoon
// String contain duplicate characters