class MyThr extends Thread {
    public MyThr(String name) {
        super(name);
    }

    public void run() {
        int i = 0;
        while (i < 30) {
            System.out.println("I am a thread");
            i++;
        }
    }
}

public class Java_43_Thread_constructor {
    public static void main(String[] args) {
        MyThr t1 = new MyThr("Saksham");
        MyThr t2 = new MyThr("Rahul");

        t1.start();
        t2.start();

        System.out.println(t1.getName());
        System.out.println(t2.getName());
    }
}