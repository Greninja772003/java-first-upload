import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
System.out.println("Enter the amt of salary");
Scanner in = new Scanner(System.in);
        int salary ;
        salary = in.nextInt();
        if (salary > 40000) {
            salary += 5000;
        }
        else if (salary > 32000){
            salary += 3000;
        } else { salary += 1000;

        }
        System.out.println(salary);
        }
    }
