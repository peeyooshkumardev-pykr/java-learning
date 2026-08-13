// Q03 — Remove Duplicate Characters
// Given a string, remove duplicate characters and keep only the first occurrence of
//  each character.

import java.util.Scanner;

public class Q03_RemoveDuplicateCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String = ");
        String str = sc.nextLine();

        System.out.print("Resulted String = ");
        for(int i = 0; i<str.length(); i++){
            boolean isDublicate = true;
            for(int j = 0; j<i; j++){
                if(str.charAt(i)==str.charAt(j)){
                   isDublicate = false;
                }
            }
            if(isDublicate){
                System.out.print(str.charAt(i));
            }
        }
        sc.close();
    }
}
//Output
// Enter String = Management
// Resulted String = Mangemt