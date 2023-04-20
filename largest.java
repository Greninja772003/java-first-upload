import java.util.Scanner;
public class largest {
public static void main(String[] args){
    System.out.println("Enter three no. to compare:\n");
    Scanner in = new Scanner(System.in);
    int a = in.nextInt();
    int b = in.nextInt();
    int c = in.nextInt();
    int max = Math.max(a, b);
    if (c>max){
    max = c;
}
System.out.println("the Largest no. is : " +max);

}
}
