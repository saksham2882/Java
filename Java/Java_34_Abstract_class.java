abstract class parent2 {
    public parent2() {
        System.out.println("I'm parent2 constructor!");
    }

    public void sayHello() {
        System.out.println("Hello!");
    }

    abstract public void greet();

    abstract public void greet2();
}

class child2 extends parent2 {
    @Override
    public void greet() {
        System.out.println("good morning");
    }

    @Override
    public void greet2() {
        System.out.println("good Afternoon");
    }
}

//  abstract class child3 extends parent2 {          // if we create an object of this class then it show an error because it does not implements the abstract class .
//     public void th() {
//         System.out.println("I am good");
//     }
// }

public class Java_34_Abstract_class {
    public static void main(String[] args) {

        // abstract means existing in thought or as an idea without concrete existence
        // parent2 p = new parent2();                   // error ( not allowed )

        child2 c = new child2();
        c.greet();

        // child3 c3 = new child3();                    // not allowed because it extends the parent2 class but not implements the abstract methods so it give an error.
    }
}
