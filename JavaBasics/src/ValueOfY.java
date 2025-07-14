import java.util.*;
public class ValueOfY
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        int x;
        double y,a,b;
        System.out.println("enter the value of x");
        x = sc.nextInt();
        a = Math.pow(x,1.0/6) + Math.pow(x,1.0/4) + Math.pow(x,1.0/2) + 10;
        b = Math.pow(x,1.0/5) + Math.pow(x,1.0/3) + x;
        y = a/b;
        System.out.println("value of y = " +y);
    }
}
