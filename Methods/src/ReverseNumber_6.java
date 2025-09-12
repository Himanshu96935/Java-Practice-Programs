//Input number and print its reverse:
import java.util.*;
public class ReverseNumber_6
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int reversed = reverse(num);
        System.out.println("Reverse of a number = " + reversed);
    }

    public static int reverse(int num)
    {
        int rev = 0;
        while (num !=0)
        {
            int x = num % 10;
            rev = rev * 10 + x;
            num = num / 10;
        }
        return rev;
    }
}
