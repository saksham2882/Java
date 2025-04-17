public class Java_46_Try_catch_block {
    public static void main(String[] args) {
        int a = 6000;
        // int b = 0; Arithmetic Exception
        // int b = 9;

        // without Try:  Throw an exception
        // int b = 0;
        // int c = a / b;
        // System.out.println("The result is " + c);

        // with try
        int d = 0;
        try {
            int f = a / d;
            System.out.println("The result is " + f);
        } catch (Exception e) {
            System.out.println("We failed to divide. Reason: ");
            System.out.println(e);
        }

        System.out.println("End of the program");
    }
}
