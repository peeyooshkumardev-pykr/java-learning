//Count Positive and Negative Elements
//Take 10 integers as input and count how many are positive and how many are negative. Ignore `0`
import java.util.Scanner;

public class CountPositiveNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];

        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array Elements");
        for(int i=0; i<10; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        int pos=0;
        int neg=0;
        //positive
        System.out.print("Positives = ");
        for(int i=0; i<arr.length; i++){
            if(arr[i]>0){
                System.out.print(arr[i]+" ");
                pos++;
            }
        }
        System.out.println();
        System.out.println("Number of positives = "+pos);
        //negative
        System.out.print("Negatives = ");
        for(int i=0; i<arr.length; i++){
            if(arr[i]<0){
                System.out.print(arr[i]+" ");
                neg++;
            }
        }
        System.out.println();
        System.out.println("Number of negatives = "+neg);
        
        sc.close();
    }
}
//OUTPUT
// 33
// -77
// -77
// -45
// -44
// -90
// -77
// 33
// 545
// 55
// Array Elements
// 33 -77 -77 -45 -44 -90 -77 33 545 55 
// Positives = 33 33 545 55 
// Number of positives = 4
// Negatives = -77 -77 -45 -44 -90 -77 
// Number of negatives = 6