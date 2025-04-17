import java.util.Random;
import java.util.Scanner;

class game {
    public int number;
    public int inputNumber;
    public int noOfGuesses = 0;

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

    game() {
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }

    void takeUserInput() {
        System.out.println("Guess the number");
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }

    boolean isCorrectNumber() {
        noOfGuesses++;
        if (inputNumber == number) {
            System.out.format("Yes! you guess the right number , it was %d\n You guessed it in %d attempt", number, noOfGuesses);
            return true;
        } 
        else if (inputNumber < number) {
            System.out.println("Too less....");
        } 
        else if (inputNumber > number) {
            System.out.println("Too high....");
        }
        return false;
    }
}

public class Java_26_Exercise_06_Guess_the_Number_Game {
    public static void main(String[] args) {

        /*
         * create a class game , which allows a user to play " guess the number " game
         * once
         * Game should have the following methods:
         * 1. constructor to take the random number
         * 2. takeUserInput() to take a user input of number
         * 3. isCorrectNumber() to detect whether the number entered by the user is true
         * 4. getters and setters for no.ofGuesses
         * Use properties such as no.ofGuesses(int) , etc to get this task done!
         */

        game g = new game();
        boolean b = false;
        while (!b) {
            g.takeUserInput();
            b = g.isCorrectNumber();
        }
    }
}
