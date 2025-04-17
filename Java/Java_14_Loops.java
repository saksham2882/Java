import java.util.Scanner;

public class Java_14_Loops {
    public static void main(String[] args) {

        // 1. While loop
        int i = 1;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }

        // 2. For Loop :
        // program for first n natural odd number
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your Number:");
        int b = s.nextInt();
        for (int j = 0; j < b; j++) {
            System.out.println(2 * j + 1);
        }

        // 3. do-while loop:
        int c = 0;
        do {
            System.out.println(c);
            c++;
        } while (c < 5);

        s.close();
    }
}
