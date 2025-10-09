import java.util.*;
public class PercentageOfAlphabetsDigitsVowels_31
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("enter a String");
        String s = sc.nextLine().toLowerCase();

        int alphabets = 0, vowels = 0, digits = 0;
        int total = s.length();

        for (int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);

            if (Character.isLetter(ch)) {
                alphabets++;

                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                }
                }
            else if (Character.isDigit(ch)) {
                digits++;
            }
        }
        double alphaPercent = (alphabets * 1.0 / total) * 100;
        double vowelPercent = (vowels * 1.0 / total) * 100;
        double digitPercent = (digits * 1.0 / total) * 100;

        System.out.println("Percentage of alphabets = " + alphaPercent);
        System.out.println("Percentage of vowels = " + vowelPercent);
        System.out.println("Percentage of digits = " + digitPercent);
    }
}
