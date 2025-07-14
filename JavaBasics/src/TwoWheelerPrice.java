import java.util.*;
public class TwoWheelerPrice
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        int MP;
        double discount,Total;
        System.out.println("enter the marked price");
        MP = sc.nextInt();
        System.out.println("enter the discount offer on 2 wheeler");
        discount = sc.nextDouble();
        Total = (MP - ((discount/100)*MP));
        System.out.println("After discount two wheeler cost = " + Total);
    }
}
