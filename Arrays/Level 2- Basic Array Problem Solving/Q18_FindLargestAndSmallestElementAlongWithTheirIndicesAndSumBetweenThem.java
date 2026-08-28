// Q18 — Find Largest and Smallest Element Along With Their Indices and Sum Between Them

// Take an array and find the largest and smallest elements along with their respective indices. 
// Then calculate the sum of all elements strictly between their indices.

import java.util.Scanner;

public class Q18_FindLargestAndSmallestElementAlongWithTheirIndicesAndSumBetweenThem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size = ");
        int n = sc.nextInt();

        if(n<=0){
            System.out.println("Invalid input!");
            sc.close();
            return;
        }

        int arr[] = new int[n];

        System.out.println("Enter Array Elements");
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int largestElement = Integer.MIN_VALUE;
        int indexLargest = -1;

        for(int i = 0; i<arr.length; i++){

            if(arr[i]>largestElement){
                largestElement = arr[i];
                indexLargest = i;
            }
        }
        System.out.println();
        System.out.println("Largest Element is "+largestElement+" At index "+indexLargest);

        int smallestElement = Integer.MAX_VALUE;
        int indexSmallest = -1;

        for(int i = 0; i<arr.length; i++){

            if(arr[i]<smallestElement){
                smallestElement = arr[i];
                indexSmallest = i;
            }
        }

        System.out.println("Smallest Element is "+smallestElement+" At index "+indexSmallest);

        int sum = 0;
        if(indexLargest>indexSmallest){
            for(int i = indexSmallest+1; i<indexLargest; i++){
                sum = sum + arr[i];
            }
        }else{
            for(int i = indexLargest+1; i<indexSmallest; i++){
                sum = sum + arr[i];
            }
        }

        System.out.println("Sum of all elements strictly between maximum index and smallest index = "+sum);
        sc.close();
    }
}
//Output
// Enter size = 10
// Enter Array Elements
// 100 90 80 70 60 50 40 30 20 10

// Largest Element is 100 At index 0
// Smallest Element is 10 At index 9
// Sum of all elements strictly between maximum index and smallest index = 440

// Enter size = 7
// Enter Array Elements
// 21 32 56 12 -11 -24 17

// Largest Element is 56 At index 2
// Smallest Element is -24 At index 5
// Sum of all elements strictly between maximum index and smallest index = 1

// Enter size = 3 
// Enter Array Elements
// 1 2 3

// Largest Element is 3 At index 2
// Smallest Element is 1 At index 0
// Sum of all elements strictly between maximum index and smallest index = 2