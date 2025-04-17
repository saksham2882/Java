public class Java_17_Array_1D_and_2D {
     public static void main(String[] args) {

        // ways to create an array in java
        // 1. declaration and memory allocation
        // int[] marks = new int[5];

        // 2. declaration and then memory allocation
        int[] marks;
        marks = new int[5];
        // initialization
        marks[0] = 100;
        marks[1] = 90;
        marks[2] = 86;
        marks[3] = 76;
        marks[4] = 98;
        System.out.println(marks);

        // 3. declaration , memory allocation and initialization together
        float[] mark = { 100.5f, 90.5f, 86.0f, 76.5f, 98.0f };
        System.out.println(mark[2]);

        // displaying the array using for each loop
        System.out.println("Printing using for each loop ");
        for (int i : marks) {
                System.out.println(i);
        }

        
        // multi-dimension (2D Array)
        int[][] flats;
        flats = new int[2][3];
        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][0] = 201;
        flats[1][1] = 202;
        flats[1][2] = 203;

        // Displaying of 2D Array
        System.out.println("Printing a 2D array using for loop");
        for (int[] flat : flats) {
            for (int i : flat) {
                System.out.print(i);
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}
