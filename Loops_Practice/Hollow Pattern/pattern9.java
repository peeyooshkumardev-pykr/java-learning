// Hollow Butterfly
// *       *
// **     **
// * *   * *
// *  * *  *
// *   *   *
// *  * *  *
// * *   * *
// **     **
// *       *
public class pattern9 {
    public static void main(String[] args) {
        for(int i = 1; i<=9; i++){
            for(int j = 1; j<=9; j++){
                if(j==1 || i==j || j==9 || j==10-i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
