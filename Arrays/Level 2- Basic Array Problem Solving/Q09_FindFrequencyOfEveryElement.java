// 09 — Find Frequency of Every Element
// Take an array from the user and print every distinct element along with its frequency.

import java.util.Scanner;

public class Q09_FindFrequencyOfEveryElement {
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

        System.out.println("Enter array elements");
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        
        for(int i = 0; i<arr.length; i++){
            int countFrequency = 0;
            boolean printOnce = true;

            for(int j = 0; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    countFrequency++;
                }
            }

            for(int k = 0; k<i; k++){
                if(arr[i] == arr[k]){
                    printOnce = false;
                    break;
                }
            }

            if(printOnce){
                System.out.println(arr[i]+" = "+countFrequency);
            }
        }

        sc.close();
    }
}
// Output
// Enter size = 10
// Enter array elements
// 1 1 1 2 2 1 3 3 3 4  
// 1 = 4
// 2 = 2
// 3 = 3
// 4 = 1