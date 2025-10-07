import java.sql.SQLOutput;
import java.util.*;
public class NumberOfVowels_30
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("enter a string:");
        String s = sc.nextLine();

        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = Character.toLowerCase(s.charAt(i));


            switch (ch) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    count++;
                    break;
            }
        }
        System.out.println("Number of vowels in the String = " + count);
    }
}
