abstract class Pen {
    abstract void write();
    abstract void refill();
}

class fountainPen extends Pen{
    @Override
    void write() {
        System.out.println("Writing....");
    }

    @Override
    void refill() {
        System.out.println("Refilling....");
    }

    void changeNib() {
        System.out.println("Changing the nib...");
    }
}

interface basicAnimal {
    void eat();
    void sleep();
}

class monkey {
    public void jump() {
        System.out.println("Jumping.....");
    }

    public void bite() {
        System.out.println("biting......");
    }
}

class human extends monkey implements basicAnimal {
    public void speak() {
        System.out.println("hello");
    }

    @Override
    public void eat() {
        System.out.println("Eating.....");
    }

    @Override
    public void sleep() {
        System.out.println("sleeping.....");
    }
}

public class Java_39_Exercise_10_Abstract_Class_and_Interfaces {
    public static void main(String[] args) {

        // problem 1 and 2
        fountainPen p = new fountainPen();
        p.changeNib();
        p.write();
        p.refill();
        
        // problem 3 and 5
        human h = new human();
        h.eat();
        h.sleep();
        h.jump();
        h.bite();

        monkey m = new human();      // polymorphism
        m.jump();
        m.bite();
        // m.sleep();            ----> not allowed

        basicAnimal you = new human();
        // you.speak();          ----> not allowed
        you.eat();
        you.sleep();
    }
}
