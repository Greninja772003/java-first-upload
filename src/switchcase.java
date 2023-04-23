import java.util.Scanner;
public class switchcase {
    public static void main(String[] args) {
        System.out.println("enter a fruit name:");
        Scanner in = new Scanner(System.in);
        String fruit = in.next();
        switch (fruit) {
            case "Mango":
                System.out.println("The King of fruits");
                break;
            case "Apple":
                System.out.println("The doctors favourite");
                break;
            case "Grapes":
                System.out.println("Small but sweet");
                break;
            case "Orange":
                System.out.println("The round one but sour also");
                break;
            case "Watermelon":
                System.out.println("Summer time favourite");
            default: System.out.println("We cant finD any phrase of the fruit you entered:");
        }
    }}
