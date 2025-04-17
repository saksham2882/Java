public class Java_05_Operators {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        int a = 4;

        // modulus operator
        int b = 10 % a;

        int c = a + b;
        float d = (4.8f % 1.1f);

        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        // comparison operator
        System.out.println(55 < 95);

        // logical AND operator
        System.out.println(85 < 55 && 96 > 9);

        // logical OR operator
        System.out.println(55 < 98 || 56 > 97);

    }
}