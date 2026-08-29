// Q05 — Find the First Non-Repeating Element
// Take an array and find the first element that occurs exactly once.

import java.util.Scanner;

public class Q05_FindTheFirstNonRepeatingElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Array size = ");
        int size = sc.nextInt();

        if(size<=0){
            System.out.println("Invalid Input!");
            sc.close();
            return;
        }

        int  arr[] = new int[size];

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int count = 0;

        for(int i = 0; i<arr.length; i++){

            for(int j = 0; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count == 1){
                System.out.println("First non-repeating element = "+arr[i]);
                break;
            }
            else{
                count = 0;
            }
        }

        if(count == 0){
            System.out.println("No non-repeating element");
        }

        sc.close();
    }
}
// Output
// Enter Array size = 7
// 11 22 33 22 11 44 44
// First non-repeating element = 33

// Enter Array size = 4
// 1 1 2 2
// No non-repeating element