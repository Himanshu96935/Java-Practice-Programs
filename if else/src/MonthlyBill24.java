import java.util.*;
public class MonthlyBill24
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter units of electricity consumed : ");
        int unit = sc.nextInt();
        double bill;

        if (unit <= 150) {
            bill = 50 + (unit * 1.25);
        } else if (unit <= 300) {
            bill = 50 + (150 * 1.25) + (unit - 150) * 1.65;
        } else {
            bill = 50 + (150 * 1.25) + (150 * 1.65) + (unit - 300) * 2.25;
        }

        System.out.println("Monthly bill = RS " + bill);
    }
}
