public class Java_15_break_and_continue {
    public static void main(String[] args) {

        // break
        for (int i = 1; i < 50; i++) {
            System.out.println("Java is Great");
            if (i == 3) {
                System.out.println("Ending the loop");
                break;
            }
        }

        // Continue
        for (int i = 1; i < 5; i++) {
            if (i == 3) {
                System.out.println("continue to next iteration");
                continue;
            }
            System.out.println(i);
            System.out.println("Java is Great");
        }
    }
}
