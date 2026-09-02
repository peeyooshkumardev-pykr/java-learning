// Q15 — Find the Frequency of Each Digit in an Array
// Take an array containing integers and count how many times each digit from 0 to 9 occurs in all the numbers.

import java.util.Scanner;

public class Q15_FindTheFrequencyOfEachDigitInAnArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size = ");

        int size = sc.nextInt();

        if(size <= 0){

            System.out.println("Invalid Input!");
            sc.close();
            return;
        }

        int arr[] = new int[size];
        int frequency[] = new int[10];

        System.out.println("Enter Array Elements:");

        for(int i = 0; i < arr.length; i++){

            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < arr.length; i++){

            int num = arr[i];

            if(num == 0){

                frequency[0]++;

            }else{

                while(num != 0){

                    int digit = num % 10;

                    if(digit < 0){
                        digit = -digit;
                    }

                    frequency[digit]++;

                    num = num / 10;
                }
            }
        }

        System.out.println("Digit frequencies:");

        for(int i = 0; i <= 9; i++){

            System.out.println(i + " = " + frequency[i]);
        }

        sc.close();
    }
}
// Output 
// Enter array size = 4
// Enter Array Elements:
// 1242154 54322 7643 12345
// Digit frequencies:
// 0 = 0
// 1 = 3
// 2 = 5
// 3 = 3
// 4 = 5
// 5 = 3
// 6 = 1
// 7 = 1
// 8 = 0
// 9 = 0