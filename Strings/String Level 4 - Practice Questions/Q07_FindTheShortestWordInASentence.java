// Q07 — Find the Shortest Word in a Sentence

// Given a sentence, find and print the shortest word.

import java.util.Scanner;

public class Q07_FindTheShortestWordInASentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter String = ");
        String str = sc.nextLine();
        
        int start = 0;
        String shortestWord = "";
        int shortest = Integer.MAX_VALUE;

        for(int i = 0; i<=str.length(); i++){
            int count = 0;

            if(i==str.length() || str.charAt(i)==' '){

                for(int j = i - 1; j>=start; j--){
                    count++;
                }

                if(count<shortest){
                    shortest = count;
                    shortestWord = str.substring(start,i);
                }

                start = i + 1;
            }
        }
        System.out.println("Shortest Word = "+shortestWord);

        sc.close();
    }
}
//Output
// Enter String = Coding is fun
// Shortest Word = is