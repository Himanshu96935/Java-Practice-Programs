import java.util.*;
public class CheckBiggestisPrime_Q58
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("enter 20 numbers");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int big;

        if (a > b) {
            big = a;
        } else {
            big = b;
        }

        for (int i = 1; i <= 18; i++)
        {
            int n = sc.nextInt();
            if (n > big) {
                big = n;
            }

        }

        int count = 0;

        for (int j = 1; j <= big; j++)
        {
            if (big % j == 0)
            {
                count++;
            }
        }

        if (count == 2) {
            System.out.println("Biggest number = " + big + " is prime");
        } else {
            System.out.println("Biggest number = " + big + " is not prime");
        }
    }
}
