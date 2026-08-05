public class intro {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        System.out.println(arr.length);
        System.out.println(arr[4]);
        System.out.println();

        //Loop
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println();
        //Backword Loop
        for(int j = arr.length-1; j>=0; j--){
            System.out.println(arr[j]);
        }
    }
}
