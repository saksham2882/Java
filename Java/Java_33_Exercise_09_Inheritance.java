class circle1 {
    public int radius;

    // circle1(){
    // System.out.println("I am non parameterized constructor");
    // }
    public circle1(int radius) {
        System.out.println("I am circle parameterized constructor");
        this.radius = radius;
    }

    public double area() {
        return Math.PI * this.radius * this.radius;
    }
}

class cylinder1 extends circle1 {
    public int height;

    public cylinder1(int radius, int height) {
        super(radius);
        System.out.println("I am cylinder1 parameterized constructor");
        this.height = height;
    }

    public double SurfaceArea() {
        return (2 * Math.PI * radius * height) + (Math.PI * radius * height);
    }
}

class rectangle2 {
    public int length;
    public int breadth;

    public int area() {
        return length * breadth;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    rectangle2() {
        System.out.println("I am not a rectangle2 parameterized constructor");
    }

    public rectangle2(int length, int breadth) {
        System.out.println("I am a rectangle2 parameterized constructor");
        this.length = length;
        this.breadth = breadth;
    }

}

class cube extends rectangle2 {
    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public int side;

    public cube() {
        System.out.println("I am a cube parameterized constructor");
    }

    public cube(int side) {
        this.side = side;
    }

    public int volume() {
        return side * side * side;
    }

    @Override
    public int area() {
        return side * side;
    }

}

public class Java_33_Exercise_09_Inheritance {
    public static void main(String[] args) {

        // problem 1 and 3
        circle1 objC = new circle1(5);
        cylinder1 obj = new cylinder1(3, 9);
        System.out.println("The radius of circle is: " + objC.radius);
        System.out.println("Area of Circle is: " + obj.area());
        System.out.println("Surface Area of Cylinder is: " + obj.SurfaceArea());

        // problem 2 and 4
        rectangle2 rec = new rectangle2();
        cube cu = new cube();
        rec.setLength(5);
        rec.setBreadth(13);
        cu.setSide(6);
        System.out.println("length of rectangle : " + rec.getLength());
        System.out.println("breadth of rectangle : " + rec.getBreadth());
        System.out.println("The side of cube is : " + cu.side);
        System.out.println("Area of cube is : " + cu.area());
        System.out.println("The volume of cube is: " + cu.volume());
    }
}
