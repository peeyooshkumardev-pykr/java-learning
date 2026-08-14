// Q03 — Print Characters That Appear More Than Once
// Given a string, print every character that appears more than once.

// Each character should be printed only once.

import java.util.Scanner;

public class Q03_PrintCharactersThatAppearMoreThanOnce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter String = ");
        String str = sc.nextLine();
       
        for(int i = 0; i<str.length(); i++){

            int count = 0;
            boolean isPrintedMoreThanOnce = false;

            for(int j = 0; j<str.length(); j++){
                if(str.charAt(j)==str.charAt(i)){
                    count++;
                }
            }

            if(count>1){
                for(int j = 0; j<i; j++){
                if(str.charAt(j)==str.charAt(i)){
                isPrintedMoreThanOnce = true;
            }
        }
            if(!isPrintedMoreThanOnce){
                System.out.print(str.charAt(i));
            }
            }
        }
        sc.close();
    }
}
// Output
// Enter String = character
// car