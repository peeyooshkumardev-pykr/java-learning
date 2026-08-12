// Q10 — Find the Number of Unique Characters
// Given a string, find and print the characters that appear exactly once.

import java.util.Scanner;

public class Q10_FindUniqueCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String = ");
        String str = sc.nextLine();

        for(int i = 0; i<str.length(); i++){
            int count = 0;
            for(int j = 0; j<str.length(); j++){
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            if(count==1){
                System.out.print(str.charAt(i)+" ");
            }
        }
        sc.close();
    }
}
//Output
// Enter String = Programming
// P o a i n 