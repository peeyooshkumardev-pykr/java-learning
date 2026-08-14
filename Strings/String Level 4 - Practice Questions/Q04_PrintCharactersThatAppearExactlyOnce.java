// Q04 — Print Characters That Appear Exactly Once

// Given a string, print every character whose frequency is exactly 1.

import java.util.Scanner;

public class Q04_PrintCharactersThatAppearExactlyOnce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter String = ");
        String str = sc.nextLine();

        System.out.print("Resulted String = ");
        for(int i = 0; i<str.length(); i++){
            int count = 0;
            for(int j = 0; j<str.length(); j++){
                if(str.charAt(j)==str.charAt(i)){
                    count++;
                }
            }
            if(count==1){
                System.out.print(str.charAt(i)+" ");
            }
        }
        sc.close();
    }    
}
// Output
// Enter String = Umbrella
// Resulted String = U m b r e a 