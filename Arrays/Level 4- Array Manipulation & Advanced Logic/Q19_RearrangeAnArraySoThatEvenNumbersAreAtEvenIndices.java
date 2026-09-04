// Q19 — Rearrange an Array So That Even Numbers Are at Even Indices
// Take an array containing an equal number of even and odd elements. Rearrange it so that even elements 
// occupy even indices and odd elements occupy odd indices.

import java.util.Scanner;

public class Q19_RearrangeAnArraySoThatEvenNumbersAreAtEvenIndices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Array Size = ");
        int size = sc.nextInt();

        if(size<=0){
            System.out.println("Invalid Input!");
            sc.close();
            return;
        }

        int arr[] = new int[size];

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int countEven = 0;
        int countOdd = 0;

        for(int i = 0; i<arr.length; i++){
            if(arr[i]%2==0){
                countEven++;
            }else{
                countOdd++;
            }
        }

        if(countEven != countOdd){
            System.out.println("Number of even and odd elements are not equal.");
            sc.close();;return;
        }

        for(int i = 0; i < arr.length; i += 2){

            if(arr[i] % 2 != 0){
        
                for(int j = i + 1; j < arr.length; j += 2){
        
                    if(arr[j] % 2 == 0){
        
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
        
                        break;
                    }
                }
            }
        }

        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

        sc.close();
    }
}
// Output 
// Enter Array Size = 6
// 3 2 4 1 6 5
// 2 3 4 1 6 5 