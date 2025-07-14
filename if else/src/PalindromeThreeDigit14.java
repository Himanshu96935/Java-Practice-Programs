import java.util.*;
public class PalindromeThreeDigit14
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter 3digit number:");
        int num = sc.nextInt();

        int a = num % 10;
        int b = (num / 10) % 10;
        int c = num / 100;
        int r = (a*100) + (b*10) + c;

        if (r == num)
        {
            System.out.println("palindrome number");
        }
        else
        {
            System.out.println("not palindrome number");
        }
    }
}
