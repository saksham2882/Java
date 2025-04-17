import java.util.Scanner;

public class Java_16_Exercise_04_Patterns {
    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        // Problem No.01 : Square
        System.out.println("Enter Number of rows: ");
        int row = sc.nextInt();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                System.out.printf(" *");
            }
            System.out.printf("\n");
        }

        // Problem No.02 : Rectangle
        System.out.println("Enter Length of Rectangle : ");
        int Length = sc.nextInt();
        System.out.println("Enter Breadth of Rectangle : ");
        int Breadth = sc.nextInt();
        for (int i = 0; i < Breadth; i++) {
            for (int j = 0; j < Length; j++) {
                System.out.printf(" *");
            }
            System.out.printf("\n");
        }

        // Problem No.03 : Hollow Square
        System.out.println("Enter Number of rows: ");
        int row1 = sc.nextInt();
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < row1; j++) {
                if (j == 0) {
                    System.out.printf(" *");
                }
                if ((i == 0 || i == row1 - 1) && j > 0 && j < row1) {
                    System.out.printf(" *");
                }
                if (i > 0 && i < row1 - 1 && j > 0 && j < row1 - 1) {
                    System.out.printf("  ");
                }
                if (j == row1 - 1 && i > 0 && i < row1 - 1) {
                    System.out.printf(" *");
                }
            }
            System.out.printf("\n");
        }

    }
}