class base {
    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am in base and setting x now");
        this.x = x;
    }

    public void printMe() {
        System.out.println("I am a Constructor");
    }
}

class Derived extends base {                // inheritance - use of class base x in class base y
    public int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class Java_28_Inheritance {
    public static void main(String[] args) {
        // creating an object in base class
        base b = new base();
        b.setX(4);
        System.out.println(b.getX());

        // creating an object of derived class
        Derived d = new Derived();
        d.setX(5);                          // from base case
        System.out.println(d.getX());

        Derived d1 = new Derived();
        d1.setY(56);
        System.out.println(d1.getY());
    }
}
