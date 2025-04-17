@FunctionalInterface
interface DemoAnonymous {
    void meth1();
    // void meth1(int a);
    // void meth2();
}

// I want to create a class that implements this interface. And then I want to override its method.
class SakshamFunction implements DemoAnonymous {
    @Override
    public void meth1() {
        System.out.println("This is method1");
    }
}

class AnonymousDemo implements DemoAnonymous {
    public void display() {
        System.out.println("Hello");
    }

    @Override
    public void meth1() {
        System.out.println("I am meth1");
    }

    // @Override
    // public void meth2() {
    //     System.out.println("I am meth2");
    // }
}

public class Java_58_Anonymous_class_Lambda_Expression {
    public static void main(String[] args) {

        // DemoAnonymous obj = new AnonymousDemo();
        // obj.meth1();

        // Anonymous Class :
        DemoAnonymous obj = new DemoAnonymous() {      
            // This is not a normal class but an Anonymous class.
            // Here, we created an interface reference and directly made its object.

            @Override
            public void meth1() {
                System.out.println("I am meth1");
            }

            // @Override
            // public void meth2() {
            // System.out.println("I am meth2");
            // }
        };
        obj.meth1();

        // Normal Expression :
        // DemoAnonymous obj1 = new SakshamFunction(); // Normal way
        // obj1.meth1();

        // Lambda Expression :
        DemoAnonymous obj2 = () -> {
            System.out.println("I am Method1 from lambda function ");
        };
        obj2.meth1();

        // DemoAnonymous obj2 = (a)->{
        // System.out.println("I am Method1 from lambda function " + a);
        // };
        // obj2.meth1(4);
    }
}


// Note: Why meth1 / meth2 got printed? Because I created an object and called its method.
// Basically, this object was created using an anonymous class. I didn’t actually create a separate class.
// Anonymous class is used to define a one-time expression.
// If we want to perform some task only once, there's no need to create a full class, we can simply use an anonymous class for that.


// Note: Lambda Expression can be used to directly create an object of an interface
// that has only one method (functional interface).
// Means the work we did using SakshamFunction class can also be done using lambda.
