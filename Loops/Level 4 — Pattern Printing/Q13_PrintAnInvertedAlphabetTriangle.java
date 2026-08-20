import java.util.Scanner;

public class Q13_PrintAnInvertedAlphabetTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the integer = ");
        int N = sc.nextInt();

        for(int i = N; i>=1; i--){
            for(int j = 1; j<=i; j++){
                System.out.print((char)('A'+j-1));
            }
            System.out.println();
        }
        sc.close();
    }
}
// OUTPUT
// Enter the integer = 5
// ABCDE
// ABCD
// ABC
// AB
// A