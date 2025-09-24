// Program to take input string and print it back after removing vowels from it.
import java.util.*;
public class RemoveVowels_5
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Input a string:");
        String s = sc.nextLine();

        String result = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u' &&
                ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U') {
                result += ch; // Here I am adding only non - vowels.
            }
        }
        System.out.println("String without vowels = " + result);
    }
}
