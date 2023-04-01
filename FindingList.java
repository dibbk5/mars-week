import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FindingList {
    public FindingList() {
        // Thread.sleep(500);
        System.out.println("Welcome back from your expidition");

        ArrayList<String> rockArray = new ArrayList<String>();
        rockArray.add("rock");
        rockArray.add("weird rock");
        rockArray.add("smooth rock");
        rockArray.add("not rock");

        System.out.println("Below are the rocks that you found");
        for (int i = 0; i < rockArray.size(); i++) {
            System.out.println(rockArray.get(i));
        }

        System.out.println("It looks like there is a non rock in the pile. This will have to be removed");
        rockArray.remove(3);

        System.out.println("Below is the new list of rocks");
        System.out.println(rockArray);

        Map<String, String> fossils = new HashMap<>();
        fossils.put("Bird Fossil", "The fossil has wings implying it was capable of flight.");
        fossils.put("Fish Fossil", "The fossil is vaguely fish shaped implies there was once water.");
        fossils.put("Tooth Fossil", "The tooth from an unknown fossil.");

        System.out.println("Fossil data downloaded");

        System.out.println("Which of the fossils would you like to learn more about? (Bird, Fish or Tooth)");
        Scanner scan = new Scanner(System.in);
        String fossilChoice = scan.nextLine();

        if (fossilChoice.equalsIgnoreCase("Bird")) {
            System.out.println("Here is the information about the Bird fossil. " + fossils.get("Bird Fossil"));
        } else if (fossilChoice.equalsIgnoreCase("Fish")) {
            System.out.println("Here is the information about the Fish fossil. " + fossils.get("Fish Fossil"));
        } else if (fossilChoice.equalsIgnoreCase("Tooth")) {
            System.out.println("Here is the information about the Tooth fossil. " + fossils.get("Tooth Fossil"));
        } else {
            System.out.println("Please enter the fossil names provided. (Bird, Fish, Tooth)");
        }

        scan.close();

        Set<String> supplies = new HashSet<>();
        supplies.add("Toilet Paper");
        supplies.add("Water");
        supplies.add("Steak");

        System.out.println("Supplies Before Expidition");
        for (String s : supplies) {
            System.out.println(s);
        }

        supplies.remove("Toilet Paper");

        System.out.println("Supplies After Expidition");
        for (String s : supplies) {
            System.out.println(s);
        }

    }
}
