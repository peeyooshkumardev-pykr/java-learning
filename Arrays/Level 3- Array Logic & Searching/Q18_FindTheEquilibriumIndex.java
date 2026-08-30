// Q18 — Find the Equilibrium Index
// Find an index where the sum of elements on the left is equal to the sum of elements on the right.

import java.util.Scanner;

public class Q18_FindTheEquilibriumIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Array size = ");
        int size = sc.nextInt();

        if(size<=0){
            System.out.println("Invalid Input!");
            sc.close();
            return;
        }

        int  arr[] = new int[size];

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }


        boolean noEquilibriumIndex = true;

        for(int i = 0; i<arr.length; i++){
            int sumLeft = 0;
            int sumRight = 0;

            for(int j = 0; j<arr.length; j++){
                if(j<i){
                    sumLeft = sumLeft + arr[j];
                }
            }

            for(int j = 0; j<arr.length; j++){
                if(j>i){
                    sumRight = sumRight + arr[j];
                }
            }

            if(sumLeft == sumRight){
                System.out.println("Equilibrium index = "+i);
                noEquilibriumIndex = false;
            }
        }
        if(noEquilibriumIndex){
            System.out.println("No Equilibrium index!");
        }
        sc.close();
    }
}
// Output
// Enter Array size = 7
// 1 2 3 5 0 1 10
// Equilibrium index = 4

// Enter Array size = 3
// 1 2 3
// No Equilibrium index!