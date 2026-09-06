// Q15 — Remove a Specific Element
// Take an array and an element, then remove all occurrences of that element.

import java.util.Scanner;

public class Q15_RemoveASpecificElement {
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

        System.out.print("Enter the Element = ");
        int element = sc.nextInt();

        boolean notInArray = true; 

        for(int i = 0; i<arr.length; i++){
            if(arr[i] == element){
                notInArray = false;
                break;
            }
        }

        if(notInArray){
            System.out.println("No such element in Array!");
            sc.close();
            return;
        }

        int countOccurrence = 0;

        for(int i = 0; i<arr.length; i++){
            if(arr[i] != element){
                countOccurrence++;
            }
        }

        int arrOutput[] = new int[countOccurrence];
        
        int position = 0;

        for(int i = 0; i<arr.length; i++){
            if(arr[i] != element){
                arrOutput[position] = arr[i];
                position++;
            }
        }

        System.out.println("Output Array:");

        for(int i = 0; i<arrOutput.length; i++){
            System.out.print(arrOutput[i]+" ");
        }

        sc.close();
    }
}
// Output 
// Enter Size = 7
// Enter Array Elements:
// 1 2 3 2 4 2 5
// Enter the Element = 2
// Output Array:
// 1 3 4 5 