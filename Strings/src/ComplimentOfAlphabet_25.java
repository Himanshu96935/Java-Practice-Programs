import java.util.*;
public class ComplimentOfAlphabet_25
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("enter a string in Uppercase:");
        String s = sc.nextLine();

        String result = "";

        for (int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                char comp = (char)(155 - ch);
                result += comp;
            } else {
                result += ch;
            }
        }
        System.out.println("compliment of a String = " + result);
    }
}
