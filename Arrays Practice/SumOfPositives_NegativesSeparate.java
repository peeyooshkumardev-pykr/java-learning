// Find Sum of Positive and Negative Elements Separately
// Take 10 integers and calculate:

// Sum of positive numbers
// Sum of negative numbers

import java.util.Scanner;
public class SumOfPositives_NegativesSeparate{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println();
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int sumpositive = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>0){
                System.out.print(arr[i]+" ");
                sumpositive = sumpositive + arr[i];
            }
        }
        System.out.println();
        System.out.println("Sum of Positives = "+sumpositive);
        System.out.println();

        int sumnegative = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]<0){
                System.out.print(arr[i]+" ");
                sumnegative = sumnegative + arr[i];
            }
        }
        System.out.println();
        System.out.println("Sum of Negatives = "+sumnegative);

        sc.close();
    }
}
// //OUTPUT
// 33
// 55
// 67
// -90
// 6
// 78
// -22
// -44
// -100
// -55

// 33 55 67 -90 6 78 -22 -44 -100 -55 
// 33 55 67 6 78 
// Sum of Positives = 239

// -90 -22 -44 -100 -55 
// Sum of Negatives = -311