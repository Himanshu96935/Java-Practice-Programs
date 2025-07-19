import java.util.*;
public class CycleBillPay23
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter no of cyles : ");
        int cycle = sc.nextInt();
        System.out.println("Enter no of days : ");
        int days = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter season (spring/winter/summer/rainy) : ");
        String season = sc.nextLine().toLowerCase();

        double rate = 0;

        if (season.equals("spring")) {
            rate = 5;
        } else if (season.equals("summer")) {
            rate = 8;
        } else if (season.equals("winter")) {
            rate = 3;
        } else if (season.equals("rainy")) {
            rate = 10;
        } else {
            System.out.println("invalid season entered");
        }

        double bill = cycle * days * rate;

        if (days > 30) {
            bill = 75/100.0 * (bill);
        }

        System.out.println("total bill = " + bill);

    }
}
