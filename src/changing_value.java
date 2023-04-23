import java.util.Arrays;

public class changing_value {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,55,68};
    change(arr);
        System.out.println(Arrays.toString(arr));
    }
static void change(int[] nums)
{
    nums[0] = 99; // if you make a change to  the object via ref variable same object will be change
}}
