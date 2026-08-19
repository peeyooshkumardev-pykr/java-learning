// Q04 — Print Odd Numbers
// Print all odd numbers from 1 to 20.

public class Q04_PrintOddNumbers {
    public static void main(String[] args) {
        
        for(int i = 1; i<=20; i++){
            if(i%2!=0){
                System.out.print(i+" ");
            }
        }
    }
}
// OUTPUT
// 1 3 5 7 9 11 13 15 17 19
