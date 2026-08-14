// Q06 — Find the Longest Word in a Sentence

// Given a sentence, find and print the longest word.

//hello java pk
import java.util.Scanner;

public class Q06_FindTheLongestWordInASentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String = ");
        String str = sc.nextLine();

        int start = 0;
        int longest = 0;
        String longestWord = "";
        for(int i = 0; i<=str.length(); i++){

            if(i==str.length() || str.charAt(i)==' '){
                int count = 0;

                for(int j = i - 1; j>=start; j--){
                    count++;
                }
                if(count>longest){
                    longest = count;
                    longestWord = str.substring(start,i);
                }
                start = i + 1;
            }
        }
        System.out.println("Longest Word = " + longestWord);

        sc.close();
    }
}
//Output
// Enter String = java program
// Longest Word = program