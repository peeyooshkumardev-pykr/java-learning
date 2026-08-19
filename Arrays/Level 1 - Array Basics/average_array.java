import java.util.Scanner;

public class average_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];

        for(int i=0; i<5; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array Elements");

        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        double sum = 0;
        double avg = 0;
        for(int i=0; i<5; i++){
            sum = sum + arr[i];
            avg = sum/arr.length;
        }
        System.out.println();
        System.out.println("Sum of Array Elements = "+sum);
        System.out.println("Average of Array Elements = " + avg);

        sc.close();
    }
}
