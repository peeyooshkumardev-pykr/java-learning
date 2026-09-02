// Q14 — Rearrange Positive and Negative Elements Alternately
// Rearrange an array so that positive and negative elements appear alternately whenever possible.

import java.util.Scanner;

public class Q14_RearrangePositiveAndNegativeElementsAlternately {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size = ");

        int size = sc.nextInt();

        if(size <= 0){
            System.out.println("Invalid Input!");
            sc.close();
            return;
        }

        int arr[] = new int[size];
        int resultArr[] = new int[size];

        System.out.println("Enter Array Elements:");

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int positiveCount = 0;
        int negativeCount = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>0){
                positiveCount++;
            }else if(arr[i]<0){
                negativeCount++;
            }
        }

        int arrPositive[] = new int[positiveCount];
        int arrNegative[] = new int[negativeCount];

        int positivePosition = 0;
        int negativePosition = 0;

        for(int i = 0; i < arr.length; i++){

            if(arr[i]>0){
                arrPositive[positivePosition] = arr[i];
                positivePosition++; 
            }
            else if(arr[i]<0){
                arrNegative[negativePosition] = arr[i];
                negativePosition++;
            }
        }
        
        positivePosition = 0;
        negativePosition = 0;
        int position = 0;

        while(positivePosition < arrPositive.length && negativePosition < arrNegative.length){
            if(position%2==0){
                resultArr[position] = arrPositive[positivePosition];
                positivePosition++;
            }else{
                resultArr[position] = arrNegative[negativePosition];
                negativePosition++;
            }
            position++;
        }

        while(positivePosition < arrPositive.length){
            resultArr[position] = arrPositive[positivePosition];
            positivePosition++;
            position++;
        }

        while(negativePosition < arrNegative.length){
            resultArr[position] = arrNegative[negativePosition];
            negativePosition++;
            position++;
        }

        for(int i = position; i<resultArr.length; i++){
            resultArr[i] = 0;
        }

        System.out.println("Output Array:");
        for(int i = 0; i<resultArr.length; i++){
            System.out.print(resultArr[i]+" ");
        }
        sc.close();
    }
}
// Output 1
// Enter array size = 8
// Enter Array Elements:
// 34 56 76 -78 -22 12 -14 -90   
// Output Array:
// 34 -78 56 -22 76 -14 12 -90 

// Output 2
// Enter array size = 5
// Enter Array Elements:
// 1 -45 0 0 21
// Output Array:
// 1 -45 21 0 0 