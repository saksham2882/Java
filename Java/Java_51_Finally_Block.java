public class Java_51_Finally_Block {

    // finally :- finally block contains the code which is always executed whether the exception is handled or not.

    public static int greet(){
        try{
            int a = 8;
            int b = 4;
            // int b = 0;
            int c = a/b;
            return c;
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("Cleaning up resources.... This is the end of this function");
        }
        System.out.println("This statement without finally keywords.");
        return -1;
    }

    public static void main(String[] args) {
        int k = greet();
        System.out.println(k);

        int a = 7;
        int b = 9;
        while (true){
            try{
                System.out.println(a/b);
            }
            catch(Exception e){
                System.out.println(e);
                break;
            }
            finally {
                System.out.println("I am Finally for value of b = " + b);
            }
            b--;
        }

        try{
            System.out.println(5/0);
            System.out.println(5/2);
        }
        finally {
            System.out.println("Yes this is finally");
        }
    }
}
