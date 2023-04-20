//import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("enter a random 8 digit no.");
        int n = 165165465;
        int ans = 0;
        while( n>0) {
            int rem = n % 10;
            n /= 10;
            ans = ans * 10 + rem;
//            System.out.println("Reverse of the given no. is :" +ans);
        }
                System.out.println("Reverse of the given no. is :" +ans);
    }}
