public class Java_08_Exercise_02 {
    public static void main(String[] args) {

        // Question 1:
        float a = 7 / 4.0f * 9 / 2.0f;
        System.out.println(a);

        // Question 2 : typecasting problem
        char grade = 'B';
        grade = (char) (grade - 1);     // encrypting grade
        System.out.println(grade);

        grade = (char) (grade + 1);     // decrypting grade
        System.out.println(grade);

        // Question 3:
        int a1 = 7 * 49 / 7 + 35 / 7;
        System.out.println(a1);
    }
}