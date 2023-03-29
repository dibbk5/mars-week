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

        landing = landingCheck(4);

    }

    /**
     * Function name: landingCheck
     * 
     * @param minutesLeft (int)
     * 
     *                    Inside the function:
     *                    1. We count down minutes and return how to land.
     */
    public static boolean landingCheck(int minutesLeft) {
        int minute = 0;
        for (int i = minute; i <= minutesLeft; i++) {
            if (((i % 2) == 0) && ((i % 3) == 0)) {
                System.out.println("Keep Center");
            } else if (i % 2 == 0) {
                System.out.println("Right");
            } else if (i % 3 == 0) {
                System.out.println("Left");
            } else {
                System.out.println("Calculating");
            }
        }
        System.out.println("Landed");
        return false;
    }
}