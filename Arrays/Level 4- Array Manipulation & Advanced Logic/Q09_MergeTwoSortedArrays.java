import java.util.Scanner;

public class Q09_MergeTwoSortedArrays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st Array Size = ");
        int size1 = sc.nextInt();

        if(size1 <= 0){
            System.out.println("Invalid Input!");
            sc.close();
            return;
        }

        int arr1[] = new int[size1];

        System.out.print("Enter 1st Array = ");
        for(int i = 0; i < arr1.length; i++){
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter 2nd Array Size = ");
        int size2 = sc.nextInt();

        if(size2 <= 0){
            System.out.println("Invalid Input!");
            sc.close();
            return;
        }

        int arr2[] = new int[size2];

        System.out.print("Enter 2nd Array = ");
        for(int i = 0; i < arr2.length; i++){
            arr2[i] = sc.nextInt();
        }

        int arr3[] = new int[arr1.length+arr2.length];

        int i = 0;
        int j = 0;
        int k = 0;
        
        while(i < arr1.length && j < arr2.length){
            if(arr1[i]<=arr2[j]){
                arr3[k] = arr1[i];
                i++;
            }else{
                arr3[k] = arr2[j];
                j++;
            }
            k++;
        }

        while(i<arr1.length){
            arr3[k] = arr1[i];
            k++;
            i++;
        }
        while(j<arr2.length){
            arr3[k] = arr2[j];
            k++;
            j++;
        }

        System.out.println("Output 3rd Array:");
        for(int s = 0; s < arr3.length; s++){
            System.out.print(arr3[s]+" ");
        }

        sc.close();
    }
}
// Output 
// Enter 1st Array Size = 5
// Enter 1st Array = 1 3 5 7 9
// Enter 2nd Array Size = 4
// Enter 2nd Array = 2 4 6 8
// Output 3rd Array:
// 1 2 3 4 5 6 7 8 9 