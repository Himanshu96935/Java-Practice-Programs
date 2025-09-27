import java.util.*;
public class BiggestWord_12
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter a sentence:");
        String s = sc.nextLine() + " ";

        String word = "";
        String biggestWord = "";
        int size, big = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != ' ')
            {
                word += ch;
            } else {
                size = word.length();

                if (size >= big) {
                    big = size;
                    biggestWord = word;
                }
                word = "";
            }

        }
        System.out.println("Biggest word in a sentence = " + biggestWord + " and length = " + big);
    }
}
