// Q07 — Count Frequency of Every Character
// Given a string, find and print the frequency of every character.

// Each character should be printed only once.

import java.util.Scanner;

public class Q07_CountFrequencyOfEveryCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String = ");
        String str = sc.nextLine();

        for(int i = 0; i<str.length(); i++){
            int count = 0;
            boolean isDublicate = true;
            for(int j = 0; j<str.length(); j++){
                if(str.charAt(j)==str.charAt(i)){
                    count++;
                }
            }
            for(int j = 0; j<i; j++){
                if(str.charAt(j)==str.charAt(i)){
                    isDublicate = false;
                }
            }
            if(isDublicate){
                System.out.println(str.charAt(i)+" = "+count);
            }
        }
        sc.close();
    }
}
//Output
// Enter String = successfull  
// s = 3
// u = 2
// c = 2
// e = 1
// f = 1
// l = 2