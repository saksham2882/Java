class MyThreadRunnable1 implements Runnable{
    public void run() {
        int i = 0;
        while (i < 40) {
            System.out.println("I am a thread 1.");
            i++;
        }
    }
}
class MyThreadRunnable2 implements Runnable{
    public void run(){
        int i = 0;
        while (i < 40) {
            System.out.println("I am a thread 2.");
            i++;
        }
    }
}
public class Java_42_Thread_by_runnable_interface {
    public static void main(String[] args) {
        MyThreadRunnable1 h1 = new MyThreadRunnable1();
        Thread th1 = new Thread(h1);

        MyThreadRunnable2 h2 = new MyThreadRunnable2();
        Thread th2 = new Thread(h2);

        th1.start();
        th2.start();

        // concurrent process
    }
}
