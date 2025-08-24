import java.util.*;
public class CheckBiggestSmallestDigit_13
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter a number:");
        int n = sc.nextInt();
        int digit, big = 0, small = 9;
        while (n != 0)
        {
            digit = n % 10;
            if (digit > big) {
                big = digit;
            }
            if (digit < small) {
                small = digit;
            }
            n = n / 10;
        }
        System.out.println("biggest = " + big + " , smallest = " + small);
    }
}
