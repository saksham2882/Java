class cylinder {
    private int radius;
    private int height;

    public cylinder() {
        radius = 0;
        height = 0;
    }

    public cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public void setRadius(int n) {
        radius = n;
    }

    public int getRadius() {
        return radius;
    }

    public void setHeight(int h) {
        height = h;
    }

    public int getHeight() {
        return height;
    }

    public double surfaceArea() {
        return (2 * Math.PI * radius * height) + (2 * Math.PI * radius * radius);
    }

    public double Volume() {
        return Math.PI * radius * radius * height;
    }
}

class rectangle1 {
    private int length;
    private int breadth;

    public rectangle1() {
        this.breadth = 5;
        this.length = 4;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }

    public rectangle1(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
}

public class Java_27_Exercise_07_constructor {
    public static void main(String[] args) {

        // Question 1
        cylinder cyl = new cylinder();
        cyl.setRadius(9);
        cyl.setHeight(12);
        System.out.println("Radius of cylinder is: " + cyl.getRadius());
        System.out.println("Height of cylinder is:  " + cyl.getHeight());
        System.out.println("Surface Area of cylinder is: " + cyl.surfaceArea());
        System.out.println("Volume of the cylinder is: " + cyl.Volume());

        // Question 2
        cylinder cy = new cylinder(9, 12);         // no use of setter
        System.out.println("\nRadius of cylinder is: " + cy.getRadius());
        System.out.println("Height of cylinder is:  " + cy.getHeight());
        System.out.println("Surface Area of cylinder is: " + cy.surfaceArea());
        System.out.println("Volume of the cylinder is: " + cy.Volume());

        // Question 3
        rectangle1 rect = new rectangle1(8, 6);
        System.out.println("\nlength of rectangle is: " + rect.getLength());
        System.out.println("breadth of rectangle is: " + rect.getBreadth());
    }
}