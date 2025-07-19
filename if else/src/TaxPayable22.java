import java.util.*;
public class TaxPayable22
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter net yearly income:");
        int netYearlyInc = sc.nextInt();
        double taxPay;

        if (netYearlyInc <= 250000) {
            taxPay = 0;
        }
        else if (netYearlyInc <= 500000) {
            taxPay = (10 / 100.0) * (netYearlyInc - 250000);
        }
        else if (netYearlyInc <= 1000000) {
            taxPay = 25000 + (20 / 100.0) * (netYearlyInc - 500000);
        }
        else {
            taxPay = 125000 + (30 / 100.0) * (netYearlyInc - 1000000);
        }
        System.out.println("tax pay = Rs " + taxPay);

    }
}
