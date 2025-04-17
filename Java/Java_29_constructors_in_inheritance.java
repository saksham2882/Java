class base1 {
    base1() {
        System.out.println("I am a constructor");
    }

    base1(int x) {
        System.out.println("I am an overload constructor with value of x as: " + x);
    }
}

class Derived1 extends base1 {
    Derived1() {
        super(0);
        System.out.println("I am a derived1 class constructor");
    }

    Derived1(int x, int y) {
        super(x);
        System.out.println("I am an overload constructor of derived1 with value of y as: " + y);
    }
}

class ChildOfDerived extends Derived1 {
    ChildOfDerived() {
        System.out.println("I am a child of derived1 constructor");
    }

    ChildOfDerived(int x, int y, int z) {
        super(x, y);
        System.out.println("I am a child of overload constructor of derived1 with value of z as: " + z);
    }
}

public class Java_29_constructors_in_inheritance {
    public static void main(String[] args) {
        // base1 b = new base1();
        
        // Derived1 d = new Derived1();
        // Derived1 d1 = new Derived1(14, 15);

        ChildOfDerived d2 = new ChildOfDerived();
        // ChildOfDerived d3 = new ChildOfDerived(12, 15, 18);
    }
}
