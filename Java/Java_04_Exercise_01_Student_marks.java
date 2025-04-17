import java.util.Scanner;

public class Java_04_Exercise_01_Student_marks {
    public static void main(String[] args) {
        System.out.println("Marks sheet of Student");
        Scanner s = new Scanner(System.in);

        System.out.println("Enter Marks of Math:");
        float a = s.nextFloat();

        System.out.println("Enter Marks of English:");
        float b = s.nextFloat();

        System.out.println("Enter Marks of Hindi:");
        float c = s.nextFloat();

        System.out.println("Enter Marks of Physics:");
        float d = s.nextFloat();

        System.out.println("Enter Marks of Chemistry:");
        float e = s.nextFloat();

        float sum = a + b + c + d + e;
        System.out.println("Sum of total Marks:");
        System.out.println(sum);
        float percentage = (sum / 5);

        System.out.println("Percentage of Student:");
        System.out.println(percentage);
        float CGPA = (percentage / 9.5f);
        
        System.out.println("CGPA of student:");
        System.out.println(CGPA);
        s.close();
    }
}
