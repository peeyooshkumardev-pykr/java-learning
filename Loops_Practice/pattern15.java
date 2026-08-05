//Diamond
public class pattern15 {
    public static void main(String[] args) {
        //Upper Pyramid
        for(int i = 1; i<=5; i++){
            for(int j = 1; j<=5-i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k<=2*i-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        //Lower Pyramid
        for(int a = 1; a<=4; a++){
            for(int b = 1; b<=a; b++){
                System.out.print(" ");
            }
            for(int c = 1; c<=9-a*2; c++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
//     *
//    ***
//   *****
//  *******
// *********
//  *******
//   *****
//    ***
//     *
