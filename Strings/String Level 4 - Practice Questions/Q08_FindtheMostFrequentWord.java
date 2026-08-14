// Q08 — Find the Most Frequent Word

// Given a sentence, find the word that appears the most number of times.

import java.util.Scanner;

public class Q08_FindtheMostFrequentWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter String = ");
        String str = sc.nextLine();

        String word1st = "";
        String word2nd = "";
        int start = 0;
        for(int i = 0; i<=str.length(); i++){

            if(i==str.length() || str.charAt(i)==' '){
                int count = 0;
                for(int j = i - 1; j>=start; j--){
                    
                }
                
            }
        }
    }
}
