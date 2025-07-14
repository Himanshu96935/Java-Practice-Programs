import java.util.*;
public class FourDigitPalindrome15
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);

        System.out.println("enter 4digit number");
        int num = sc.nextInt();

        int a = num % 10;
        int b = (num / 10)%10;
        int c = (num / 100)%10;
        int d = (num / 1000)%10;
        int r = a*1000 + b*100 + c*10 + d;

        if (r==num)
        {
            System.out.println("palindrome number");
        }
        else
        {
            System.out.println("not a palindrome number");
        }
    }
}
