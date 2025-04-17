import java.util.Scanner;

public class Java_09_String {
    public static void main(String[] args) {

        String name = new String("Saksham");
        System.out.println("My name is: " + name);
        String name1 = "saksham";
        System.out.println(name1);

        int a = 6;
        float b = 6.26f;
        System.out.printf("The value of a is %d and the value of b is %4.1f \n", a, b);
        System.out.format("The value of a is %d and the value of b is %f ", a, b);

        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        System.out.println(st);

        sc.close();
    }
}
