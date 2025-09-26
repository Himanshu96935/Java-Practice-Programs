import java.util.*;
public class Palindrome_UsingAnotherMethod
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a string:");
        String s = sc.next();
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome (String s)
    {
        for (int i = 0; i < s.length()/2; i++) {
            if (s.charAt(i) != s.charAt(s.length()-1 -i))
                return false;
        }
        return true;
    }
}
