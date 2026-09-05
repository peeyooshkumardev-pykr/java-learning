// Q05 — Remove All Zeros
// Take an array and remove all zero elements.

import java.util.Scanner;

public class Q05_RemoveAllZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size = ");
        int size = sc.nextInt();

        if(size <= 0){
            System.out.println("Wrong Input!");
            sc.close();
            return;
        }

        int arr[] = new int[size]; 

        System.out.println("Enter Array Elements:");

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int countNonZeros = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]!=0){
                countNonZeros++;
            }
        }

        int arrResult[] = new int[countNonZeros];

        int position = 0;

        for(int i = 0; i<arr.length; i++){
            if(arr[i]!=0){
                arrResult[position] = arr[i];
                position++;
            }
        }

        System.out.println("Output Array:");

        for(int i = 0; i<arrResult.length; i++){
            System.out.print(arrResult[i]+" ");
        }

        sc.close();
    }
}
// Output 
// Enter Size = 7
// Enter Array Elements:
// 1 0 3 0 5 0 2
// Output Array:
// 1 3 5 2 