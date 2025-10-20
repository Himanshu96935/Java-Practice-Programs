import java.util.*;
public class CodingDecoding_48
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("enter a string : ");
        String s = sc.nextLine();

        String result = "";

        for (int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);

            if (Character.isDigit(ch))
            {
                int num = ch - '0'; // converting char to int 
                num += 2;
                result += num;
            } else if (Character.isUpperCase(ch)) {
                char newChar = (char) (ch + 2);
                if (newChar > 'Z') {
                    newChar = (char)(newChar - 26);
                }
                result += newChar;
            } else if (Character.isLowerCase(ch)) {
                char newChar = (char)(ch + 2);
                if (newChar > 'z') {
                    newChar = (char)(newChar - 26);
                }
                result += newChar;
            }
        }
        System.out.println("new character: " + result);
    }
}
