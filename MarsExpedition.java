import java.util.Scanner;

public class MarsExpedition {

    public MarsExpedition() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome aboard the expidition \n This is your mars expidition.");
        // Ask for Name
        System.out.println("What is your name? Please enter it below.");
        String userName = scan.nextLine();

        // Great and ask if they want to proceed
        System.out.println("Hi" + userName
                + " - Welcome to the Expedition prep program. Are you ready to head out into the new world? \n Type Y or N");
        String inputCheck = scan.nextLine();

        // Answer their proceed
        if (inputCheck.equals("Y")) {
            System.out.println("I knew you would say that. You are team leader for a reason.");
        } else {
            System.out.println("Too bad you are team leader. You have to go.");
        }

        // Ask how many team members
        System.out.println("How many people do you want on your team");
        int teamNumber = scan.nextInt();
        scan.nextLine();

        // Get team members to 2
        if (teamNumber > 2) {
            System.out.println("That's way to many people. We can only send 2 more members.");
            teamNumber = 2;
        } else if (teamNumber < 2) {
            System.out.println("That is not enough team members. The perfect amount is 2");
            teamNumber = 2;
        } else {
            System.out.println("Wow! That's the perfect number of team members");
        }

        // Get Snack Choice
        System.out.println(
                "Now for the important part\nYou are allowed to bring one snack with you. What do you want to bring?");
        String snackChoice = scan.nextLine();
        System.out.println("Nice choice, you will be bringing " + snackChoice + " with you.");

        // Pick your vehicle
        System.out.println(
                "Now choose your vehicle from the list. Please chose the vehicle using the number associated with the vehicle\n1. Van\n2. Taxi\n3. Police Car\n4. Bus");
        int vehicleChoice = scan.nextInt();
        String finalVehicle = "";

        switch (vehicleChoice) {
            case 1:
                finalVehicle = "Van";
                break;
            case 2:
                finalVehicle = "Taxi";
                break;
            case 3:
                finalVehicle = "Police Car";
                break;
            case 4:
                finalVehicle = "Bus";
                break;
        }

        System.out.println("Wow! You have put together quite the team." +
                "\nYou, " + userName + " decided to take " + teamNumber + " people on your team." +
                "\nYou brought " + snackChoice + " as your snack for your team." +
                "\nLast but not least, you decided to drive a " + finalVehicle + " as your expidition vehicle." +
                "\n\n Wow! I hope you survive");

    }

}
