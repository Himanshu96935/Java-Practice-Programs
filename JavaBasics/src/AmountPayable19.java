import java.util.*;
public class AmountPayable19
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        int AP;
        double dis1,dis2;
        System.out.println("enter amount of purchase:");
        AP = sc.nextInt();
        dis1 = AP-((50.0/100)*AP);
        dis2 = dis1-((40.0/100)*dis1);
        System.out.println("Amount Payable = "+dis2);
    }
}
