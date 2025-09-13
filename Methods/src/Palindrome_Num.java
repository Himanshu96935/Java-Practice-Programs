import java.util.*;
public class Palindrome_Num
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        if (isPalindrome(n)) {
            System.out.println("Palindrome number");
        } else {
            System.out.println("Not a Palindrome number");
        }
    }

    public static boolean isPalindrome(int num)
    {
        int temp = num;
        int rev = 0;
        while (temp != 0) {
            int digit = temp % 10;
            rev = rev * 10 + digit;
            temp = temp / 10;
        }
        return rev == num;
    }
}
