import java.util.*;
public class CostOfNshirt
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        double cost,price;
        int N;
        System.out.println("enter the cost of 1 shirt");
        cost = sc.nextDouble();
        System.out.println("enter the no. of shirts");
        N = sc.nextInt();
        price = N * cost;
        System.out.println("Final Price = "+price);
    }
}
