// Q05 — Find the Least Frequent Character
// Given a string, find the character that appears the minimum number of times.

// Ignore spaces.

import java.util.Scanner;

public class Q05_FindTheLeastFrequentCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String = ");
        String str = sc.nextLine();

        int min = Integer.MAX_VALUE;
        char minCh = '\0';

        for(int i = 0; i<str.length(); i++){
            int count = 0;
            if(str.charAt(i)!=' '){
            for(int j = 0; j<str.length(); j++){
                if(str.charAt(i)==str.charAt(j)){
                count++;
                }
            }
            if(count<min){
                min = count;
                minCh = str.charAt(i);
            }
        }
    }
        System.out.println("Frequency = "+ min);
        System.out.println("Minimum Frequent Character = "+ minCh);
        sc.close();
    }
}
//Output
// Enter String = Keep calm and code Java.
// Frequency = 1
// Minimum Frequent Character = K