import java.util.Scanner;

// Exception is an event that occurs when we do something wrong (e.g., divide by zero).
// In such cases, there is no point in continuing the program, so the program throws an exception at that point.
// There are two types of exceptions:
// 1. Built-in Exceptions (already provided by Java)
// 2. Custom Exceptions (which we can define ourselves)

class MyException extends Exception {            // custom exception
    @Override
    public String toString() {                   // custom exception method
        return "I am toString()";
    }

    @Override
    public String getMessage() {
        return "I am getMessage()";
    }
}

public class Java_49_Exception_class {
    public static void main(String[] args) {

        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        a = sc.nextInt();
        sc.close();

        if (a < 9) {

            // Whenever we use 'throw', we use it with try-catch.
            // Because we already know that an error might happen there, and we don't want the program to stop.
            // So we handle the exception using try-catch and let the program continue smoothly.

            try {
                // throw new MyException();
                throw new ArithmeticException("This is an Exception");
            } 
            catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e);

                e.printStackTrace();      // It helps to find out what error occurred and on which line it happened.
                System.out.println("Finished");
            }

            System.out.println("Yes Finished");
        }

    }
}
