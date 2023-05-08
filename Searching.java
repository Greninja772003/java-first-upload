import java.util.Scanner;

public class Searching {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums = {2,6,4,8,3,18,651,123,1,165,89,132,1654,1,3,21,3};
         while(true) {
                            System.out.println("Enter the element you want to search in the array");
                                   int n = in.nextInt();
                                            int ans = linearSearch(nums, n);

             if (ans == -2) {
                 System.out.println("The array doest'n contain the given element");
             } else if (n == -1){
                 break;
             }
               else if (true){
                                   System.out.println("The array contains the given element");

             }
         }
    }
    static int linearSearch(int [] arr, int n){
        if (arr.length == 0){
            return -1;
        }
//        run for a loop
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if ( element == n){
                return element;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            int ele = -1;
            if (ele == n) {
                return -1;
            }
        }
//    this line will execute if none of the return statements above have executed
//            hence the target not found
           return -2;
    }
}
