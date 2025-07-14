import java.util.*;
public class Sum10
{
    public static void  main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        int a,b;
        double sum;
        System.out.println("enter 1st number:");
        a = sc.nextInt();
        System.out.println("enter 2nd number:");
        b = sc.nextInt();
        sum = ((30.0/100)*a)+((30.0 /100)*b);
        System.out.println("Sum of 30% of each number = "+sum);
    }
}
