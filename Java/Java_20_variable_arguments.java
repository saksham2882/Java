public class Java_20_variable_arguments {

    // Example 1:
    // static int sum(int a, int b) {
    //     return a + b;
    // }
    // static int sum(int a, int b, int c) {
    //     return a + b + c;
    // }
    // static int sum(int a, int b, int c, int d) {
    //     return a + b + c + d;
    // }

    // Example 2:
    // static int sum(int... arr) {                // available as int [] arr
    //     int result = 0;
    //     for (int a : arr) {
    //         result += a;
    //     }
    //     return result;
    // }

    // Example 3:
    static int sum(int x, int... arr) {
        int result = x;
        for (int a : arr) {
            result += a;
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println("Welcome to varargs Tutorial");
        // System.out.println("The sum of nothing is:" + sum());
        // System.out.println("The sum of 1 is:" + sum(1));
        System.out.println("The sum of 4 and 5 is :" + sum(4, 5));
        System.out.println("The sum of 4 , 3 and 5 is :" + sum(4, 3, 5));
        System.out.println("The sum of 4 , 3 , 2 and 5 is :" + sum(4, 3, 2, 5));
    }
}