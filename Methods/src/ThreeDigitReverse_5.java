// Input 3-digit number and print it in reverse order.
import java.util.*;
public class ThreeDigitReverse_5
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter 3 digit number:");
        int num = sc.nextInt();
        int rev = reverseOf(num);
        System.out.println("Reverse = " + rev);
    }

    public static int reverseOf(int num)
    {
        int rev, last, mid, first;
        last = num % 10;
        mid = (num / 10) % 10;
        first = num / 100;
        rev = (last * 100) + (mid * 10) + first;
        return rev;
    }
}
