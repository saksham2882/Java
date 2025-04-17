import java.util.ArrayDeque;

public class Java_54_JCF_ArrayDequeue {
    public static void main(String[] args) {

        // ArrayDeque (Array Dequeue):
        // 1. It's like a Double Ended Queue where insertion and deletion can be done from both ends.
        // 2. A common question is: what should be the array size and where to insert first?
        // 3. The answer is: ArrayDeque internally handles all this automatically.
        // You just need to tell it whether you want to insert from the front or the end.

        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(4);
        ad1.add(34);
        ad1.add(56);
        ad1.add(45);
        ad1.addFirst(982);
        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());
        System.out.println(ad1);

        // see documentation for more methods.
    }
}
