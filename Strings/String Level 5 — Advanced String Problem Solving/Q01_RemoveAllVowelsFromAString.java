// Q01 — Remove All Vowels From a String

// Given a string, remove all vowels from the string.

import java.util.Scanner;

public class Q01_RemoveAllVowelsFromAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String = ");
        String str = sc.nextLine();

        String result = "";
        for(int i = 0; i<str.length(); i++){
            boolean isVowel = false;
                 if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
                isVowel = true;
            }
            if(!isVowel){
                char ch = str.charAt(i);
                result = result + ch;
            }
        }
        System.out.println("Resulted String = "+ result);
        sc.close();
    }
}
// //Output
// Enter String = hello java
// Resulted String = hll jv