import java.util.*;
public class Palindrome_8
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter a string:");
        String s = sc.nextLine();
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev += s.charAt(i);
        }
        if (s.equalsIgnoreCase(rev)) {
            System.out.println("String is palindrome.");
        } else {
            System.out.println("String is not palindrome");
        }

    }
}
