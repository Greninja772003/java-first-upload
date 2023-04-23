import java.util.Scanner;

public class arguments {

    public static void main(String[] args)
    {
        System.out.println("Enter two no, to add:");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int ans = sum3( n, m);
        System.out.println(ans);

    }

    static int sum3(int a, int b){
        int sum = a +b;
        return sum;
    }// in this function block parameters of var a and b is provide inside the main function
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


