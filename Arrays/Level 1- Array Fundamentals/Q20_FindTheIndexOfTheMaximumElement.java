// Q20 — Find the Index of the Maximum Element
// Take an array from the user and find the index of its Maximum element.

import java.util.Scanner;

public class Q20_FindTheIndexOfTheMaximumElement{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter N = ");
        int N = sc.nextInt();

        int arr[] = new int[N];

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int maximumElement = Integer.MIN_VALUE;
        int index = 0;

        for(int i = 0; i<arr.length; i++){
            if(maximumElement<arr[i]){
                maximumElement = arr[i];
                index = i;
            }
        }
        System.out.println("Maximum Number in array = "+maximumElement);
        System.out.println("Index of Maximum Number = "+index);

        sc.close();
    }
}
// Output
// Enter N = 6
// 45 32 11 90 -34 -12 
// Maximum Number in array = 90
// Index of Maximum Number = 3