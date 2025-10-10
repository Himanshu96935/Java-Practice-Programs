import java.util.*;
public class ReplacingParticularCharacters_34
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a String");
        String s = sc.nextLine();

        String result = "";

        for (int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);

            if (ch == 'A' || ch == 'a') {
                ch = 'e';
                result += ch;
            } else if (ch == 'E' || ch == 'e') {
                ch = 'i';
                result += ch;
            } else if (ch == 'I' || ch == 'i') {
                ch = 'o';
                result += ch;
            } else if (ch == 'O' || ch == 'o') {
                ch = 'u';
                result += ch;
            } else if (ch == 'U' || ch == 'u') {
                ch = 'a';
                result += ch;
            } else {
                result += ch;
            }
        }
        System.out.println(result);
    }
}
