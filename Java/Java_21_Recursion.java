import java.util.Scanner;

public class Java_21_Recursion {

    // factorial(n) = n * n-1 *....1
    // factorial() = n * factorial(n-1)

    // recursion method
    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    // normal for loop method
    static int factorial_iterative(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            int product = 1;
            for (int i = n; i >= 1; i--) {
                product *= i;
            }
            return product;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number for finding its factorial:");
        int x = sc.nextInt();

        System.out.println(factorial(x));
        System.out.println(factorial_iterative(x));
        sc.close();
    }
}
