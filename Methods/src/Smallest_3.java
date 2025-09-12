import java.util.*;
public class Smallest_3
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a, b, c, small;
        System.out.println("Enter three numbers:");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        small = smallestOf(a, b, c);
        System.out.println("smallest : " + small);
    }

    public static int smallestOf(int a, int b, int c)
    {
        if (a < b && a < c) {
            return a;
        } else if (b < c) {
            return b;
        } else {
            return c;
        }
    }
}
