// Q03 — Print Even Numbers
// Print all even numbers from 1 to 20.

public class Q03_PrintEvenNumbers {
    public static void main(String[] args) {
        
        for(int i = 1; i<=20; i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
    }
}
// OUTPUT
// 2 4 6 8 10 12 14 16 18 20 