public class Mars {
    public static void main(String[] args) {
        String colonyName = "Bobtown";
        int shipPopulation = 300;
        double meals = 4000.00;
        boolean landing = true;

        meals = meals - (shipPopulation * 2) * .75;
        System.out.println(meals);
        // extra crate of food
        meals = meals * 1.5;

    }
}