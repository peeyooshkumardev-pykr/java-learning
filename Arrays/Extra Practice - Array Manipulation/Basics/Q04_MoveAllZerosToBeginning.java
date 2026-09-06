// Q04 — Move All Zeros to Beginning
// Take an array and move all zeros to the beginning.

import java.util.Scanner;

public class Q04_MoveAllZerosToBeginning {
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

        int arrResult[] = new int[size];

        int position = 0;

        for(int i = 0; i<arr.length; i++){
            if(arr[i] == 0){
                arrResult[position] = arr[i];
                position++;
            }
        }

        for(int i = 0; i<arr.length; i++){
            if(arr[i] != 0){
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
// Enter Size = 6
// Enter Array Elements:
// 1 2 3 0 0 4
// Output Array:
// 0 0 1 2 3 4 