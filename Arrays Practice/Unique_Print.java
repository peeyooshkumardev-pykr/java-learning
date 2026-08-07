// Print Only Unique Elements
// Take 10 integers and print the elements that occur only once.
import java.util.Scanner;
public class Unique_Print {
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
        
        int count = 0;
        for(int i = 0; i<arr.length; i++){
            
            boolean unique = true;

            for(int j = 0; j<arr.length; j++){
                if(i!=j && arr[i]==arr[j]){
                    unique = false;
                    break;
                }
            }
            if(unique){
                count++;
            }
        }
        System.out.println("Number of Unique = " + count);
        sc.close();
    }
}
// OUTPUT
// 45
// 67
// 89
// 33
// 22
// 45
// 67
// 89
// 22
// 10
// Array Elements
// 45 67 89 33 22 45 67 89 22 10 
// Number of Unique = 2