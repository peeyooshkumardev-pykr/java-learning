// Count Elements Greater Than the Average
// Take 10 integers, calculate their average, and count how many 
// elements are greater than the average.
import java.util.Scanner;
public class CalculateAverageAndElementsBiggerThanAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array Elements");
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        double sum = 0;
        double avg;
        for(int i=0; i<arr.length; i++){
            sum = sum + arr[i];
        }
        avg = sum/arr.length;
        System.out.println("Average of Array = "+avg);

        int count=0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>avg){
                count++;
            }
        }
        System.out.println("Number of Elements Greater than Average = "+count);
        sc.close();
    }
}
//OUTPUT
// 66
// 77
// 88
// 54
// 33
// 21
// 32
// 12
// 34
// 76
// Array Elements
// 66 77 88 54 33 21 32 12 34 76 
// Average of Array = 49.3
// Number of Elements Greater than Average = 5