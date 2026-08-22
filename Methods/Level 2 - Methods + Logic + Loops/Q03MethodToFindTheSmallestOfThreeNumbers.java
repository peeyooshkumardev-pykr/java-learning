// Q03 — Method to Find the Smallest of Three Numbers
// Create a method named findSmallest() that accepts three integers and returns the smallest number.
import java.util.Scanner;

public class Q03MethodToFindTheSmallestOfThreeNumbers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st number = ");
        int a = sc.nextInt();

        System.out.print("Enter 2nd number = ");
        int b = sc.nextInt();

        System.out.print("Enter 3rd number = ");
        int c = sc.nextInt();

        System.out.println("Smallest Number = " + findSmallest(a, b, c));

        sc.close();
    }

    static int findSmallest(int a,int b,int c){

        if(a<b && a<c){
            return a;
        }
        else if(b<a && b<c){
            return b;
        }
        else if(c<a && c<b){
            return c;
        }
        else if(c==b && c<a){
            return c;
        }
        else if(a==b && b<c){
            return b;
        }
        else{
            return a;
        }
    }
}
// OUTPUT
// Enter 1st number = 45
// Enter 2nd number = 55
// Enter 3rd number = 24
// Smallest Number = 24