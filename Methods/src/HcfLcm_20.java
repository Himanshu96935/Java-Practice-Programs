// enter 2 numbers and print their hcf and lcm.
import java.util.*;
public class HcfLcm_20
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 2 numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Hcf = " + hcfOf(a,b) + "  Lcm = " + lcmOf(a,b));
    }
    public static int hcfOf(int a, int b)
    {
        while(b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }

    public static double lcmOf(int a, int b)
    {
        double lcm = (a * b) / hcfOf(a,b);
        return lcm;
    }
}
