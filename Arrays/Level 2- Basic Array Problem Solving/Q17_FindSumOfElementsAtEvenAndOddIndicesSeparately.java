// Q17 — Find Sum of Elements at Even and Odd Indices Separately
// Take an array and calculate the sum of elements present at even indices and odd indices separately.

import java.util.Scanner;

public class Q17_FindSumOfElementsAtEvenAndOddIndicesSeparately {
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

        int sumOdd = 0;
        int sumEven = 0;
        for(int i = 0; i<arr.length; i++){
            if(i % 2 == 0){
                sumEven = sumEven + arr[i];
            }else{
                sumOdd = sumOdd + arr[i];
            }
        }
        System.out.println("Sum at even indices = "+sumEven);
        System.out.println("Sum at odd indices = "+sumOdd);

        sc.close();
    }
}
// Output
// Enter size = 10
// Enter Array Elements
// 10 20 30 40 50 60 70 80 90 100
// Sum at even indices = 250
// Sum at odd indices = 300

// Enter size = 1
// Enter Array Elements
// 22
// Sum at even indices = 22
// Sum at odd indices = 0