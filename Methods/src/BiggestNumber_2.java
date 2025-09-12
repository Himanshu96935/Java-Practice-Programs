import java.util.*;
public class BiggestNumber_2
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter three numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int big = biggestOf(a,b,c);
        System.out.println("Biggest : " + big);
    }

    // Methods to find the biggest of three number:
    public static int biggestOf(int a, int b, int c)
    {
        if (a > b && a > c) {
            return a;
        } else if (b > c) {
            return b;
        } else {
            return c;
        }
    }
}
