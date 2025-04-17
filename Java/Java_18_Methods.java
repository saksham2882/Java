import java.util.Scanner;

public class Java_18_Methods {

    // methods are just like a function
    int logic(int x, int y) {
        int z;
        if (x > y) {
            z = x + y;
        } else {
            z = (x + y) * 5;
        }
        return z;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1: ");
        int a = sc.nextInt();
        System.out.println("Enter Number 2: ");
        int b = sc.nextInt();

        // method invocation using object creation
        Java_18_Methods obj = new Java_18_Methods();
        int c1 = obj.logic(a,b);
        System.out.println(c1);

        // When we make logic-method static -> then no need to create object
        // int c = logic(a, b);
        // System.out.println(c);

        sc.close();
    }
}
