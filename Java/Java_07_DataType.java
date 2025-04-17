public class Java_07_DataType {
    public static void main(String[] args) {

        byte x = 5;
        int y = 9;
        short z = 8;

        int a = y + z;
        float b = 6.54f + x;

        System.out.println(a);
        System.out.println(b);

        // Increment and Decrement Operators :
        int i = 5;
        System.out.println(i++);
        System.out.println(i);
        System.out.println(++i);
        System.out.println(i);

        // question 1
        int p = 7;
        int q = ++p * 8;
        System.out.println(q);

        // question 2 :
        char f = 'B';
        f++;
        System.out.println(f);

        // question 3 :
        char ch = 'a';
        System.out.println(++ch);

    }
}