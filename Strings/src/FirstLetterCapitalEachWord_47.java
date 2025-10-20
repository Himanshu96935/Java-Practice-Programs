import java.sql.SQLOutput;
import java.util.*;
public class FirstLetterCapitalEachWord_47
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("enter a sentence:");
        String sentence = sc.nextLine().toLowerCase();

        String result = "";
        boolean newWord = true;

        for (int i = 0; i < sentence.length(); i++)
        {
            char ch = sentence.charAt(i);

            if (ch == ' ')
            {
                result += ch;
                newWord = true; // as next word character start
            } else {
                if (newWord) {
                    result += Character.toUpperCase(ch);
                    newWord = false;
                } else {
                    result += ch;
                }
            }
        }
        System.out.println("Formatted Sentence : ");
        System.out.println(result);
    }
}
