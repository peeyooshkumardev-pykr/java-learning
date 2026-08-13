// Q06 — Check Whether Two Strings Are Anagrams

// Given two strings, check whether they contain the same characters with the same frequencies, 
// regardless of their order.

import java.util.Scanner;

public class Q06_CheckWhetherTwoStringsAreAnagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st String = ");
        String str1 = sc.nextLine();

        System.out.print("Enter 2nd String = ");
        String str2 = sc.nextLine();

        if(str1.length()==str2.length()){
            boolean isTrue = true;
            for(int i = 0; i<str1.length(); i++){
                int count1 = 0;
                int count2 = 0;
                for(int j = 0; j<str1.length(); j++){
                    if(str1.charAt(j)==str1.charAt(i)){
                        count1++;
                    }
                }
                for(int j = 0; j<str2.length(); j++){
                        if(str2.charAt(j)==str1.charAt(i)){
                            count2++;
                        }
                }
                if(count1!=count2){
                    isTrue = false;
                 }
            }
            if(isTrue){
                System.out.println("Two Strings Are Anagrams");
            }else{
                System.out.println("Two Strings Are Not Anagrams");
            }
        }else{
             System.out.println("Two Strings Are Not Anagrams");
          }
          
        sc.close();
    }
}
// Output 1
// Enter 1st String = listen
// Enter 2nd String = silent
// Two Strings Are Anagrams

//Output 2
// Enter 1st String = hello
// Enter 2nd String = world
// Two Strings Are Not Anagrams