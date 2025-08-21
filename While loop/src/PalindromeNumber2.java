import java.util.*;
public class PalindromeNumber2
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n, r = 0, x;
        System.out.println("Enter a number to check whether it is Palindrome or not:");
        n = sc.nextInt();
        int original = n;
        while (n != 0)
        {
            x = n % 10;
            r = r * 10 + x;
            n = n / 10;
        }
        if (r == original) {
            System.out.println("It's a palindrome number.");
        } else {
            System.out.println("Not a palindrome number.");
        }
    }
}
