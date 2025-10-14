import java.util.*;
public class PalindromeCount_38
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a sentence:");
        String s = sc.nextLine() + " ";

        String word = "";
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch != ' ') {
                word += ch;
            } else {
                if (isPalindrome(word)) {
                    count++;
                }
                word = "";
            }
        }
        System.out.println("Number of palindrome words in a sentence = " + count);
    }

    public static boolean isPalindrome(String word)
    {
        String rev = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            rev += word.charAt(i);
        }
        return (word.equalsIgnoreCase(rev));
    }
}
