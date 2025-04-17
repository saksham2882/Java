public class Java_19_Method_Overloading {

    static void foo() {
        System.out.println("Good morning bro!");
    }

    static void foo(int a) {
        System.out.println("Good Morning " + a + " bro!");
    }

    static void foo(int a, int b) {
        System.out.println("Good Morning " + a + " bro!");
        System.out.println("Good Morning " + b + " bro!");
    }

    // static int foo(int a , int b){                       // show an error
    // System.out.println("Good Morning " + a +" bro!");
    // System.out.println("Good Morning " + b +" bro!");
    // return 3;
    // }

    static int foo(int a, int b, int c) {                   // correct
        System.out.println("Good Morning " + a + " bro!");
        System.out.println("Good Morning " + b + " bro!");
        System.out.println("Good Morning " + c + " bro!");
        return 3;
    }

    static void change(int a) {
        a = 98;
    }

    static void change2(int[] arr) {
        arr[0] = 98;
    }

    static void tellJoke() {
        System.out.println("I invented a new word!\n" + "Plagiarism!");
    }

    public static void main(String[] args) {

        tellJoke();

        // Case 1: changing the integer
        int x = 45;
        change(x);
        System.out.println("The value of x after running change is :" + x);

        // Case 2: changing the array
        int[] marks = { 65, 95, 89, 85, 96 };
        change2(marks);
        System.out.println("The value of marks after running change is :" + marks[0]);

        foo();
        foo(28);
        foo(30, 60);   // here 30 and 60 are Arguments (Arguments are actual)
        x = foo(20, 40, 30);
        System.out.println(x);
    }
}