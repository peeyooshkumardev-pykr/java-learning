import java.util.Scanner;

public class largest_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];

        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array Elements");

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        int max = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println();
        System.out.println("Largest = "+max);
        sc.close();
    }
}
