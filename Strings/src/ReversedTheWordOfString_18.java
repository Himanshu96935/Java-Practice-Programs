import java.util.*;
public class ReversedTheWordOfString_18
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("enter the sentence:");
        String s = sc.nextLine() + " ";

        String word = "";

        for (int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if (ch != ' ') {
                word += ch;
            } else {
                for (int j = word.length()-1; j >= 0; j--) {
                    System.out.print(word.charAt(j));
                }
                System.out.print(" "); // printing space after each reversed word
                word = ""; //empty for next word
            }
        }

    }
}
