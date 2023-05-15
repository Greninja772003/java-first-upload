import java.util.Scanner;

public class BinarySearch1D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[]arr = {2,3,4,12,45,86,89,91,94,98};
        System.out.println("Enter the element that you want to search in the array");
        int target = in.nextInt();
        int ans = search(arr,target);
        System.out.println("Your element is at the index " + ans + " in the array");
    }
    static int search(int[]arr , int target){
        int start = 0;
        int end = arr.length - 1;
        while(start<= end){
            int mid = start + (end - start)/2;
            if (target< arr[mid]){
                end = mid - 1;
            }else if (target> arr[mid]){
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
