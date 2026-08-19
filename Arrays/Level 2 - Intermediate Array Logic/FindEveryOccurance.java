// Find All Occurrences
// Take 10 integers and a number. Print every index where that number occurs.
import java.util.Scanner;
public class FindEveryOccurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array Elements");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("Enter Number = ");
        int num = sc.nextInt();

        for(int i=0; i<arr.length; i++){
            if(num==arr[i]){
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}
//OUTPUT
// Array Elements
// 34 22 12 45 12 89 12 67 12 55 
// Enter Number = 12
// 2 4 6 8 
