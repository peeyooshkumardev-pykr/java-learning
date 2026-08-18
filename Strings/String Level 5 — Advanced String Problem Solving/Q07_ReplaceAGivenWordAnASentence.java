// Q07 — Replace a Given Word in a Sentence

// Given a sentence, a word to find, and a replacement word, 
// replace every occurrence of the given word.

import java.util.Scanner;

public class Q07_ReplaceAGivenWordAnASentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Sentence = ");
        String sentenceString = sc.nextLine();

        System.out.print("Enter the word to find = ");
        String wordString = sc.nextLine();

        System.out.print("Enter the replacement word = ");
        String replaceString = sc.nextLine();

        int start = 0;
        String result = "";

        for(int i = 0; i<=sentenceString.length(); i++){
            
            if(i==sentenceString.length() || sentenceString.charAt(i)==' '){

                String word1 = sentenceString.substring(start,i);

                if(word1.equalsIgnoreCase(wordString)){
                        result = result + replaceString;
                    }else{
                        result = result + word1;
                    }

                if(i < sentenceString.length()){
                    result = result + " ";
                }
                start = i + 1;
            }
        }
        System.out.println("Result = "+ result);
        sc.close();
    }
}
//Output
// Enter Sentence = Java is easy and Java is powerful
// Enter the word to find = java
// Enter the replacement word = python
// Result = python is easy and python is powerful