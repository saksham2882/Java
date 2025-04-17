class Employee {
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }
}

class Cellphone {
    public void ring() {
        System.out.println("Ringing......");
    }

    public void vibrate() {
        System.out.println("Vibrating......");
    }

    public void callfriend() {
        System.out.println("Calling Mohit......");
    }
}

class Square {
    int side;

    public int area() {
        return side * side;
    }

    public int perimeter() {
        return 4 * side;
    }
}

class Rectangle {
    int length;
    int width;

    public int area() {
        return length * width;
    }

    public int perimeter() {
        return 2 * (length + width);
    }
}

public class Java_23_Exercise_05_Class_and_method {
    public static void main(String[] args) {

        // problem 1
        Employee Tom = new Employee();
        Tom.setName("Tom Cruise");
        Tom.salary = 98000;
        System.out.println(Tom.getName());
        System.out.println("The salary of " + Tom.getName() + " is : " + Tom.getSalary());

        // problem 2
        Cellphone samsung = new Cellphone();
        samsung.callfriend();
        samsung.ring();
        samsung.vibrate();

        // problem 3
        Square sq = new Square();
        sq.side = 9;
        System.out.println("The area of square is: " + sq.area());
        System.out.println("The perimeter of square is: " + sq.perimeter());

        // problem 4
        Rectangle rec = new Rectangle();
        rec.length = 6;
        rec.width = 4;
        System.out.println("The area of rectangle is: " + rec.area());
        System.out.println("The perimeter of rectangle is: " + rec.perimeter());
    }
}