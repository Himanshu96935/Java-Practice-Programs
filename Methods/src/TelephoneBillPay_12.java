import java.util.*;
public class TelephoneBillPay_12
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter number of calls:");
        int c = sc.nextInt();
        double bill = amountPay (c);
        System.out.println("Amout pay for calls = Rs " + bill);
    }

    public static double amountPay (int c)
    {
        double pay;
        if (c <= 100) {
            pay = 100;
        } else if (c <= 250) {
            pay = 100 + ((c - 100) * 1.25);
        } else if (c <= 450) {
            pay = 100 + (150 * 1.25) + ((c - 250) * 1.75);
        } else {
            pay = 100 + (150 * 1.25) + (200 * 1.75) + ((c - 450) * 2.25);
        }
        return pay;
    }
}
