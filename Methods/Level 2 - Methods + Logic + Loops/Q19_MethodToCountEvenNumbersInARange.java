/*Q19 — Method to Count Even Numbers in a Range
Create a method named countEvenNumbers() that accepts a range from start to end and returns the 
number of even numbers present in that range.*/

import java.util.Scanner;

public class Q19_MethodToCountEvenNumbersInARange {
    
    static int countEvenNumbers(int start,int end){
        int countEven = 0;
        if(start>end){
            int temp = start;
            start = end;
            end = temp;
        }
        for(int i = start; i<=end; i++){
            if(i % 2 == 0){
                countEven++;
            }
        }
        return countEven;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the 1st integer = ");
        int start= sc.nextInt();

        System.out.print("Enter the 2nd integer = ");
        int end = sc.nextInt();

        System.out.println("Number of evens in between "+start+" & "+end+" = "+countEvenNumbers(start, end));

        sc.close();
    }
}
// OUTPUT
// Enter the 1st integer = 20
// Enter the 2nd integer = 1
// Number of evens in between 20 & 1 = 10