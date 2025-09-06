import java.util.*;
public class AscendingOrder
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a, b, c, big, small, mid;
        System.out.println("enter three number");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        big = biggest(a,b,c);
        mid = middle(a,b,c);
        small = smallest(a,b,c);
        System.out.println("Ascending order: " + small + " < " + mid + " < " + big);
    }

    public static int biggest(int a, int b, int c)
    {
        int big;
        if (a > b && a > c) {
            big = a;
        } else if (b > c) {
            big = b;
        } else {
            big = c;
        }
        return big;
    }

    public static int smallest(int a, int b, int c)
    {
        int small;
        if (a < b && a < c) {
            small = a;
        } else if (b < c) {
            small = b;
        } else {
            small = c;
        }
        return small;
    }

    public static int middle (int a, int b, int c)
    {
        int big = biggest(a,b,c);
        int small = smallest(a,b,c);
        return ((a+b+c) - (big + small));
    }
}
