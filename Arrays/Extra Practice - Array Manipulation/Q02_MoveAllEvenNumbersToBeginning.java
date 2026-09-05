// Q02 — Move All Even Numbers to Beginning
// Take an array and move all even numbers to the beginning and odd numbers to the end.

import java.util.Scanner;

public class Q02_MoveAllEvenNumbersToBeginning {
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
            if(arr[i] % 2 == 0){
                arrResult[position] = arr[i];
                position++;
            }
        }

        for(int i = 0; i<arr.length; i++){
            if(arr[i] % 2 != 0){
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
// Enter Size = 5 
// Enter Array Elements:
// 12 34 55 66 21
// Output Array:
// 12 34 66 55 21 