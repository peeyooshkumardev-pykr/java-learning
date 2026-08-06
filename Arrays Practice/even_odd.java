import java.util.Scanner;

public class even_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array Elements");

        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        System.out.print("Even = ");
        int even = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2==0){
                System.out.print(arr[i]+" ");
                even++;
            }
        }
        System.out.println();
        System.out.println("No. of Evens = "+even);

        System.out.println();
        System.out.print("Odd = ");
        int odd = 0;
        for(int i=0;i<arr.length; i++){
            if(arr[i]%2!=0){
                System.out.print(arr[i]+" ");
                odd++;
            }
        }
        System.out.println();
        System.out.println("No. of Odds = "+odd);
        sc.close();
    }
}

