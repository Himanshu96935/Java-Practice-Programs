public class FarmsRequired31
{
    public static void main(String[] args)
    {


        double milkPerCowPerDay = 5.0;
        double fodderPerCowPerDay = 4.0;
        double fodderProducedPerFarmPerYear = 400.0;
        double milkNeededPerPersonPerDay = 0.5;
        int totalPeople = 10000000;
        int daysInYear = 365;


        double milkNeededPerDay = totalPeople * milkNeededPerPersonPerDay;
        double cowsNeeded = milkNeededPerDay / milkPerCowPerDay;

        double fodderNeededPerCowPerYear = fodderPerCowPerDay * daysInYear;
        double totalFodderNeeded = cowsNeeded * fodderNeededPerCowPerYear;

        double farmsNeeded = totalFodderNeeded / fodderProducedPerFarmPerYear;


        System.out.println("Number of farms required: " + (int)farmsNeeded);
    }
}

