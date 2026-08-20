// Q02 — Print a Hollow Rectangle
// Take the number of rows and columns from the user and print a hollow rectangle.

import java.util.Scanner;

public class Q02_PrintAHollowRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the rows = ");
        int row = sc.nextInt();

        System.out.print("Enter the column = ");
        int column = sc.nextInt();

        for(int i = 1; i<=row; i++){
            for(int j = 1; j<=column; j++){

                if(i == 1 || i == row || j == 1 || j == column){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
// OUTPUT
// Enter the rows = 5
// Enter the column = 7
// *******
// *     *
// *     *
// *     *
// *******