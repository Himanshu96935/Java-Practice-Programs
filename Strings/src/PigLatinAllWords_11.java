import java.util.*;
public class PigLatinAllWords_11
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String s = sc.nextLine() + " ";

        String words = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != ' ') {
                words += ch;
            } else {
                if (words.length() > 0) {
                    if (words.length() == 1) {
                        System.out.print(words + "a ");
                    } else {
                        System.out.print(words.substring(1) + words.charAt(0) + "a ");
                    }
                }
                words = "";
            }
        }
    }
}
