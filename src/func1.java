import java.util.Scanner;
public class func1 {
    public static void main(String[] args)
    {
        int ans = sum2();
        System.out.println(ans);

    }
    static int sum2(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first no.:");
        int num1 = in.nextInt();
        System.out.println("Enter the second no.:");
        int num2 = in.nextInt();
        int sum = num1 * num2;
       return sum;
//       what you do after the above statement nothing will execute this is the property of return statement
    }
    static void sum()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first no.:");
        int num1 = in.nextInt();
        System.out.println("Enter the second no.:");
        int num2 = in.nextInt();
        int sum = num1 * num2;
        System.out.println(sum);

    }
}

