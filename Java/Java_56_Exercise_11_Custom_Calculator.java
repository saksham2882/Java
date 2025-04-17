class InvalidInputException extends Exception {
    @Override
    public String toString() {
        return "Cannot ADD 8 and 9";
    }
}

class CannotDivideByZeroException extends Exception {
    @Override
    public String toString() {
        return "Cannot Divide by Zero";
    }
}

class MaxInputException extends Exception {
    @Override
    public String toString() {
        return "Number Cannot be  Greater Than 100000";
    }
}

class MaxMultiplyInputException extends Exception {
    @Override
    public String toString() {
        return "Multiplication Input Cannot be greater than 7000";
    }
}

class CustomCalculator {
    double add(double a, double b) throws InvalidInputException, MaxInputException {
        if (a > 100000 || b > 100000) {
            throw new MaxInputException();
        }
        if (a == 8 || b == 9) {
            throw new InvalidInputException();
        }
        return a + b;
    }

    double subtract(double a, double b) throws MaxInputException {
        if (a > 100000 || b > 100000) {
            throw new MaxInputException();
        }
        return a - b;
    }

    double multiply(double a, double b) throws MaxInputException, MaxMultiplyInputException {
        if (a > 100000 || b > 100000) {
            throw new MaxInputException();
        }
        if (a > 7000 || b > 7000) {
            throw new MaxMultiplyInputException();
        }
        return a * b;
    }

    double divide(double a, double b) throws CannotDivideByZeroException, MaxInputException {
        if (a > 100000 || b > 100000) {
            throw new MaxInputException();
        }
        if (b == 0) {
            throw new CannotDivideByZeroException();
        }
        return a / b;
    }
}

public class Java_56_Exercise_11_Custom_Calculator {
    public static void main(String[] args)
            throws InvalidInputException, CannotDivideByZeroException, MaxInputException, MaxMultiplyInputException {

        /*
         Exercise: You have to create a custom calculator with following operations:
         1. + -> Addition
         2. - -> Subtraction
         3. * -> Multiplication
         4. / -> Division
         which throws the following exceptions:
         1. Invalid input Exception ex. 8 & 9
         2. Cannot divide by 0 Exception
         3. Max Input Exception if any of the inputs is greater than 100000
         4. Max Multiplier reached Exception - don't allow any multiplication input to
         be greater than 7000
        */

        CustomCalculator c = new CustomCalculator();
        // System.out.println(c.add(8 , 9));
        // System.out.println(c.divide(7 , 0));
        // System.out.println(c.add(100001 , 100001));
        System.out.println(c.multiply(7077, 7009));
    }
}
