import java.util.Scanner;

public class Java_12_if_else_and_switch {
    public static void main(String[] args) {

        System.out.println("Enter your age:");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age >= 60) {
            System.out.println("Congratulations!, You are Allowed.");
        } else if (age > 50 && age < 60) {
            System.out.println("You are Experienced.");
        } else if (age > 30 && age < 50) {
            System.out.println("You are also Allowed.");
        } else {
            System.out.println("Sorry!, You are not Allowed");
        }

        char var = 'h';
        switch (var) {
            case 's' -> System.out.println("Now, You are are a minor.");
            case 'a' -> System.out.println("Now, You are a Adult!");
            case 'k' -> System.out.println("You are going to join a job!");
            case 'h' -> System.out.println("Now, You are ready for a happy married life!");
            default -> System.out.println("Enjoy your Life!");
        }

        sc.close();
    }
}