import java.util.*;
public class BiggestAndSecondBiggestNumber_Q26
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter a number:");
        int n1 = sc.nextInt();
        System.out.println("enter a number:");
        int n2 = sc.nextInt();
        int big, sBig, n;
        if (n1 > n2) {
            big = n1;
            sBig = n2;
        } else {
            big = n2;
            sBig = n1;
        }
        for (int i = 1; i <= 998; i++)
        {
            System.out.println("enter a number:");
            n = sc.nextInt();
            if (n > big) {
                sBig = big;
                big = n;
            } else if (n > sBig) {
                sBig = n;
            }
        }
        System.out.println("Biggest Number = " + big);
        System.out.println("Second Biggest Number = " + sBig);
    }
}
