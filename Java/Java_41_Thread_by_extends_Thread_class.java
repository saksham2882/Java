class MyThread1 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 40) {
            System.out.println("thread1 for walking");
            System.out.println("I am happy!");
            i++;
        }
    }
}

class MyThread2 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 40) {
            System.out.println("Thread2 for chatting");
            System.out.println("I am sad!");
            i++;
        }
    }
}

public class Java_41_Thread_by_extends_Thread_class {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();
        // both start at the same time - Thread1 runs for a bit, then Thread2 runs (one after the other) -> this is concurrency
        // both run truly at the same time on different CPU cores -> this is parallelism

    }
}
