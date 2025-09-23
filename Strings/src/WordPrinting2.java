import java.util.*;
public class WordPrinting2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine() + " ";

        String word = "";
        for (int i = 0; i <sentence.length(); i++) {
            char ch = sentence.charAt(i);

            if (ch != ' ') {
                word = word + ch;
            } else {
                System.out.println(word);
                word = "";
            }

        }
    }
}
