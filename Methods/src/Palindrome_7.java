import java.util.*;
public class Palindrome_7
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        checkPalindrome(num);
    }

    public static void checkPalindrome(int num)
    {
        int r = 0;
        int temp = num;
        while (temp != 0) {
            int x = temp % 10;
            r = r * 10 + x;
            temp = temp / 10;
        }
        if (r == num) {
            System.out.println("Palindrome number");;
        } else {
            System.out.println("Not a Palindrome number");
        }
    }
}
