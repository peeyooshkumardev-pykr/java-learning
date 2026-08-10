import java.util.Scanner;

public class search_an_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println();
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.print("Enter = ");
        int find = sc.nextInt();
        boolean isFind = false;

        for(int i=0; i<arr.length; i++){
            if(find==arr[i]){
                isFind = true;
                break;
            }
        }
        if(isFind){
            System.out.println("Found "+find);
        }else{
            System.out.println("Not Found");
        }
        sc.close();
    }
}
//OUTPUT
// 55 43 66 78 43 
// Enter = 78
// Found 78