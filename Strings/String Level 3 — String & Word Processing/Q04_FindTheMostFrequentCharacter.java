// Q04 — Find the Most Frequent Character
// Given a string, find the character that appears the maximum number of times.

// Ignore spaces.

import java.util.Scanner;

public class Q04_FindTheMostFrequentCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String = ");
        String str = sc.nextLine();

        int max = 0;
        char maxCh = '\0';

        for(int i = 0; i<str.length(); i++){
            int count = 0;
            if(str.charAt(i)!=' '){
            for(int j = 0; j<str.length(); j++){
                if(str.charAt(i)==str.charAt(j)){
                count++;
                }
            }
            if(count>max){
                max = count;
                maxCh = str.charAt(i);
            }
        }
    }
        System.out.println("Frequency = "+ max);
        System.out.println("Most Frequent Character = "+ maxCh);
        sc.close();
    }
}
//Output
// Enter String = Write once, run anywhere.
// Maximum number of times = 4
// Character that appears the maximum number of times = e