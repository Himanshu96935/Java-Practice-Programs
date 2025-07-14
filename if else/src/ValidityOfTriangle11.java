import java.util.*;
public class ValidityOfTriangle11
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter 1st side of triangle:");
        int s1 = sc.nextInt();
        System.out.println("enter 2nd side of triangle:");
        int s2 = sc.nextInt();
        System.out.println("enter 3rd side of the triangle:");
        int s3 = sc.nextInt();

        if (s1+s2>s3 && s2+s3>s1 && s3+s1>s2)
        {
            System.out.println("Triangle is valid");
        }
        else
        {
            System.out.println("not a valid triangle");
        }
    }
}
