@FunctionalInterface
interface myFunctionalInterface {
    void thisMethod();
    // void thisMethod2();
}

class NewPhone extends phone {
    @Override
    public void showtime() {
        System.out.println("Time is 8 PM");
    }

    @Deprecated
    public int sum(int a, int b) {
        return a + b;
    }
}

public class Java_57_Annotations {
    @SuppressWarnings("Deprecation")
    public static void main(String[] args) {
        NewPhone phone = new NewPhone();
        phone.showtime();
        phone.sum(5, 6);
    }
}


// 1. Annotations are used to give extra info about the program.
// 2. They provide metadata to classes/methods.
// 3. Metadata means "data about data" (like info about methods, etc).
// 4. If annotation is applied, the compiler may change its behavior.

// Some Built-in Annotations in Java:
// 1. @Override → Marks methods that override parent class methods.
// 2. @SuppressWarnings → Used to hide compiler warnings.
// 3. @Deprecated → Marks methods that should not be used anymore.
// 4. @FunctionalInterface → Ensures the interface has only one abstract method.
