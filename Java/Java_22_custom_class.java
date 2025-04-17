class Employee1 {
    int id;
    String name;
    int salary;

    public void printDetail() {
        System.out.println("My Id is " + id);
        System.out.println("and My name is " + name);
        System.out.println("and My salary is: " + salary);
    }
}

public class Java_22_custom_class {
    public static void main(String[] args) {

        System.out.println("This is our custom class");
        Employee1 saksham = new Employee1();             // Instantiating a new employee object
        Employee1 rahul = new Employee1();

        /* setting properties (attributes) */
        saksham.id = 8;
        saksham.name = "Saksham_Agrahari";
        saksham.salary = 500000;

        rahul.id = 7;
        rahul.name = "rahul_tiwari";
        rahul.salary = 400000;

        // printing attributes
        saksham.printDetail();
        rahul.printDetail();
        System.out.println(saksham.id);
        System.out.println(saksham.name);
    }
}
