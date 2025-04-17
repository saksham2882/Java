import java.util.Scanner;

public class Java_48_Nested_Try_Catch {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of index:");
        int index = sc.nextInt();

        try {
            System.out.println("Welcome....");
            try {
                System.out.println(marks[index]);
            } 
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Sorry this index does not exists.");
                System.out.println("Exception in level 2");
            }
        } 
        catch (Exception e) {
            System.out.println("Exception in level 1");
        }

        sc.close();
    }
}