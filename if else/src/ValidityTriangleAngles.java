import java.util.*;
public class ValidityTriangleAngles
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter 1st angles:");
        int a1 = sc.nextInt();
        System.out.println("enter 2nd angle:");
        int a2 = sc.nextInt();
        System.out.println("enter 3rd angle:");
        int a3 = sc.nextInt();

        if (a1 + a2 + a3 == 180 && a1 > 0 && a2 > 0 && a3 > 0)
        {
            System.out.println("Valid Triangle");
        }
        else {
            System.out.println("invalid triangle");
        }
    }
}
