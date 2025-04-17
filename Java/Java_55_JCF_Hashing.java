import java.util.HashSet;

public class Java_55_JCF_Hashing {
    public static void main(String[] args) {

        // Hashing:
        // 1. Hashing is a technique to convert a range of key values into a range of indexes.
        // 2. Basically, it decides which key-value pair will go at which index of the array.
        // 3. It uses a hash function.
        // 4. Hashing makes searching and insertion very fast.
        // 5. But hash collisions can also occur.

        // Hash Collision Techniques:
        // 1. Open Addressing: If an index is already filled, we insert the value in the next available index (linearly or by some rule).
        // 2. Chaining: If multiple values hash to the same index, we use a linked list at that index to store all values.

        // Hash Table:
        // 1. The array where we store these key-value pairs is called a Hash Table.
        // 2. Load Factor: When the table starts getting full, we create a new larger table and copy everything into it.
        // 3. Load Factor tells how full the table can get before resizing happens automatically.

        // Some Hash Class :
        // 1. Hash set
        // 2. Hash Map
        // 3. Linked HashMap
        // 4. Hash Table

        // Example:
        HashSet<Integer> myHashSet = new HashSet<>(6, 0.5f);
        myHashSet.add(6);
        myHashSet.add(8);
        myHashSet.add(6);
        myHashSet.add(3);
        myHashSet.add(11);
        System.out.println(myHashSet);
    }
}
