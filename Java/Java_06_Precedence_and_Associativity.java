public class Java_06_Precedence_and_Associativity {
    public static void main(String[] args){
        // int a = 6*5-34/2;       // precedence
        //       = 30-34/2
        //       = 30-17
        //       = 13

        // int b = 60/5-28*2;      // Associativity ( precedence same for / and * so evaluate by associativity from left to right )
        //       = 12-56
        //       = -44

        // System.out.println(a);
        // System.out.println(b);

        //question 1
        int x = 9;
        int y = 3;
        int k = x * y/3;
        System.out.println(k);

        // question 2
        int a = 4;
        int b = 9;
        int c = 2;
        int k1 = (b * b - 4 * a * c)/2 * a;
        System.out.println(k1);

    }
}
