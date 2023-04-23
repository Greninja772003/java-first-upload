import java.util.Scanner;

public class armnumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(Armstrong(n));
        for (int i = 100; i < 1000; i++ ){
            if (Armstrong(i)){
                System.out.println(i +" ");
            }
        }
    }
//    print the 4 digit armstrong no.
       static boolean Armstrong(int n){
        int original = n;
        int sum = 0;
        while ( n>0){
            int rem = n%10;
            n /= 10;
            sum = sum + rem*rem*rem;
        }
           return sum == original;

       }
}
