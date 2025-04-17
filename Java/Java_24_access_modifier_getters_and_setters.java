class myEmployee {
    private int id;                     // private means no one edit it from outside
    private String name;

    public String getName() {           // getters
        return name;
    }

    public void setName(String n) {     // setters
        name = n;                       // this.name = n;
    }

    public void setId(int i) {
        id = i;                         // this.id = i;
    }

    public int getId() {
        return id;
    }
}

class circle {
    private int radius;
    private int area;

    public void setRadius(int i) {
        radius = i;
    }

    public int getRadius() {
        return radius;
    }

    public void setArea(int a) {
        area = a;
    }

    public float getArea() {
        return 2 * 3.14f * radius;
    }
}

public class Java_24_access_modifier_getters_and_setters {
    public static void main(String[] args) {

        myEmployee saksham = new myEmployee();
        // saksham.id = 28;
        // saksham.name = "Saksham_Agrahari";         // Throws an error due to private access
        // modifier
        saksham.setName("Saksham_Agrahari");
        saksham.setId(28);
        System.out.println(saksham.getName());
        System.out.println(saksham.getId());

        // Practice 1
        circle c = new circle();
        c.setRadius(6);
        c.getArea();
        System.out.println("The radius of circle is : " + c.getRadius());
        System.out.println("The area of circle is : " + c.getArea());
    }
}
