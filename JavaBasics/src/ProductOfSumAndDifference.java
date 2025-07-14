import java.util.*;
public class ProductOfSumAndDifference
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        int a,b,sum,diff,product;
        System.out.println("enter a number");
        a = sc.nextInt();
        System.out.println("enter a number");
        b = sc.nextInt();
        sum = a+b;
        diff = a-b;
        product = (sum*diff);
        System.out.println("Product of sum and differences =" + product);

    }
}
