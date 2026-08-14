// Q01 — Remove All Duplicate Characters
// Given a string, remove duplicate characters while keeping the first occurrence.

import java.util.Scanner;

public class Q01_RemoveAllDuplicateCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String = ");
        String str = sc.nextLine();

        System.out.println("Resulted String");
        for(int i = 0; i<str.length(); i++){

            boolean isDuplicate = false;

            for(int j = 0; j<i; j++){
                if(str.charAt(j)==str.charAt(i)){
                    isDuplicate = true;
                }
            }

            if(!isDuplicate){
                System.out.print(str.charAt(i));
            }
        }

        sc.close();
    }
}
//Output
// Enter String = Banana
// Resulted String
// Ban