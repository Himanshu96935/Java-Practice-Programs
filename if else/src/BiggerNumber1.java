import java.util.*;
public class BiggerNumber1
{
    public static  void main (String args[])
    {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter 1st number:");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number:");
        int b = sc.nextInt();

        if(a>b)
        {
            System.out.println("bigger number = "+a);
        }
        else
        {
            System.out.println("bigger number = "+b);
        }
    }
}
