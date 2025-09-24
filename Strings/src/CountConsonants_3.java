import java.util.*;
public class CountConsonants_3
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a String:");
        String s = sc.nextLine().toLowerCase();

        String vowels = "aeiou";
        int c = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch >= 'a' && ch <= 'z' && vowels.indexOf(ch) == -1) {
                c++;
            }
        }
        System.out.println("Number of constants = " + c);
    }
}
