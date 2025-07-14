import java.util.*;
public class TwoDigitPalindrome
{
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);

        //input 2 digit number:
        System.out.println("enter 2 digit number");
        int num = sc.nextInt();

        int a = num % 10;
        int b = num / 10;
        int r = (a * 10) + b;

        if (r == num) {
            System.out.println("palindrome number");
        } else
        {
            System.out.println("not palindrome number");
        }
    }
}
