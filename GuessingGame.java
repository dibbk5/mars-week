import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Guessing Game!");

        System.out.println("Please enter your name:");
        String playerName = scan.nextLine();

        scan.close();
    }
}
