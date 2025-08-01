import java.util.*;
public class BiggestAndSmallestNumber_Q25
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int big = n, small = n;
        for (int i = 1; i <= 999; i++)
        {
            System.out.println("Enter a number:");
            n = sc.nextInt();
            if (n >= big) {
                big = n;
            }
            if (n <= small) {
                small = n;
            }
        }
        System.out.println("Biggest number = " + big);
        System.out.println("Smallest number = " + small);
    }
}
