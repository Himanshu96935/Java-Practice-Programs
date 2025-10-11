import java.util.*;
public class AlterNextToVowel_OnlyString_35
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("enter a string:");
        String s = sc.nextLine();

        String result = "";

        for (int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);

            //if vowel and not last char:
            if (isVowel(ch) && i < s.length() - 1)
            {
                char next = s.charAt(i + 1);

                //flipping case of next char:
                if (Character.isUpperCase(next)) {
                    next = Character.toLowerCase(next);
                } else if (Character.isLowerCase(next)) {
                    next = Character.toUpperCase(next);
                }

                result += ch;
                result += next;

                i++;
            } else {
                result += ch;
            }
        }
        System.out.println("Altered string : " + result);
    }

    public static boolean isVowel (char c)
    {
        return "AEIOUaeiou".indexOf(c) != -1;
    }
}
