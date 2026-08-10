import java.util.Scanner;

public class count_occurance {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[8];

        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array Elements");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("Enter = ");
        int find = sc.nextInt();

        int count = 0;

        for(int i=0; i<arr.length; i++){
            if(find==arr[i]){
                count++;
            }
        }
        System.out.println("Number of "+find+" is "+count);
        sc.close();
    }
}
// OUTPUT
// Array Elements
// 45 77 89 32 32 45 77 89 
// Enter = 77
// Number of 77 is 2
