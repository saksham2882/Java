class MyNewThread1 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 40) {
            System.out.println("Hi");
            try {
                Thread.sleep(455);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            i++;
        }
    }
}

class MyNewThread2 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 30) {
            System.out.println("Good Bye!");
            i++;
        }
    }
}

public class Java_45_Thread_methods {
    public static void main(String[] args) {
        MyNewThread1 t1 = new MyNewThread1();
        MyNewThread2 t2 = new MyNewThread2();
        t1.start();

        // try {
        //     t1.join();                // try to first run t1 then t2
        // } catch (Exception e) {
        //     System.out.println(e);
        // }

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        System.out.println(t2.getState());
        t2.start();

        System.out.println(t2.getState());
        System.out.println(Thread.currentThread().getState());
    }
}
