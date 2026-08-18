// Q10 — Compress Consecutive Characters

// Given a string, replace consecutive repeated characters with the character followed by its count.

import java.util.Scanner;

public class Q10_CompressConsecutiveCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter String = ");
        String str = sc.nextLine();
        
        if(str.isEmpty()){
            System.out.print("Empty String!");
            sc.close();
            return;
        }
        
        String resulString = "";
        
        int count = 1;
        for(int i = 0; i<str.length()-1; i++){
            if(str.charAt(i)==str.charAt(i+1)){
                count++;
            }else{
                resulString = resulString + str.charAt(i) + count;
                count = 1;
            }
        }
        resulString = resulString + str.charAt(str.length()-1) + count;
        System.out.println("Result String = "+ resulString);
        sc.close();
    }
}
//Output
// Enter String = hhheeeellllloo
// Result String = h3e4l5o2