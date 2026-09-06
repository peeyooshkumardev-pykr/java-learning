// Q11 — Check Two Arrays for Same Elements
// Check whether two arrays contain the same elements regardless of their order.

import java.util.Scanner;

public class Q11_CheckTwoArraysForSameElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st Array Size = ");
        int size1 = sc.nextInt();

        if(size1 <= 0){
            System.out.println("Wrong Input!");
            sc.close();
            return;
        }

        int arr1[] = new int[size1]; 

        System.out.print("Enter 1st Array Elements:");

        for(int i = 0; i<arr1.length; i++){
            arr1[i] = sc.nextInt();
        }

        System.out.println();

        System.out.print("Enter 2nd Array Size = ");
        int size2= sc.nextInt();

        if(size2 <= 0){
            System.out.println("Wrong Input!");
            sc.close();
            return;
        }

        int arr2[] = new int[size2]; 

        System.out.print("Enter 2nd Array Elements:");

        for(int i = 0; i<arr2.length; i++){
            arr2[i] = sc.nextInt();
        }

        boolean countSame = true;

        if(size1 == size2){

            for(int i = 0; i<arr1.length; i++){

                int count1 = 0;
                int count2 = 0;
    
                for(int j = 0; j<arr1.length; j++){
                    if(arr1[i] == arr1[j]){
                        count1++;
                    }
                }
    
                for(int j = 0; j<arr2.length; j++){
                    if(arr1[i] == arr2[j]){
                        count2++;
                    }
                }  
    
                if(count1 != count2){
                    countSame = false;
                    break;
                }
            }

            if(countSame){
                System.out.println("Two arrays contain the same elements regardless of their order.");
            }else{
                System.out.println("Not Same!");
            }

        }
        else{
            System.out.println("Not Same Size!");
        }

        sc.close();
    }
}
// Output 1
// Enter 1st Array Size = 5
// Enter 1st Array Elements:10 20 30 10 30

// Enter 2nd Array Size = 5
// Enter 2nd Array Elements:10 20 10 30 30
// Two arrays contain the same elements regardless of their order.

// Output 2
// Enter 1st Array Size = 4
// Enter 1st Array Elements:1 2 3 4

// Enter 2nd Array Size = 4
// Enter 2nd Array Elements:1 2 3 5
// Not Same!

// Output 3
// Enter 1st Array Size = 3
// Enter 1st Array Elements:1 2 3

// Enter 2nd Array Size = 2
// Enter 2nd Array Elements:1 2
// Not Same Size!