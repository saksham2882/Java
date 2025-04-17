class MyThr1 extends Thread {
    public MyThr1(String name) {
        super(name);
    }

    public void run() {
        int i = 0;
        while (i < 50) {
            System.out.println("Thank you " + this.getName());
            i++;
        }
    }
}

public class Java_44_Thread_priorities {
    public static void main(String[] args) {
        MyThr1 t1 = new MyThr1("Saksham (Most Important) ");
        MyThr1 t2 = new MyThr1("Rahul");
        MyThr1 t3 = new MyThr1("Riya");
        MyThr1 t4 = new MyThr1("Ram");
        MyThr1 t5 = new MyThr1("Jack");

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        t5.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
