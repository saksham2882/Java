import java.util.*;

class MyGenerics<T1, T2> {
    int val;
    private T1 t1;
    private T2 t2;

    public T2 getT2() {
        return t2;
    }

    public void setT2(T2 t2) {
        this.t2 = t2;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public T1 getT1() {
        return t1;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }

    public MyGenerics(int val, T1 t1, T2 t2) {
        this.val = val;
        this.t1 = t1;
        this.t2 = t2;
    }
}

public class Java_59_Generics {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();     // Here Integer is a Generics.
        // ArrayList<int> myList = new ArrayList<>();      // This is not allows. It shows an error.
        
        // myList.add("str");
        myList.add(54);
        myList.add(643);
        // myList.add(new Scanner(System.in));

        int a = myList.get(1);
        // System.out.println(a);

        @SuppressWarnings({ "unchecked", "rawtypes" })
        MyGenerics<String, Integer> g1 = new MyGenerics(23, "MyString is good ", 455);      // creating generics method
        String str = g1.getT1();
        Integer Int1 = g1.getT2();
        System.out.println(str + Int1);
    }
}