import java.util.*;
public class AmountInRupees37
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the amount in rupees:");
        int amt = sc.nextInt();

        int thosand = amt/1000;
        amt = amt%1000;

        int fiveHundred = amt/500;
        amt = amt%500;

        int hundred = amt/100;
        amt = amt%100;

        int one = amt/1;
        amt = amt%1;

        System.out.println("No of 1000 rupee notes:"+thosand);
        System.out.println("No of 500 rupee notes:"+fiveHundred);
        System.out.println("No of 100 rupee notes:"+hundred);
        System.out.println("No of 1 rupee notes:"+one);
    }
}
