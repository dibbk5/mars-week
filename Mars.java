import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class Mars {
    public static void main(String[] args) {
        String colonyName = "Bobtown";
        int shipPopulation = 300;
        double meals = 4000.00;
        boolean landing = true;
        String landingLocation = "The Plain";

        meals = meals - (shipPopulation * 2) * .75;
        System.out.println(meals);
        // extra crate of food
        meals = meals * 1.5;
        // baby births
        shipPopulation += 5;

        if (landingLocation.equals("The Plain")) {
            System.out.println("Bbzzz Landing on the Plain");

        } else {
            System.out.println("ERROR!!! Flight plan already set. Landing on the Plain");
        }

    }

    /**
     * Function name: landingCheck
     * @param minutesLeft (int)
     * 
     * Inside the function:
     * 1. 
     */
    public static void landingCheck(int minutesLeft) {
        System.out.println(directions)
    }
}