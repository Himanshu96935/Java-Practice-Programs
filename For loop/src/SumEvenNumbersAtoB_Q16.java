import java.util.*;
public class SumEvenNumbersAtoB_Q16
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Starting number:");
        int a = sc.nextInt();
        System.out.println("Enter ending number:");
        int b = sc.nextInt();
        int i, s = 0;
        for (i =a; i <= b; i++)
        {
            if(i % 2 == 0)
            {
                s = s + i;
            }
        }
        System.out.println("Sum of even number: = " + s);
    }
}
