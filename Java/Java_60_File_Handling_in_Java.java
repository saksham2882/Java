import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Java_60_File_Handling_in_Java {
    public static void main(String[] args) {

        // create a new file.
        File myFile = new File("Java_60_Sample_file.txt");    // a file object
        try {
            myFile.createNewFile();
        } catch (IOException e) {
            System.out.println("Unable to create this file");
            throw new RuntimeException(e);
        }


        // write to a file.
        try {
            FileWriter myFileWriter = new FileWriter("Java_60_Sample_file.txt");
            myFileWriter.write("This is our first file from this java course.\nOkay now bye bye.");
            myFileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        // Reading a file :
        File myFile1 = new File("Java_60_Sample_file.txt");
        try {
            Scanner sc = new Scanner(myFile1);
            while (sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }



        // Delete A file:
        // File myFile = new File("Java_60_Sample_file.txt");
        // if(myFile.delete()){
        //     System.out.println("I have deleted: " + myFile.getName());
        // }
        // else {
        //     System.out.println("Some Problem occurred while deleting the file.");
        // }
    }
}
