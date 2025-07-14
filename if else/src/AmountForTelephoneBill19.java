import java.util.*;
public class AmountForTelephoneBill19
{
    public static void main (String args [])
    {
        Scanner sc = new Scanner (System.in);

        System.out.println("enter no. of calls:");
        int calls = sc.nextInt();
        double bill;

        if (calls <= 100)
        {
            bill = 100;
        }
        else if (calls <= 250)
        {
            bill = 100 + (calls - 100) * 1.25;
        }
        else if (calls <= 450)
        {
            bill = 100 + (150 * 1.25) + (calls - 250) *1.75;
        }
        else {
            bill = 100 + (150 * 1.25) + (200 * 1.75) + (calls - 450) * 2.25;
        }
        System.out.println("Telephone Bill = Rs " + bill);
    }
}
