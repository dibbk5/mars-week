import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Random;

public class GuessingGame {
    public GuessingGame() {
        Scanner scan = new Scanner(System.in);
        Random randomNumber = new Random();

        System.out.println("Welcome to the Guessing Game!");
        System.out.println("Please enter your name:");
        String playerName = scan
                .nextLine();
        System.out.println("Hello " + playerName + " ,time to guess a number between 1 and 100");

        int correctNumber = randomNumber.nextInt(100);
        int attempts = 0;
        // System.out.println(correctNumber);
        while (true) {
            int guess;
            try {
                guess = scan.nextInt();
            } catch (InputMismatchException e) {
                scan.next();
                System.out.println("That's not an integer, try again.");
                continue;
            }

            if (guess < 1 || guess > 100) {
                System.out.println("Enter a valid number between 1 and 100");
                continue;
            }

            attempts += 1;

            if (guess < correctNumber) {
                System.out.println("You are too low!");
            } else if (guess > correctNumber) {
                System.out.println("You are too high");
            } else {
                System.out.println(
                        "You guessed it correctly, it only took you " + attempts + " tries to guess it correctly");
                break;
            }

        }
        scan.nextLine();

        // scan.close();

    }

}
