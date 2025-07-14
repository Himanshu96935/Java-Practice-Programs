import java.util.*;
public class DescendingOrder17
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter 1st no:");
        int a = sc.nextInt();
        System.out.println("enter 2nd no:");
        int b = sc.nextInt();
        System.out.println("enter 3rd no:");
        int c = sc.nextInt();
        int biggest , middle , smallest;

        if (a >= b && a >= c)
        {
            biggest = a;
            if (b >= c)
            {
                middle = b;
                smallest = c;
            }
            else {
                middle = c;
                smallest = b;
            }
        }
        else if (b >= a && b >= c)
        {
            biggest = b;
            if (a >= c)
            {
                middle = a;
                smallest = c;
            }
            else {
                middle = c;
                smallest = a;
            }
        }
        else {
            biggest = c;
            if (b >= c)
            {
                middle = b;
                smallest = a;
            }
            else {
                middle = a;
                smallest = b;
            }
        }
        System.out.println("Descending Order:" + biggest + ">" + middle + ">" + smallest);
    }
}
