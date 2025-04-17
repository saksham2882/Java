import java.util.Scanner;

public class Java_11_Conditional_Statements {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        float age = sc.nextFloat();
        
        if (age >= 18) {
            System.out.println("yes , you can Drive!");
        } else {
            System.out.println("No , you can not drive");
        }

        sc.close();
    }
}