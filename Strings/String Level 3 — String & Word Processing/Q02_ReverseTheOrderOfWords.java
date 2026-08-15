// Q02 — Reverse the Order of Words
// Given a sentence, reverse the order of the words without reversing the 
// characters inside each word.

import java.util.Scanner;

public class Q02_ReverseTheOrderOfWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String = ");
        String str = sc.nextLine();

        System.out.print("Resulted String = ");

        int end = str.length(); 
        for(int i = str.length()-1; i>=0; i--){
            
            if(str.charAt(i)==' '){
                for(int j = i + 1; j<end; j++){
                    System.out.print(str.charAt(j));
                }
            System.out.print(" ");
            end = i;
            }
            else if(i==0){
                for(int j = 0; j<end; j++){
                    System.out.print(str.charAt(j));
                }
            }
        }
        sc.close();
    }
}
//Output
// Enter String = String Problems
// Resulted String = Problems String