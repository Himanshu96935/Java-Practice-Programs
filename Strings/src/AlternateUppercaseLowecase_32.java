import java.util.*;
public class AlternateUppercaseLowecase_32
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("enter a string");
        String s = sc.nextLine();

        int count = 0;
        String result = "";

        for (int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);

            if (Character.isLetter(ch)) {

                if (count % 2 == 0) {
                    result += Character.toUpperCase(ch);
                } else {
                    result += Character.toLowerCase(ch);
                }
                count++;
            } else {
                result += ch;
            }
        }
        System.out.println("Strings with alternate characters in Uppercase and Lowercase : " );
        System.out.println(result);
    }
}
