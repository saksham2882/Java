class MyMainEmployee {
    private int id;
    private String name;

    public MyMainEmployee() {                                 // Non-parametric constructor  
        id = 8;
        name = "XYZ";
    }

    public MyMainEmployee(String my_name, int my_Id) {        // Parametric constructor
        name = my_name;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public void setId(int i) {
        id = i;
    }

    public int getId() {
        return id;
    }
}

public class Java_25_constructors {
    public static void main(String[] args) {

        // constructor automatic call (run)
        // MyMainEmployee saksham = new MyMainEmployee();  

        MyMainEmployee saksham = new MyMainEmployee("Programming_with_saksham", 28);
        // saksham.setName("Saksham_Agrahari");       // if we don't give setter so constructors automatic call
        
        saksham.setId(8);
        System.out.println(saksham.getId());
        System.out.println(saksham.getName());
    }
}
