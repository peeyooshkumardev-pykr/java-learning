// Q05 — Print Words That Start and End With the Same Character

// Given a sentence, print every word whose first and last characters are the same.

import java.util.Scanner;

public class Q05_PrintWordsThatStartAndEndWithTheSameCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter String = ");
        String str = sc.nextLine();

        int start = 0;
        for(int i = 0; i<=str.length(); i++){

            if(i==str.length() || str.charAt(i)==' '){
                String word = str.substring(start,i);
                
                if(str.charAt(start)==str.charAt(i-1)){
                    System.out.print(word+" ");
                }
                start = i + 1;
            }
        }
        sc.close();
    }
}
//Output
//Enter String = level java madam code radar
//level madam radar 