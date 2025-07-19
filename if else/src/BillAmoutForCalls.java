import java.util.*;
public class BillAmoutForCalls
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter no. of calls: ");
        int calls = sc.nextInt();
        double bill;

        if (calls <= 180)
        {
            bill = 400;
        }
        else if (calls <= 500)
        {
            bill = 400 + (calls - 180) * 1.33;
        }
        else if (calls <=1500)
        {
            bill = 400 + (320 * 1.33) + (calls - 500) * 1.80;
        }
        else {
            bill = 400 + (320 * 1.33) + (1000 * 1.80) + (calls - 1500) * 0.80;
        }
        System.out.println("Calls Bill to be pay = " + bill);
    }
}
