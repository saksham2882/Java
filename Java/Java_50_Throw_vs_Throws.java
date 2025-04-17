class NegativeRadiusException extends Exception {
    @Override
    public String toString() {
        return "Radius cannot be negative";
    }

    @Override
    public String getMessage() {
        return "Radius Cannot be Negative!";
    }
}

public class Java_50_Throw_vs_Throws {
    // 'throws' is used in a method to tell the caller that this method might throw an exception, so they should handle it using try-catch.
    public static double area(int r) throws NegativeRadiusException {

        if (r < 0) {
            throw new NegativeRadiusException();
        }

        double result = Math.PI * r * r;
        return result;
    }

    public static int divide(int a, int b) throws ArithmeticException {
        int result = a / b;
        return result;
    }

    public static void main(String[] args) {
        try {
            // int c = divide(6,0);
            // System.out.println(c);
            double ar = area(8);
            System.out.println(ar);
        } 
        catch (Exception e) {
            System.out.println("Exception");
        }
    }
}