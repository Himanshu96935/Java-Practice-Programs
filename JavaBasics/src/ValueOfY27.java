import java.util.*;
public class ValueOfY27
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        int x;
        double y,a,b;
        System.out.println("enter the value for x:");
        x = sc.nextInt();
        a = Math.pow(x,6)+Math.pow(x,4)+Math.pow(x,2)+10;
        b = Math.pow(x,5)+Math.pow(x,3)+x;
        y = a/b;
        System.out.println("VALUE OF Y =" +y);
    }
}
