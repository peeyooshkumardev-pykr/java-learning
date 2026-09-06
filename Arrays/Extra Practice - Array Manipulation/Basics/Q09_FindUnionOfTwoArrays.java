// Q09 — Find Union of Two Arrays
// Take two arrays and create their union without duplicate elements.

import java.util.Scanner;

public class Q09_FindUnionOfTwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st Array Size = ");
        int size1 = sc.nextInt();

        if(size1 <= 0){
            System.out.println("Wrong Input!");
            sc.close();
            return;
        }

        int arr1[] = new int[size1]; 

        System.out.print("Enter 1st Array Elements:");

        for(int i = 0; i<arr1.length; i++){
            arr1[i] = sc.nextInt();
        }

        System.out.println();

        System.out.print("Enter 2nd Array Size = ");
        int size2= sc.nextInt();

        if(size2 <= 0){
            System.out.println("Wrong Input!");
            sc.close();
            return;
        }

        int arr2[] = new int[size2]; 

        System.out.print("Enter 2nd Array Elements:");

        for(int i = 0; i<arr2.length; i++){
            arr2[i] = sc.nextInt();
        }

        System.out.println();

        int countUnique = 0;

        for(int i = 0; i<arr1.length; i++){
            boolean unique = true;

            for(int j = 0; j<i; j++){
                if(arr1[i] == arr1[j]){
                    unique = false;
                    break;
                }
            }
            if(unique){
                countUnique++;
            }
        }

        for(int i = 0; i<arr2.length; i++){
            boolean unique = true;
            boolean notCommon = true;

            for(int j = 0; j<arr1.length; j++){
                if(arr2[i] == arr1[j]){
                    notCommon = false;
                    break;
                }
            }

            for(int j = 0; j<i; j++){
                if(arr2[i] == arr2[j]){
                    unique = false;
                    break;
                }
            }

            if(unique && notCommon){
                countUnique++;
            }
        }

        int arrUnion[] = new int[countUnique];
        
        int position = 0; 

        for(int i = 0; i<arr1.length; i++){
            boolean unique = true;

            for(int j = 0; j<i; j++){
                if(arr1[i] == arr1[j]){
                    unique = false;
                    break;
                }
            }
            if(unique){
                arrUnion[position] = arr1[i];
                position++;
            }
        }

        for(int i = 0; i<arr2.length; i++){
            boolean unique = true;
            boolean notCommon = true;

            for(int j = 0; j<arr1.length; j++){
                if(arr2[i] == arr1[j]){
                    notCommon = false;
                    break;
                }
            }

            for(int j = 0; j<i; j++){
                if(arr2[i] == arr2[j]){
                    unique = false;
                    break;
                }
            }

            if(unique && notCommon){
                arrUnion[position] = arr2[i];
                position++;
            }
        }

        System.out.println("Output Union Array:");
        
        for(int i = 0; i<arrUnion.length; i++){
            System.out.print(arrUnion[i]+" ");
        }
        
        sc.close();
    }
}
// Output 
// Enter 1st Array Size = 6
// Enter 1st Array Elements:1 2 3 4 5 5

// Enter 2nd Array Size = 4
// Enter 2nd Array Elements:6 6 7 7

// Output Union Array:
// 1 2 3 4 5 6 7