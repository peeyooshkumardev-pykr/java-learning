// Find Second Smallest Element
// Take 10 integers and find the second smallest element.
import java.util.Scanner;

public class SecondSmallestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array Element");
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        
        int min;
        int min2nd;
        if(arr[0]<arr[1]){
            min = arr[0];
            min2nd = arr[1];
        }else{
            min = arr[1];
            min2nd = arr[0];
        }

        for(int i = 2; i<arr.length; i++){
            if(arr[i]<min){
                min2nd = min;
                min = arr[i];
            }
            else if(arr[i]<min2nd){
                min2nd = arr[i];
            }
        }
        System.out.println("Smallest = "+min);
        System.out.println("2nd Smallest = "+min2nd);
        sc.close();
     }
}
//OUTPUT
// 44
// 56
// 33
// 22
// 67
// 85
// 35
// 123
// 56
// 46
// Array Element
// 44 56 33 22 67 85 35 123 56 46 
// Smallest = 22
// 2nd Smallest = 33