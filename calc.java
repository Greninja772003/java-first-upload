import java.util.Scanner;
public class calc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int ans = 0;
        //Take input from user till user doesn't press x or X
        while (true){
            // take the operator as input
            System.out.println("Enter the operator");
            char op = in.next().trim().charAt(0);
//            System.out.println();

            if (op == '+'|| op == '-' || op == '*' || op == '/' || op == '%') {
                //input two no.
                System.out.println("Enter two no.");
                int num1 = in.nextInt();
                int num2 = in.nextInt();
                if (op == '+') {
                    ans = num1 + num2;
                }
                if (op == '-') {
                    ans = num1 - num2;
                }
                if (op == '*') {
                    ans = num1 * num2;
                }
                if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    }
                }
                if (op == '%') {
                    ans = num1 % num2;
                }
            }
                else if (op == 'x' || op == 'X')
                {
                    break;
                } else {
                    System.out.println("Invalid operation!!");
                }
            System.out.println(ans);
        }
    }
}
