import java.util.*;
public class AreaOfTriangle12
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        int a,b,c;
        double s,Area;
        System.out.println("enter the first side");
        a = sc.nextInt();
        System.out.println("enter the second side");
        b = sc.nextInt();
        System.out.println("enter the third side");
        c = sc.nextInt();
        s = (a+b+c)/2.0;
        Area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area of triangle = " +Area);

    }
}
