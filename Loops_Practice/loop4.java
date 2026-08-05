import java.util.Scanner;

public class loop4 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number = ");
        int num = sc.nextInt();
        int mul;

        for(int i = 1; i<=10; i++){
            mul = num * i;
            System.out.println(num +""+" * "+""+i+" = "+ mul);
        }
        sc.close();
    }
}
// Enter Number = 5
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
