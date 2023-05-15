import java.sql.Statement;
import java.util.Scanner;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the element that you want to search in the array");
        int target = in.nextInt();
        int[]arr = {-12,-5,-2,-1,0,3,5,8,94,213,246,248,278,342};
        int ans = BinaryS(arr, target);
        System.out.println("Your element is at the " + ans + " index in the array");
    }
    static int BinaryS(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        //find whether the given sorted array is arranged in ascending or descending order
        boolean isAsc;
        if (arr[start]<arr[end]){
            isAsc = true;
        }else{
            isAsc = false;
        }
        while(start<= end){
            int mid = start + (end-start)/2;
            if(target== arr[mid]){
                return mid;
            }
            if(isAsc){
                if(target<arr[mid]){
                    end = mid-1;
                } else  {
                    start= mid+1;
                }
                }
            else {
                if(target>arr[mid]){
                    end = mid -1;
                }
                else{
                    start = mid +1;
                }
            }
        }
        return -1;
    }
}
