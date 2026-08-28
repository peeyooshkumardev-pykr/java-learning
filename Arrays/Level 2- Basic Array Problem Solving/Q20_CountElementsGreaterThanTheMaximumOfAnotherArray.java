/*Q20 — Count Elements Greater Than the Maximum of Another Array
Take two arrays and count how many elements in the first array are greater than the maximum 
element of the second array.*/

import java.util.Scanner;

public class Q20_CountElementsGreaterThanTheMaximumOfAnotherArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Array 1 size = ");
        int n1 = sc.nextInt();
        if(n1<=0){
            System.out.println("Invalid input!");
            sc.close();
            return;
        }
        System.out.println("Array 1");

        int arr1[] = new int[n1];

        for(int i = 0; i<arr1.length; i++){
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter Array 2 size = ");
        int n2 = sc.nextInt();
        if(n2<=0){
            System.out.println("Invalid input!");
            sc.close();
            return;
        }
        System.out.println("Array 2");

        int arr2[] = new int[n2];

         for(int i = 0; i<arr2.length; i++){
            arr2[i] = sc.nextInt();
        }

        int maximum = Integer.MIN_VALUE;
        for(int j = 0; j<arr2.length; j++){
                if(arr2[j]>maximum){
                    maximum = arr2[j];
                }
            }
        int countGreaterThanMaximum = 0;

        for(int i = 0; i<arr1.length; i++){
            if(arr1[i]>maximum){
                countGreaterThanMaximum++;
            }
        }
        System.out.println("Number of elements in the first array that are greater than the maximum element of the second array = "+countGreaterThanMaximum);

        sc.close();
    }
}
// Output
// Enter Array 1 size = 8
// Array 1
// 2 3 5 6 3 3 4 3
// Enter Array 2 size = 5
// Array 2
// 1 2 2 2 2  
// Number of elements in the first array that are greater than the maximum element of the second array = 7