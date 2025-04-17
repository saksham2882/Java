import java.util.*;

public class Java_52_JCF_ArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>(5);

        l2.add(111);
        l2.add(222);
        l2.add(333);

        l1.add(6);
        l1.add(7);
        l1.add(4);

        l1.add(6);
        l1.add(5);
        l1.add(0, 45);
        l1.add(0, 18);
        l1.addAll(0, l2); 
        // addAll(): Insert all of the element in the specified collection into this list, starting at the specified position.

        // l1.clear();                                // clear(): Removes all of the element from this list.
        // System.out.println(l1.contains(3456));     // It return true if list contains the specified element.

        System.out.println(l1.indexOf(6));          // Return the index of the first occurrence of the specified element in this list , or -1 if this list does not contain the element.
        System.out.println(l1.lastIndexOf(6));      // return from last index
        l1.set(1, 28);                  // change given index value

        for (int i = 0; i < l1.size(); i++) {
            System.out.print(l1.get(i));              // get(): Return the element at the specified position in this list.
            System.out.print(", ");
        }
    }
}
