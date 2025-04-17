import java.util.*;

public class Java_53_JCF_LinkedList {
    public static void main(String[] args) {

        // Array:
        // 1. Insertion and deletion are difficult for large-size data.
        // 2. The biggest advantage of arrays is that you can access any element very
        // fast.

        // ArrayList:
        // 1. If the array is full and you want to insert a new element, in ArrayList
        // it's possible - it resizes automatically.
        // 2. Same goes for deletion.
        // 3. ArrayList is like an array but it's managed automatically internally.

        // LinkedList:
        // 1. Insertion and deletion are very fast compared to ArrayList.
        // 2. But accessing elements is slower.

        // ArrayList vs LinkedList:
        // 1. Both have similar properties, but not exactly the same.
        // 2. ArrayList uses arrays internally.
        // 3. LinkedList uses independent node objects.

        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();

        l2.add(111);
        l2.add(222);
        l2.add(333);

        l1.add(6);
        l1.add(7);
        l1.add(4);
        l1.add(6);
        l1.add(5);

        l1.addLast(12);
        l1.addFirst(4378);

        l1.add(0, 45);
        l1.add(0, 18);

        l1.addAll(0, l2);                    // addAll(): Insert all of the element in the specified collection into this list, starting at the specified position.

        // l1.clear();                             // clear(): Removes all of the element from this list.
        // System.out.println(l1.contains(3456));  // It return true if this list contains the specified element.

        System.out.println(l1.indexOf(6));       // Return the index of the first occurrence of the specified element in this list , or -1 if this list does not contain the element.
        System.out.println(l1.lastIndexOf(6));
        l1.set(1, 28);

        for (int i = 0; i < l1.size(); i++) {
            System.out.print(l1.get(i));
            System.out.print(", ");
        }
    }
}
