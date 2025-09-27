import java.util.*;
public class ReverseBiggestWord_13
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("ENTER A SENTENCE:");
        String s = sc.nextLine() + " ";

        String word = "", biggestWord = "";
        int lnth, big = 0;

        for (int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if (ch != ' ') {
                word += ch;
            } else {
                lnth = word.length();
                if (lnth >= big) {
                    big = lnth;
                    biggestWord = word;
                }
                word = "";
            }
        }
        System.out.println("Reverse of Biggest word : " + revrseOfBiggest(biggestWord));
    }
    public static String revrseOfBiggest (String word)
    {
        String rev = "";
        for (int i = word.length()-1; i >= 0; i--)
        {
            char ch = word.charAt(i);
            rev += ch;
        }
        return rev;
    }
}


