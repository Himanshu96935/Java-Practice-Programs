import java.util.*;
public class SumProductDifference9
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        int a,b,c,sum,product,diff;
        System.out.println("enter 1st number:");
        a=sc.nextInt();
        System.out.println("enter 2nd number:");
        b=sc.nextInt();
        System.out.println("enter 3rd number:");
        c=sc.nextInt();
        sum = (a+b+c);
        product = (a*b*c);
        diff = (a-b-c);
        System.out.println("SUM = "+sum+ " PRODUCT = " +product+ " DIFFERENCE = "+diff);
    }
}
