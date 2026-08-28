// Q02 — Find the Repeated Element
// Take an array containing numbers where one element is repeated. Find the repeated element.

import java.util.Scanner;

public class Q02_FindTheRepeatedElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter array size = ");
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

        boolean isRepeated = true;
        int repeatedElement = 0;

        for(int i = 0; i<arr.length; i++){
            int count = 0;

            for(int j = 0; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count>1){
                isRepeated = false;
                repeatedElement = arr[i];
                break; 
            }
        }
        if(!isRepeated){
            System.out.println("Repeated element = "+repeatedElement);
        }

        sc.close();
    }
}
// Output
// Enter array size = 5
// 10 20 30 10 40
// Repeated element = 10
