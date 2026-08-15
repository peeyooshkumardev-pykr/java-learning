// Q08 — Find the Most Frequent Word

// Given a sentence, find the word that appears the most number of times.

import java.util.Scanner;

public class Q08_FindtheMostFrequentWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter String = ");
        String str = sc.nextLine();

        int start1 = 0;
        int maxfrequency =0;
        String mostfrequentWord = "";
        
        for(int i = 0; i<=str.length(); i++){
            String word1st = ""; 

            if(i==str.length() || str.charAt(i)==' '){
                word1st = str.substring(start1, i);

            int start2 = 0;
            int frequency = 0; 

            for (int j = 0; j<=str.length(); j++ ){
                String word2nd = "";
                if(j==str.length() || str.charAt(j)==' '){
                        word2nd = str.substring(start2, j);

                    if(word1st.equals(word2nd)){
                        frequency++;
                    }
                    start2 = j + 1;
                }
            }
                if(frequency>maxfrequency){
                    maxfrequency = frequency;
                    mostfrequentWord = word1st;
                }
            start1 = i + 1;
        }
    }
        System.out.println("Most Frequent Word = "+mostfrequentWord);
        sc.close();
    }
}
//Output
// Enter String = apple  banana banana  orange banana apple
// Most Frequent Word = banana