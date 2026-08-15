// Q05 — Find the Second Most Frequent Character

// Given a string, find the character with the second-highest frequency.

import java.util.Scanner;

public class Q05_FindtheSecondMostFrequentCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter String = ");
        String str = sc.nextLine();

        int maxFrequency = 0;
        int max2ndFrequency = 0;

        for(int i = 0; i<str.length(); i++){
            int countFrequency = 0;

            for(int j = 0; j<str.length(); j++){
                if(str.charAt(j)==str.charAt(i)){
                    countFrequency++;
                }
            }
            if(countFrequency>maxFrequency){
                maxFrequency = countFrequency;
            }
        }

        char highest2ndcharacter = '\0';
        for(int x = 0; x<str.length(); x++){
            int countFrequency = 0;

            for(int j = 0; j<str.length(); j++){
                if(str.charAt(j)==str.charAt(x)){
                    countFrequency++;
                }
            }
            if(countFrequency<maxFrequency && countFrequency>max2ndFrequency){
                max2ndFrequency = countFrequency;
                highest2ndcharacter = str.charAt(x);            }
        }
        System.out.println("Second Most Frequent Character = " + highest2ndcharacter);

        sc.close();
    }
}
//Output
// Enter String = mississippi
// Second Most Frequent Character = p