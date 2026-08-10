// Find the Element That Appears Once

// You are given an array where every element appears exactly twice except one element, 
// which appears only once.

import java.util.Scanner;

public class FindtheElementThatAppearsOnce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size = ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array where every element appears exactly twice except one element");

        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        int onceElement = 0;
        int countOnce = 0;
        boolean wrongInput = false;
        for(int i = 0; i<arr.length; i++){
            int count = 0;
            for(int j = 0; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>2 ){
                wrongInput = true;
            }
            if(count==1){
                onceElement = arr[i];
                countOnce++;
            }
        }
        if(wrongInput || countOnce!=1){
            System.out.println("Invalid Input");
        }
        else{
            System.out.println("Element that appear once = "+onceElement);
        }
        sc.close();
    }
}
//OUTPUT
// Enter size = 7
// 1
// 1
// 2
// 3
// 3
// 4
// 4
// Array where every element appears exactly twice except one element
// 1 1 2 3 3 4 4 
// Element that appear once = 2

// Enter size = 7
// Enter size = 7
// 1
// 2
// 2
// 2
// 3
// 3
// 4
// Array where every element appears exactly twice except one element
// 1 2 2 2 3 3 4 
// Invalid Input
