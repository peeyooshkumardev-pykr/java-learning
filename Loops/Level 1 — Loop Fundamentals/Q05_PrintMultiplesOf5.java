// Q05 — Print Multiples of 5
// Print the first 10 multiples of 5.

public class Q05_PrintMultiplesOf5 {
    public static void main(String[] args) {
        
        for(int i = 1; i<=10; i++){
            int res = 5 * i;
            System.out.println(5+" * "+i+" = "+res);
        }
    }
}
// OUTPUT
// 5 * 1 = 5
// 5 * 2 = 10
// 5 * 3 = 15
// 5 * 4 = 20
// 5 * 5 = 25
// 5 * 6 = 30
// 5 * 7 = 35
// 5 * 8 = 40
// 5 * 9 = 45
// 5 * 10 = 50