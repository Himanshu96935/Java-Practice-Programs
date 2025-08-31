import java.util.*;
public class BicycleRentPay_7
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter season: (spring / summer / winter / rainy) : ");
        String season = sc.next().toLowerCase();

        System.out.println("Enter number of cycles hired:");
        int cycles = sc.nextInt();

        System.out.println("Enter number of days:");
        int days = sc.nextInt();

        double rate = 0;

        switch (season)
        {
            case "spring":
                rate = 5;
                break;
            case "summer":
                rate = 8;
                break;
            case "winter":
                rate = 3;
                break;
            case "rainy":
                rate = 10;
                break;
            default:
                System.out.println("Entered Invalid Season!");
                return;
        }
        double bill = cycles * rate * days;

        if (days > 30) {
            bill = bill - (0.25 * bill);
        }

        System.out.println("Total amount to be pay = " + bill);
    }
}
