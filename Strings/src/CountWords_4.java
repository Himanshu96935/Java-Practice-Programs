import java.util.*;
public class CountWords_4
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter a string:");
        String s = sc.nextLine() + " ";

        String word = "";
        int i, c = 0;

        for (i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch != ' ') {
                word += ch;
            } else {
                c++;
            }
        }
        System.out.println("Number of words in a string = " + c);
    }
}
